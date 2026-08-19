namespace DersNotlari.Ders22
{
    public class Ders22Notes
    {
        // ? Bu derste AI yapisini ve AI logic yazimini ogrendik.
        
        // @ AI'lari kullanirken anlamamiz gereken ilk sey NavMesh yapisidir.
        // @ NavMesh (NavigationMesh) AI'lar icin ifade ettigimiz bir kelimedir.
        
        // # Sahneye bir tane bos nesne attik adini da Basecustomer verdik. Icine hazir assetlerimizden bir customer secip attik.
        // # BaseCustomer'a Capsule collider verdik ve prefab yaptik.
        // ! Bu karakteri sahnede nasil hareket ettirecegiz?
        // --> Bunun icin Window > AI > Navigation a tikliyoruz. bu panel AI navigationlari icin kullanacagimiz panel. Sag tarafa Inspector'in yanina yerlestirdik.
        
        // # Sahnede baska bir Empty game object olusturduk ve adini NavManager verdik.
        // # Daha sonra NavManager Inspector'i icerisinde Add Component > Navigation > NavMesh Surface ekliyoruz.
        // # Bu NavMesh Surface ile AI karakterimiz nerelerde yuruyebilir nerelerde yuruyemez bunu hesaplatacagiz.
        // # Bunun icin de NavMesh Surface icerisindeki "Bake" butonuna basacagiz.
        // ! Bake edilen alanlari mavi renkle sahnede gorebilmek icin sahnenin sol alt kosesinde yer alan menuden faydalanacagiz.
        // ! AI Navigation menusunden Show NavMesh seceneginin tikli olmamasi halinde mavi renkli baked alan gorunmez, tikliyse gorunur.
        
        // ? Biz play e bastigimizda karakter kendiliginden yurumeye basladi. Buyuk olasilikla animasyon karakterde kendiliginden ayarlanmis halde.
        
        /*
         * Projemiz icerisinde bir tane AI klasoru olusturduk ve icerisinde de BaseCustomer adinda bir script olusturduk.
         * Sonrasinda bu scripti BaseCustomer a component olarak ekledik.
         * Sahneye bir tane daha empty object attik. Buna da PatrolPoints dedik. Icerisine de 7 tane empty object attik ve bunlara gizmo verdik.
         * Amacimiz bu noktalari sahnede bazi yerlere dagitip customer in bu noktalari navmesh ile ziyaret edip etmedigini gormek.
         * Bunun icin BaseCustomer icerisinde [SerializeField] private List<Transform> patrolPoints; tanimladik ki bu ziyaret noktalarini bu listeye surukleyip birakalim.
         * Bu noktada customer in navmesh e gore hareket edebilmesi icin tek bir eksik var.
         * AI da biz NavManager'a yurunebilir alanlari hesaplattik ve tanittik.
         * Ama henuz AI'a BaseCustomer'in NavMesh Agent oldugunu tanitmadik.
         * Bunu tanitabilmek icin de BaseCustomer Inspector'i icinde Add Component > Navigation > NavMesh Agent ekliyoruz.
         * Nav Mesh Agent kendi otomatik bir collider ile geldi. Bu yuzden onceden BaseCharacter'a verdigimiz capsule collider i kaldiriyoruz.
         */ 
        
        // --> NavMesh Agent componenti icerisinde bazi alanlar var onlarin neye yaradigindan da kisaca bahsedelim : 
        // $ Speed : AI karakterin hizini ayarlar.
        // $ Angular Speed : Acisal donus hizini ayarlar.
        // $ Acceleration : Ivmelenme. Karakterin zeminde kayma/kaymama olayi buradan ayarlanir.
        
        /*
         * NavMesh Agent i olusturduktan sonra patrolPointleri random olarak customerlarin gidisi icin atiyoruz.
         * Bunu int randomIndex=Random.Range(0, patrolPoints.Count) ile alip, navMeshAgent.SetDestination(patrolPoints[randomIndex].position); diyoruz
         * customer random noktalara gidiyor ama animasyon durmuyor. Bunu ve bunun gibi urunu alma, kasaya gitme ve marketten cikma hareketleri icin ayri ayri stateler olusturuyoruz.
         */
        
        // ! Burada BaseCustomer icin 4 temel coroutine tipinde state olusturuyoruz : 
        
        // --> PatrolState (Markette gezinme, random patrol atma)
        // --> CheckProductState (Urunleri rafta kontrol edip alma, shelf var mi yok mu ve urun var mi yok mu bilgisi)
        // --> CashState (Kasaya gidip odeme yapma, urunun kasada destroy edilmesi)
        // --> ExitState (Marketten ayrilma, BaseCharacterin destroy edilmesi)
        
        // @ Customer Statelerin hepsini BaseCustomer icerisinde CustomerState enum'i icerisinde tutuyorum.
        
        // $ Butun bu stateler arasindaki gecisi de kontrol etmek icin DeclareState() adindan bir fonksiyon olusturuyoruz.
        // $ DeclareState icerisinde de BaseCustomer'in hangi state de oldugunu switch case ile check ediyoruz.
        // $ BaseCustomer'in icerisinde empty object olusturup ProductTransform ismini veriyoruz ve kafasinin ustune konumluyoruz.
        // $ Boylece alinan urun customerin kafasinin ustunde gorunuyor.
        
        
        
        
    }
}