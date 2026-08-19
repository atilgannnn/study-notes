namespace MarketSim.DersNotlari.Ders27
{
    public class Ders27Notes
    {
       // ? Bu derste Market Simulator oyunumuzun kurulum ve input ayarlarini yaptik.
       
       // # Universal 3D bir proje actik ve lokalde kaydedecek sekilde settinglerini ayarladik.
       // # Projemiz acildiktan sonra ilk once bos bir sahne uzerinde bazi setuplari yaptik.
       /*
        * Mixamo'dan karakterimizi sectik ve T-pose olarak indirdik.
        * Ardindan karakterimize Idle, walk, walk backwards, left strafe ve right strafe animasyonlarini da indirdik.
        * MarketSim isimli bir kalsor actik Assets icerisinde. Onun icerisine de Models kalsoru actik.
        * Sahneye bir tane plane attik ve MarketSim icerisinde materials klasoru actik.
        * Ardindan materials icerisine M_TestGround isimli bir material olusturduk ve checker secerek tiling i x=25 ve y=25 yaptik.
        * Bu materyali planeimize verdik.
        * Character modelimizi sahneye attik ama texture'lar render olmamis.
        * Bunu cozmek icin Materials icerisine Character isimli bir klasor actik.
        * Sahnedeki karakterimiz seciliyken ve material ayari Use Embedded Materials halindeyken Character inspector dan Extract Materials secenegini secip bunlari olusturdugumuz character klasorune indiriyoruz.
        * Assets kalsoru icerisine Textures isimli bir kalsor daha aciyoruz ve onun icine de character isimli bir klasor aciyoruz.
        * Buraya da character modelimizin Inspectoer>Materials kismindaki Extract Texture tusuna basarak texturelari cikariyoruz.
        * Sonra indirdigimiz texturelari karakterimize ekliyoruz ve her sey tamamlaniyor.
        */
       
       // $ MarketSim icerisinde Scripts isimli bir klasor aciyoruz ve icine InputManager isimli bir script atiyoruz.
       // $ Assets kalsoru icerisindeki InputActions i siliyoruz ve yerine sifirdan Marketsim icerisinde Inputs klasoru aciyoruz.
       // $ Icerisine Sag tik > Create > Input Actions diyerek yeni bir Input Actions olusturuyoruz ve adina IA_Player diyoruz.
       // $ Her Action Map icerisinde farkli farkli mapler olur.
       // $ Mesela character in normal hareketleri character map icerisinde, arac kullanirkenki hareketleri car icerisinde tanimlanir.
       
       // @ Actions icerisinde bir tane binding ekliyoruz. Bunu tanimlarken de Binding Pathé W-S-A-D harflerini ekliyoruz.
       // @ Ardindan InputManager scriptine geliyoruz ve bunu singleton yapiyoruz ve Awake ini olusturuyoruz.
       // @ SerializeField turunde PlayerInput olusturuyoruz.
       // @ MarketSim icerisinde Prefabs kalsoru olusturuyoruz ve karakteri Prefab yapiyoruz.
       // @ Ayrica sahnede bir tane empty InputManager objesi olusturup buna component olarak PlayerInput ekliyoruz (Add Component dan)
       // @ Bunun action kismina olusturdugumuz InputAction (IA_Player) veriyoruz. Default map i Character olarak ayarliyoruz.
       // @ Ayrica bu InputManager'a InputManager scripti component olarak veriyoruz.
       
       // % Input Manager icerisinde OnEnable ve OnDisable fonk olusturuyoruz ve event listener fonksiyonlari ekliyoruz (Hem move hem look icin ayri ayri).
       // % Input Action panelinde elle olusturdugumuz W-S-A-D leri sildik cunku bize vektor turunde yonlendirme lazim.
       // % Bunu saglamak icin de Move ve Look actionlarini ayri ayri olusturduk.
       // % Move icerisinde Add Up/down/Left/Right Composite adinda bir iki boyutlu vektor kompoziti olusturuyoruz.
       // % Bunlara da tuslari atiyoruz(W-S-A-D).
       
       // & CharacterController isimli bir script olusturduk ve main character e component olarak ekledik.
       // & Script icerisinde fieldlarimizi tanimliyoruz.
       // & MoveCharacter fonk icerisinde hareketini setliyoruz.
       // & W-S-A-D ye basili tuttugumuzda ama hareketi devam etmiyor. Tek sefer harekekt ediyor.
       // & Bunu cozmek icin CharacterController icerisinde Update fonk olusturup burada setlemeleri yapiyoruz.
       // & InputManager'a da Cancelled EventListenerlari fonksiyonlarini da tanimliyoruz.
       
       // # Aradan sonra sordugum 2 soru var : 
       
       // ! 1. SORU : 2D oyunda GetAxisHorizontal vs kullanarak ivme aliyorduk. Yeni input sistemindeki gecis nasil oluyor?
       // ! 2. SORU : UI da mesela item toplama icin Default e tanimladik ama oyuncu Q ile degistirmek istiyor bunu nasil yapariz?
       
       // & 1. SORU CEVABI : GetAxis'deki gibi yumusak bir gecis yeni Input Sisteminde yok dogrudan tak tak -1, +1 arasinda gecis var.
       // & 2. SORU CEVABI : Bu degisikligi Input Actions a ulasarak yaparsin, diger klasik turlusu zor. (Veya GetAxis lerle Input Settings den falan dedi hoca)
       
       // # Look Actionlar icin de value dondurecek sekilde ve Control Type'i Delta(Fark degeri) olarak setledik.
       // @ NEDEN DELTA (Δ) ? Cunku Vektor almak 1 ile -1 arasinda deger verir. Delta alinca mouse u x de 2 yonunde hareket ettirdik. Biraktik. Sifirlanmaz!
       // @ Ikinci mouse hareketimizde ilk pozisyonu yine 0 alir ve 0 a gore hep fark hesaplar.
       
       // # Look icine de Delta[Mouse] ekledik.
       // # Simdi de Look icin EventListenerlari tanimladik ve CharacterController icerisine LookCharacter fonk ekledik.
       // # Biz karakteri sadece Y de rotate edecegiz. Buna gore ayarlamalarimizi yapiyoruz.
       // # Yukari asagi rotate icin karakteri komple hareket ettirmemize gerek yok onun icin sadece kamerayi rotate etmemiz yeterli.
       // # Ekran ayarini 18:9 Aspect olarak setledik.
       
       // % Animasyonlari eklemek icin bir Blend Tree olusturuyoruz.
       // % Blend Tree icerisinde tum yon animasyonlarini atiyoruz.
       // % Animasyon gecislerindeki yumusakligi saglayabilmek icin de CharacterController icinde InterpolateMovement adinda bir fonk olusturduk.
       // % Kameramizi ilk kafa kemigine yerlestirdik ama boyle yapinca mide bulandirici bir goruntu hissi verdi.
       // % Bu yuzden biz de MainCharacter icerisine yerlestirdik ama pozition i kafada tuttuk.
       // % Yukari asagi kamera hareketini sirinlandirmak icin LookCharacter fonk icerisinde Clamp islemimizi yaptik.
       // % Quaternion lar 0 ile 360 arasinda calistigi icin bu degerler arasinda clampedX i Eulerangles'in x degeri olarak setliyoruz.
       
       
       
       
       
       
       
    }
}