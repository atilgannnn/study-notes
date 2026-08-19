namespace DersNotlari.Ders17
{
    public class Ders17Notes
    {
        // ? Bugun projeye kaldigimiz yerden devam ettik ve artik oyunlastirma tarafina girmeye basladik.
        
        // $ FarmArea icin Mesh Collider'i Box collider a donusturduk.
        
        // ! Burada yazdigimiz kodlari daha moduler bir duzende yazmaya ozen gosteriyoruz.
        
        /*
         * Intyerface'ler bilgisayara takili USB'ler gibi calisir.
         * Etkilesime giren nesneler (classlar) USB takili mi diye bakar yani Interface takili mi diye bakar.
         * Eger varsa icerisindeki kodu calistirir.
         */
        
        // @ Ayri ayri FarmArea, Vegetable ve Seed scriptlerimizi olusturduk.
        
        /*
         * Sahnedeki character e gelip icerisinde empty object olusturuyoruz ve buna bir gizmo verip characterin kafasinin ustune tasiyoruz.
         * Adini da gizmolu empty object'in itemPosition veriyoruz.
         * Ardindan CharacterController'a gelip [SerializeField] private Transform itemPosition; olusturuyoruz.
         * Daha sonra sahnedeki bu gizmo verdigimiz empty object itemPosition'i surukleyerek olusturdugumuz SerializeField itemPosition icerisine atiyoruz.
         
         * Simdi Charactercontroller icerisinde bir de private void AttachItem(GameObject item) adinda bir parametreli bir fonksiyon olusturduk.
         * Bunun goreci seed e yaklastigimizda seed i alip characterin kafasinin ustune yerlestirmek.
         * Yani gelen objenin transform.position i bizim olusturdugumuz itemPosition.position i olacak sekilde setliyoruz.
         * Ardindan bunu Seed icerisinde olusturdugumuz OnTriggerEnter icerisinde AttachItem'i cagirarak setliyoruz.
         * Ama bir sorunla karsilastik. Seed karakterin kafasinin ustune geliyor ama onunla beraber hareket etmiyor.
         * Bunun sebebi seed i almamiza ragmen hala parentinin character olmamasi.
         * Bunu yapabilmek icin de AttachItem(GameObject item) icerisinde item.transform.parent = transform; seklinde duzenliyoruz.
         * 3 seed i de aldim ama hepsi ic ice gecti stacklenmedi.(Ust uste binmedi)
         * Bunun icin de bir GameObject listesi olusturup adini _itemsList; dedik.
         * [SerializeField] private List<GameObject> _itemsList = new(); seklinde bu degiskeni tanimladik cunku editorden surukle birak yapmiyorsak bir SerializeFiled new() denerek esitlenmek zorundadir!
         * AttachItem icerisinde _itemsList.Add(item); diyoruz.
         * Hala ic ice geciyor. Sebebi su : Ben bir item aldiktan sonra ikinci item _itemsList'in eleman sayisi kadar olacak. Yani x ve z degerleri ayni kalacak ama y degeri buna gore atanacak.
         * Bunu soyle sagladik :
         * Vector3 desiredPosition = new Vector3(itemPosition.position.x, itemPosition.position.y + _itemsList.Count, itemPosition.position.z)
        */
        
        // ! Simdi de seed leri FarmArea'ya ekmek icin UsedTheSeed(FarmArea targetFarm) adinda bir fonksiyon olusturduk.
        // ! Bunu da FarmArea class i icerisinde OnTriggerEnter'da cagirdik. 
        
        /*
            public void UseTheSeed(FarmArea targetFarm) 
            {
                 int lastIndex = _itemsList.Count -1;
                 _itemsList[lastIndex].transform.position = targetFarm.transform.position;
                  _itemsList[lastIndex].transform.parent = targetFarm.transform;
                              
                 Collider itemCollider = _itemsList[lastIndex].GetComponent<Collider>();
                 itemCollider.enabled = false;
                              
                 _itemsList.RemoveAt(0);
            }
         */
        
        // # Ekilen seedlerin vegetable lara donusmesi gerekiyor. Simdi bunun icin ayarlamalar yapiyoruz.
        
        // --> FarmArea'da vegetablePrefab i SerializeField olarak aliyoruz.
        // --> [SerializeField] private GameObject vegetablePrefab;
        // --> Ancak ekilen tohumlar yok olmuyor. Bunu saglamak icin de Destroy yapiyoruz ilgili yerlerde.
        
        /*
         * Olusturdugumuz kodda Character seed, vegetable ve FarmArea ile etkilesime giriyor ancak bunlarin hepsini OnInteract() fonksiyonu yazarak bir interface icerisine alabiliriz ve aldik.
         * Boylece OnInteract() bizim etkilesime gectigimiz item e gore sekil degistirdi (polymorphism)
         * Ancak bizim characterin kafasinin ustunde hem seed hem vegetable tasiyabilmesini istiyoruz. bunun icin de BaseItem isminde bir parent class olusturup, Seed ve Vegetable i BaseItem'a extend ediyorum.
         * BaseItem'i abstract bir class yapiyoruz ayrica ki virtual OnInteract() fonksiyonu olusturup bunu da cocuklar tarafindan override edilebilen bir hale getiriyoruz. 
         */
        
        // # TYPECASTING IN C#
        // --> C# da Type Casting yaparken childlara yapilabilir. Parent a Typecast yapilamaz!
        // --> Mesela Seed targetSeed = interactedCharacter.GetItemList()[lastIndex] as Seed;
        // ! Yukarida interactedCharacter icerisinde GetItemList hem vegetable hem seed barindiriyor ama ben geleni Seed olarak al diyorum!
        
    }
}