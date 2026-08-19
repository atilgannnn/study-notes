namespace DersNotlari
{
    public class Ders25Notes
    {
        // ? Bu derste 2D Projemize basladik ve proje kurulumu ile bircok mekanigi tamamladik.
        
        
        
        // # Projeyi olustururken aslinda 2D olarak da baslatabiliriz ama Unity Hub da 3D olarak projeyi actik.
        // # 3D de proje olusturduktan sonra yaptigimiz tek sey 2D gorunume gecmek !
        
        // @ Unity Asset Store'dan 2D ye uygun assetlerimizi indirdik ve projeye ekledik.
        // @ Unity de 3D project icerisinde 2D oyun yapmaya karar verdigimizde 3D objelerin hepsini gorebiliyoruz ama 2D objeleri goremiyoruz.
        // @ Bunu cozmek icin Package Manager > Unity Registry'ye girip 2D Sprite'i gorecegiz. Bunu motora kurmamiz gerekiyor.
        // @ 2D ler Sprite Editor ile calistigi icin 2D Sprite'in eklenmesi cok onemli !
        
        // $ 2D Objects'de 2D Sprite kurulumundan sonra cube, capsule vs objelerini artik gorebiliyoruz.
        // # Indirdigimiz 2D Assetlerde Unity su sekilde calisiyor : 
        // --> Indirdigimiz assetler tek dosyada 12 kare karakter olarak gorunuyor.
        // --> Unity bunlarin toplu tek dosyada atilmasina ve Unity motorunda bolunmesine izin veriyor. Bizim bunlari slice yapmamiz gerekiyor.
        // --> Sahneye eklenen asset Sprite Renderer ile geliyor.
        // --> Indirilen assetlerde mesela characterin Idle animasyonuna gidiyoruz. Istedigimiz versiyonu 1x veya 2x veya hangi versiyon ile geldiyse onu seciyoruz.
        // --> Secilen versiyona tikladigimizda Inspector paneli aciliyor. Acilan panelde Sprite Mode'u once Single'dan Multiple'a ceviriyoruz.
        // --> Ardindan alttaki Open Sprite Editor butonuna basip acilan pencerede Slice'i tikliyoruz.
        // --> Sonra tekrar sag alt kosedeki Slice'a tiklayip Apply diyoruz ve karakterimizin animasyon dosyasinda tam hizali bir bicimde bolundugunu goruyoruz.
        
        // $ Unity de bu bolunen karakter animasyonlarini dosyamdan tek tek secip topluca sahneye surukleyip attigimda Unity bunu bir Animasyonmus gibi kabul edip animasyon ve Animator dosyalari olusturuyor.
        // $ Projemizde Assets iserisine 2DGame isimli bir klasor olusturuyorum ve icerisine Animations diye bir klasor aciyorum.
        // $ Biz de bu sekilde Idle, Run ve jump icin bu islemi sirasiyla uygulayip AN_Idle, AN_Jump ve AN_Run animasyonlarini Animations icerisinde olusturuyoruz.
        // $ Ancak otomatik olusturulan animatorlere ihtiyacimiz yok. bunlari siliyoruz ve bir tane AC_2DCharacter isminde kendi elimizle bir animator olusturuyoruz.
        
        // # AN_Idle, AN_Jump ve AN_Run animasyonlarimizi AC_2DCharacter animatorunun icerisine surukle birak yaparak atiyoruz.
        // # AC_2DCharacter animatorumuzde Idle ve Run arasinda karsilikli transitionlar olusturuyoruz. Ayni sekilde Idle ve Jump arasinda da karsilikli transitionlar olusturuyoruz.
        // # Ancak Run dan Jump a transition olusturup tersini olusturmuyoruz. (Jump dan Run a gecis yok!)
        // # Idle dan Run a veya Run dan Idle a gecerken Float turunde bir "MoveSpeed" parametresi olusturduk ve bunu SetFloat ile CharacterController da setledik.
        // # Idle dan jump a gecerken veya Run dan Jump a gecerken kontrolu saglamak icin de Trigger turunde bir Jump parametresi olusturduk.
        // # Jump dan Idle a gecerken boyle bir kontrol saglamadik. Onun yerine Has Exit Time i tum transitionlarda kapattik ama Jump dan Idle a gecerken acik tuttuk.
        
        // @ Character Prefab i yapmak icin 2DGame icerisinde Prefabs isimli bir klasor olusturuyorum.
        // @ Idle animasyonunu olusturur gibi Idle daki tum kareleri secip surukleyerek sahneye atiyorum. Adini silinecek koyuyorum.
        // @ Karakterim sahneye geldi ama Animations icerisinde animator ve animation da olustu. Bu iki silinecek isimli dosyayi siliyorum.
        // @ Sahnedeki karakter ismini MainCharacter olarak degistiriyorum. Animatorunu de biraz once kendi elllerimizle olusturdugumuz AC_2DCharacter olarak degistiriyorum.
        // @ MainCharacter'i Prefabs icerisine surukleyip birakiyoruz.
        // @ Ardindan 2DGame icerisinde Scripts isimli bir klasor olusturuyoruz.
        // @ Icerisinde de CharacterController isimli bir script olusturuyoruz ve bu scripti component olarak MainCharacter e veriyoruz.
        
        /*
         * Indirdigimiz paketten istedigimiz background resimlerini sahneye ekliyoruz.
         * Assetteki Tiles klasoru icerisinden de kullanmak istedigimiz tile lari kullaniyoruz.
         * 2D ve 2.5D olarak secenekler var. 2.5D de zeminde biraz daha 3D hissiyati veren bir golgelendirme calismasi yapildigi icin 2.5D sectik.
         * 2D oyunlarda da collider ve rigidbody ekliyoruz ama rigidbody 2D ekliyoruz.
         * 2D oyunlarda da collider eklerken Polygon Collider da ekleyebiliriz. Polygon Colliderlar 3D deki Mesh colliderlar gibi calisir yani karakterin veya nesnenin seklini alir.
         * Sectigimiz Tile dan bir zemin olusturacagiz ama once Tile i prefab yapiyoruz.
         * Game sekmesindeki kamerayi da 16:9 Aspect yapiyoruz.
         * Simdi geldik MainCamera'ya. MainCamera'nin Inspector'dan ayarini Perspective den Orthographic'e ceviriyoruz.
         * Perspective = 3D ye daha uygun cunku derinlik (z eksenini) de ekler.
         * Orthographic = Genelde 2D de bu tercih edilir. X ve Y ekseninde hareket eder.
         * Orthographic sectikten sonra MainCamera'nin Size ayarini yapiyorum.
         * Background'un size ini genisletirken bir sey oldu. Background karakterin ve tile platformun onune gecti.
         * Bunun sebebi nedir? Her bir Sprite sahneye atildiginda bir layer a sahiptir yani bir katmana sahiptir.
         * Bunu duzeltmek icin Sprite Renderer da Order In Layer seceneginden bir deger veririz.
         * Bu deger genelde background icin -1 tile platform icin 0 ve MainCharacter icin 1 gibi bir degerdir.
         * Boylece MainCharacter 1. katmanda, Tile Platform 0. katmanda ve Background da -1. katmanda setlenmis oldu.
         */
        
        // # MainCharacter icerisinde SerializeField olarak moveSpeed ve jumpForce olusturuyoruz.
        // # animator ve rigidbody yi de olusturuyoruz(RigidBody2D olmali cunku oyun 2D). Start icerisinde bu componentlere ulasiyoruz.
        // # Update fonksiyonu icerisinde de float horizontal = Input.GetAxis("Horizontal"); aliyoruz.
        // # Space tusu icin de ziplama ayarini yapiyoruz.
        // # MainCharacter e Unity motorunda elle move ve jump seed giriyorum.
        // # Bu projede de eski input sistemini kullandigimiz icin Project Settings > Player > Active Input Handling'den Input Manager (Old) seciyoruz yine.
        // # Karakter sahnede takildi takla atti. Contraints kismindan karakterin Freeze Rotation Z sini tiklayip kapatiyoruz.
        // # Oyunlarda genelde karakter icin ayri bir sola donus yapilmaz. Onun yerine karakterin x deki Scale degeri -1 ile carpilarak sola donus saglanir.
        // # Biz de update fonk icerisinde bunu setliyoruz. Ama bir problemle karsilastik. Karakter saga ve sola donuyor ancak elimizi tustan cekince cizgi gibi duruyor.
        // # Bunun temel sebebi bizim horizontal'i alirken GetAxis kullanmamiz. Bunun yerine bu donusu gerceklestirmek icin GetAxisRaw ile ayri bir degisken icerisinde almamiz gerekir.
        
        // @ GetAxis ve GetAxisRaw arasindaki fark nedir?
        // $ Bunun icin soyle bir ornek verelim. Karakter iki deger arasinda gecis yapiyor saga sola donerken veya hareket ederken.
        // $ Tusa basarken 1 parmagimizi tustan kaldirinca da 0 degeri. Yani her sey 0 ve 1 arasinda gecislerde yasaniyor.
        // --> GetAxis() : 0 dan 1 e gecerken kademeli artarak gecer. 0.3 0.5 0.7 gibi gibi artislarla gecer veya azalirken de boyle azalir.
        // --> GetAxisRaw() : 0 dan 1 e instant yani ani gecis yapar. Yavas yavas artma ve azalma yoktur.
        // ? Biz oyunda bu gecisi GetAxis le aldigimiz icin yavas yavas artip azaldi o yuzden cizgi gibi parmagimizi tustan cekince sahnede durdu.
        
        // % MainCharacter icerisinde Update fonksiyonunda SetFloat ile MoveSpeed i setliyoruz ama gonderdigimiz degeri yani horizontalRaw degerini Mathf.Abs() ile gonderiyoruz.
        // % Neden ? Cunku horizontalRaw bana 1 ile -1 arasinda bir deger donduruyor ve ben bunun mutlak degerini almak zorundayim kosmaya gecmek icin.
        // % Cunku animatorde Idle dan Run a gecerken MoveSpeed Greater than 0 kosulu var, horizontalRaw degeri bunu saglamazsa animasyon calismaz.
        
        // $ Bu setlemelerden sonra sahne hiyerarsimde sag tiklayarak Cinemachine > Targeted Cameras > 2D Camera secip ekliyorum.
        // $ Tracking target olarak MainCharacteri surukleyip birakiyorum.
        // $ Burada Dead Zone isimli bir secenek var. Bu nedir?
        // $ Dead Zone karakter belirli bir hareket yaptiktan sonra kamera takip etsin ayarini yaptigimiz yerdir.
        // $ Mesela Super Mario'da kamera her anda hareket etmez. Dusmanlari gecip bir yere gelince kamera takip edip o gorunmeyen yere dogru kayar.
        
        // # Ben bir soru sordum : Mesela Feign gibi, Among Us gibi veya Goose Goose Duck gibi oyunlarda goruntu daha izometrik ve burada biz collider olarak ne kullanacagiz?
        // # Cevap : Polygon collider kullanacagiz. 3D de iskelet sisteminin her bir bilesenine ayri ayri collider eklendigi olur bazen 2D de de yapilir bu karakter etrafindaki nesneleri algilasin diye.
        // # 2.Sorum : Karakterimiz ates topu vs atan bir karakterse bu bize tek Sprite sheet olarak mi gelir ayri ayi mi gelir?
        // # Cevap : Ayri ayri gelir birlesik olmaz. 
        
       // % Oyunumuza bir adet tirmanmak icin platform ekledik. Buna daha sonra polygon collider verdik.
       // % Asset dosyasindaki Enemy klasorunden bir enemy cektik.
       // % Enemy'nin icerisinde animasyon olmadigi icin basit bir enemy sag sol hareketi ekledik enemy'ye.
       
       // @ EnemyController adinda bir script olusturduk ve Enemy icerisine component olarak attik.
       // @ EnemyController'da List<Transform> turunde patrolPoints degiskeni ve float moveSpeed ile GameObject obstaclePrefab olusturduk.
       // @ Bir tane de float turunde fireRate degiskeni olusturduk.
       
       // & Iki tane empty object arasinda Enemy git gel yapacak.
       // & Bu yuzden bir tane int _patrolIndex olusturduk.
       // & Karakterimizi hareket ettirebilmek icin Vector3 destination olusturmamiz gerekti.
       // & Hareketi saglamak icin Enemy _rigidbody2D degiskenini de olusturduk ve Start da bunu setledik.
       
       // # Karakterimize bir Bullet olusturup bunu prefab yaptik ve karakterimizde mouse sol tika basilinca spawn olmasini sagladik.
       // # MainCharacter'e gelip bunun icerisinde empty game object spawnTransform olusturuyorum.
       // # Bunu da CharacterController da olusturdugum spawnTransform degiskenine surukleyip birakiyorum.
       
       // $ Diger kisimlar icin de kodlari gozden gecirebilirsin :)
       
       
       
       
        
        
        
    }
}