namespace DersNotlari.Ders16
{
    public class Ders16Notes
    {
        // ? Bu derste ikinci projemiz olan Farm Market Arcade oyununa basladik.
        /*
         * Hoca burada bir projeye baslarken endustride karsilasilan bazi konulara degindi.
         * Bunlardan ilki projeye ya sifirdan (from scratch) baslanir.
         * Ikincisi ise Refactor(yeniden uretme/duzenleme) yapilir.
         * Turkiye refactor e pek meyilli degil (oyun cikis deadlinelari vs yuzunden) ancak refactorun de faydali oldugu zamanlar var.
         */
        
        // @ Bugun baslayacagimiz oyunun benzeri olarak My Perfect Hotel ve My Little Universe inceledik.
        // @ Endustride genelde su anlayis vardir :
        // --> Genelde tum oyunlarda ilk 10 dakika
        // --> Mobilde ilk 5 dakika cok onemlidir.
        // --> Bu sureler oyuncunun oyunu oynamaya devam etme suresini belirler.
        
        /*
         * Oyunlarda UI tarafi cok gozden kacan bir taraf ama oldukca onemli!
         * Cunku oturmus bir user experience var ve buna gore gelistiriciler oyunlari gelistiriyorlar.
         * Hangi sanat tarzinda ve hangi UX tarzinda kullanicilar oynuyor bununla ilgili bircok calisma ve benzer paketler var.
         * Projemiz mobil oyun oldugu icin 9:18 Aspect Ratio olarak kamerasi ayarlandi.
         * Mobil oyun yaparken ekrani tam ortanin biraz asagisindan bolerek bakacagiz yani 1 e 2 olarak dusunecegiz.
         * Asagidaki kisim oyuncunun eliyle bir seyleri kontrol ettigi alan olarak kabul edilir ve karakterin bu alanin yukarisinda kalmasi tercih edilir.
         * Main camerayi ayarladiktan sonra cinemachine i indirerek projeye yukledik.
         */
        
        // @ Burada once singleton mantigini ogrenecegiz !
        // ? Oyunlarda iki kavram cok karistiriliyor. Character ve Player. Farki Character oyundaki char, player da biziz (oyunu oynayan kisi)
        
        // --> PC de MouseButton lari (0) yapinca bu sol tiklama oluyor ama mobilde parmakla ekrana dokunma anlamina geliyor.
        // --> Yani mobil icin ayri bir tiklama vs girdisine ihtiyac yok.
        
        // ! Peki ekrana dokundugu esnada yonu nasil bulduracagiz?
        
        // @ Simdi bu konuda oncelikle asagidaki su mantigi anlamamiz gerekiyor : 
            // --> Oyuncunun ilk ekrana tikladigi position (A Pozisyonu) Mesela : (0,0)
            // --> Oyuncunun guncel ekrana tikladigi position (B Pozisyonu) Mesela : (5,0)
            // --> Bu iki konum arasindaki deltayi (∆) hesaplamak icin de B-A ile buluyoruz.
            //? Mobil oyunlar iki boyutlu oldugu icin Vector2 olarak first, current ve delta mouse positionlari aliyoruz!
        
        /*
         * CharacterController sinifi icerisinde MoveCharacter() isimli bir fonksyion olusturdum.
         * MouseButtonlarimdan aldigim delta degerini MoveCharacter'e gondermem gerekiyor.
         * Bunu normalde PlayerInput icerisinde Start() fonksiyonunda characterController = FindAnyObjectByType<charactercontroller>(); ile dependency injection yaparak cagirabilirim.
         * Ancak ben dependency yogunlugu istemiyorum ve bunun yerine eventleri kullanacagim.
         * Bunun yerine public Action<Vector2> OnPlayerMove eventi olusturuyorum ve bunu Invoke() ediyorum.
         */
        
        // ! PlayerInput'u Singleton yapabilmek icin PlayerInput icerisinde static bir Instance olusturuyorum.
        // ? Bir sinifin static instance i o sinifin icerisinde olusturulur !
        
        // --> public static PlayerInput Instance; seklinde static instance imi olusturdum.
        
        // ! Bunu yazdiktan sonra ayni class icinde Awake() fonksiyonu olusturmam lazim.
        // ! Ancak bunu yaparken sahneye bos Instance veya ayni Instance dan iki defa gelmesini engellemeiz gerekiyor.
        // @ Bunun icin asagidaki gibi bir tasarim yapiyoruz ! Asagida && kullan onemli! Hoca derse || yapti hata aldi sonra duzeltti!

        /* private void Awake()
         {
             if (Instance != null && Instance != this)
             {
                 Destroy(this);
             }
        
             Instance = this;
        }
        */
        
