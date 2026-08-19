namespace DersNotlari.Ders24
{
    public class Ders24Notes
    {
        // ? Bu derste son kontrollerimizi yapip projemizi tamamladik.
        
        // @ Oncelikle oyunumuza arka plan, ayak sesi, tohum ekme ve urun toplama ile urun yerlestirme sesleri ve urun satildiginda olusacak kasa sesi ekledik.
        // $ Ilgili itemlar icerisinde de bu ses dosyalarini verebilecegimiz degiskenleri olusturduk.
        
        /*
         * AutoDestroy adinda bir script olusturduk ve bunu shelf e atadik ki urun birakildiktan sonra ses dosyasi destory olabilsin.
         * Background auido disinda tum seslerin play on awakelerini kapattik.
         */
        
        // # Asynch Test Nedir?
        
        // --> Oyunlar genelde tek islemci ile calisir ve her eylem teker teker yapilir. Bunun da sebebi seri bagli elektrik duzeninin olmasi
        // --> Ekran kartlari ise paralel bagli devrelerdir. Islemci kadar hizli degil ama cok fazla islem yapabilirler.
        // --> Eger islemcide es zamanli birden fazla islem yapilmak isteniyorsa threadler bolunur. Yani game thread den cikilarak baska bir thread daha kullanilir.
        // --> Burada Race Condition dedigimiz sey ortaya cikar. Yani iki islem ayni anda yapilirsa hem game thread hem de baska bir thread beraber calisir.
        // --> Bu ikisi es zamanli calisirken onemli olan islemler bittiginde tam ayni anda bu iki threadin birbirine baglanmasi gerekir.
        // --> Asynch (Asenkron) Testler burada devreye giriyor. Unity fonksiyonu gibi yazilan bu testleri gorursen bil ki orada thread management olayi ve Race Condition var!
        // @ Cok basit seylerde thread management YAPILMAZ! COK RISKLI!
        
        /*
         * UI Canvas ile TextMeshPro ile ana karakterin sahip oldugu parayi gosteren bir ekran olusturduk.
         * UIManager isminde bir script olusturup Canvasimiz icerisine UIManager i atiyoruz.
         * UIManager a static fonk ekleyip Awake ile Singleton yapiyoruz.
         * Ayri bir GameManager class i olusturup bunun icine de static fonk ekleyip Singleton yapiyoruz ve Awake ile bunu olusturuyoruz.
         * GameManager icerisinde UpdateCoin ve IsCoinEnough() fonksiyonlarini olusturup bunu Seed alirkenki checkleri yaparken kullaniyoruz.
         * Daha sonra bu classdaki islemleri TextMesh kisminda kontrol ederek Text updatelerini sagliyoruz.
         * Seedlerin her birinde ayri ayri pricelari harcanacak degerler olarak -10, -20 ve -30 gibi setliyoruz.
         * Ayni islemi vegetable lara da yaparak +20, +30 ve +40 gibi degerler veriyoruz.
         
         * Oyunumuzda kasada odeme yaptiktan sonra money bloklari olusturmak icin bir tane kubu para gibi sekillendirdik sahneye attik.
         * Sonra Money isimli bir script olusturduk.
         * Cash icerisinde money i cagirarak gerekli setlemeleri yaptik.
         * Paralarin birikecegi yere de empty objectler olusturarak paranin stacklenmesini sagladik.
         * Money objesinin icerisine money scriptini attik.
         * Money'nin Is Trigger'ini acarak parayla etkilesime girince parayi alabilecegimiz bir logic de olusturduk.
         
         * Karakterimiz tohum spawn kumesine gidince kamera kayiyor ve bambaska bir yere gidiyordu.
         * Bunun sebebi karakterle alakali.
         * Character scripti icerisinde calculatedPosition hesaplarken y degerini moveSpeed ile carpinca yercekimini(gravity) de movespeed ile carpiyor.
         * Bu sebepten dolayi kamera ve diger seyler ucup gidiyor.
         * Bunu duzelttigimizde sorun cozuldu.
         */
        
        // $ Basit oyun gelistirmelerde yazilan kodun dogru calistigi tamamen oyun dinamikleri icerisinde bazi pratik degisiklikler yapilarak test edilir.
        // $ Genis capli oyunlarda (AAA Games) ise Cheat Sheet yazilarak bu test ve kontrol yapilir.
        
        // $ Oyunlarda yol ciziminde genelde Spline Kullaniliyor. AssetStore'da bi tane Dreamteck Splines asseti var.
        
        
    }
}