        // ? Oyunda GameObject acilip kapandigi icin OnEnable() ve OnDisable() fonksiyonlarimizi CharacterController icerisinde yaziyoruz!
        // Singleton yontemi sadece sahnede bir tane olan siniflar icin gecerli. Birden fazla olan siniflarda kullanmayin. Yaparsaniz bozulur!
        
        // @ Kodumuzu calistirdigimizda NullReferenceException aldik OnEnable() da.
        // @ Bunun sebebi OnEnable() fonksiyonunun Awake() den once calismasindan dolayi NullReference aliyoruz.
        // --> Bunu cozmek icin Edit > Project Settings > Script Execution Order a geliyoruz.
        // --> Acilan pencerede hangi script/sinif hangi sirada kac ms oncesinde calisacak onu gosteriyor.
        // --> Buraya PlayerInput'u ekliyoruz Default time in ustune ve hatamiz cozuldu.
        
        /*
         * Ayarlarimizi yaptik. Sag sol giderken sorun yok ama yukari asagi giderken one gitmesi gerekirken havaya kalkiyor karakter.
         * Bunun sebebi su : Biz su anda Vector2 olarak calisiyoruz. Vector2 (x,y) bulur.
         * X = Sag - Sol Y = Yukari - Asagi
         * Bunu cozmek icin :
         * Vector3 calculatedPosition = new Vector3(moveDirection.x, _rigidbody.linearVelocity.y, moveDirection.y); dedik.
         * Daha sonra da :
         * _rigidboyd.linearVelocity = calculatedPosition * moveSpeed; dedik.
         * Sorunum cozuldu ama bu sefer de baska bir sorun var :
         * Karakter hareket ederken cok hizli gidiyor.
         * Sebebi de su : Biz deltaMousePosition aldigimizda delta (∆) yani ilk ve mevcut pos farki surekli artiyor ve bu artisi biz bir de hizla carptigimiz icin cok hizli bir savrulma oluyor.
         * Bu tarz oyunlarda biz sunu yapmayi tercih ediyoruz :
         * Aldigimiz delta (∆) yon belirten bir konum vektoru. bu vektorlerde absurt rakamlara sahip olabiliyoruz.
         * Ancak bunu yon vektorune cevirirsek (yon vektorleri birim vektorlerdir ve -1 ile 1 arasinda deger alir)
         * Yani delta (∆) yi birim vektore cevirecegiz. Bunu Normalize() fonksiyonu ile yapiyoruz.
         * Karakterimizin kendi y sinde ilerlemesi icin Quaternion lookRotation = Quaternion.LookRotation(calculatedPosition); diyoruz.
         * lookRotation.x = 0;
         * lookRotation.z = 0;
         * transform.rotation = lookRotation; diyoruz
         */
        
        // ! Eger oyunda rotation adina bir yere kilitlenmek istiyorsak (character veya kule vs gibi), o zaman LookAt() kullanmak daha mantikli.
        
        // @ Eger Assetstore veya Mixamo da indirilen karakterlerin texture lari built-in olduklari icin URP de renderlanmiyorsa
        // @ Ve texture dosyalari bu sebeple pembe geliyorsa butun pembe materyalleri secip su adimi izle : 
        
        // --> Window > Rendering > Render Pipeline Converter > Material Upgrade > Initialize Converters > Convert Assets
        
        // ? Karakterimize Animator ekledik. Daha sonra Anmations adinda bir folder olusturduk ve icine bir Animator controller actik.
        // ? Daha sonra karakterimize animasyonlarini atadik.
        // ! Animasyonu her zaman karakterin iskelet sisteminin bulundugu klasore veriyoruz. Yoksa animasyon CALISMAZ!!!
        
        // @ Burada "Move" adinda bir degisken olusturduk Animator parameters da. Eger 0 dan buyuk olursa Walk animasyonu oynayacak, 0.1 den kucukse de Idle a gececek sakilde setledik.
        // --> ONEMLI : Move u MoveCharacter() fonksiyonu icerisinde setledik.
        // --> animator.SetFloat("Move", moveDirection.magnitude);
        
        // @ Peki neden magnitude aldik?
        // --> Cunku yon vektorunun hareket ettigi noktanin uzunlugunu almamiz gerekiyor. moveDirection bana yon veriyor birim vektor olarak.
        // --> Benim ihtiyacim olan ise birim vektorun baslangic noktasindan gittigi yone kadar olan uzunlugu. Bunu da magnitude ile aliyoruz.
        
        // ? Son olarak karakterimizin rotasyonu Vector3.zero ya gidiyordu tiklama durunca bunu da asagidaki sekilde yumusak bir gecis verecek sekilde duzenledik.
        
        // --> transform.rotation = Quaternion.RotateTowards(transform.rotation, lookRotation, 450 * Time.deltaTime);

    }
}