namespace DersNotlari.Ders18
{
    public class Ders18Notes
    {
        // @ Bu derste Struct yapisini ve Getter - Setter yapilarini gorduk.
        // @ Ayrica Pass By Value vs Pass By Reference ile Property'leri de gorduk!
        
        /*
         * Oyunumuzda FarmArea'ya Seed ekerken olmus Vegetable lari alinca tohum characterin kafasinda en altta kaliyordu.
         * Bunu duzeltmek icin dizinin icerisinde herhangi bir Seed var mi kontrolu icin Seed donduren GetSeedFromList() adinda bir fonksiyon olusturduk.
         * Bu fonksiyonu FarmArea'da cagirdik.
         * Sorunum cozuldu ama Vegetable'lari aldigimizda en altta kalan seed ler ekilince karakterle vegetables arasinda bosluk kaliyor.
         * Yani gelen vegetable lar asagiya seed in oldugu indekse dogru kaymiyor.
         * Bunun icin de CharacterController icerisinde RefreshItemPositions() fonksiyonu olusturduk.
         */
        
        // $ Structure Mantigi Nedir?
        // $ Bu zamana kadar kodda degisken olustururken ayri ayri int, string veya float gibi degiskenler olusturarak deger atamasi yaptik.
        // $ Ancak Structure'lar bize birden fazla degiskeni tek bir cati altinda toplamamiza izin veriyorlar.
        // $ Structure'a ornek vermek gerekirse, mesela daha once kodda sikca kullandigimiz transform.position, transform.rotatin veya transform.scale ornek verilebilir.
        // $ Her ucunde de 3 degisken vardir. float turunde x, y ve z degiskenleri
        // --> Structure icerisinde sadece DEGISKEN degil, ayni zamanda FONKSIYON da tutabiliriz!
        
        // # Structure yapisi esasen C dilinde uretilip kullanilan bir yapi cunku C de class mantigi YOKTUR!
        
        // ! Structure'lar sinifin icerisinde OLUSTURULMAZLAR! Sinifin disinda OLUSTURULURLAR!
        // @ Structure icerisindeki degiskenleri tanimladiktan sonra bu degiskeni class icinde [SerializeField] diyerek Unity de deger set edilebilir hale getirdik.
        // @ Ancak field gelmedi deneyince. NEDEN?
        // --> Cunku Structure'i Unity de setlenir hale getirmek istiyorsak MUTLAKA sinif disindaki Structure'in uzerine [Serializeable] annotationi vermek ZORUNDAYIZ!
        // --> Structure'dan obje de olusturabiliriz. Mesela elimizde ShelSlot isminda bir structure var. Sunu diyebiliriz :
        // --> ShelfSlot slot = new ShelfSlot();
        
        // ? STRUCTURELAR GTA GIBI OYUNLARDAKI KARAKTERIN GELDIGI LEVELDAKI ELINDE BULUNAN LOOTLARI, PLAYER ADI VS VERILERINI KAYDETMEK ICIN KULLANILAN VE ALINAN DATAYI JSON DOSYASINA DONUSTUREN BIR YAPIDIR!
        // ? STRUCTURELAR OZELLIKLE DATA YAPILARINDA COK SIK KULLANILAN YAPILARDIR!
        
        // # Hem Structure hem de Class yapilarinda Getter ve Setter tanimlayabiliriz.
        
        /*
         * Sahnemde artik topladigim vegetable nesnelerini koymak uzere bir raf prefab i olusturdum. Daha sonra Scriptsa icerisinde Shelf scriptini olusturup prefabe component olarak verdim.
         * Shelf Class dosyasinda public struct Shelfslot {} adinda bir structure olusturdum.
         * CharacterController icerisinde Vegetable lari listeden almak icin bir fonksiyon yazdik adi GetVegetableFromList()
         * Bu tek tek _itemList icerisinde gezip Vegetable lari alir.
         * 
         */
        
        // @ Pass By Value Nedir?
        // --> Bir degiskenin degerinin ilk (orijinal) tanimindaki degeri degistirmez. bir kopyasini olusturur ve kopyayi gonderir.
        // --> Boyama kitabinin kopyasini veriyorum. Orijinaline dokunmuyor.
        
        // @ Pass By Reference Nedir?
        // --> Bir degiskenin ilk degerini korur ve orijinal degiskeni dondurur.
        // --> Boyama kitabinin kendisini veriyorum. Orijinaline dokunuyor.
        
        // # PROPERTY NEDIR?
        
        // ? Property ler private degiskenleri okuyabilmek icin veya setleyebilmek icin kullandigimiz yapilardir.
        // ? Property'ler tipki normal getter ve setter lar gibidir. Yalnizca bazi farklari vardir.
        // --> Biz manuel olarak getter ve setter olusturabiliyoruz. Ancak bir property yalnizca getter ile veya hem getter hem de setter ile olusturulur.
        // --> Yalnizca setter i olan bir property olusturmamiza C# izin VERMEZ!
        // --> Mesela private string _name adinda bir degiskenimiz var. Bunun property'si soyle olur : 
        // --> public string Name {get; set;}
        // --> Property'ler ayrica setter degerleri modifiye etmemize de olanak tanir.
        // --> Mesela private int _age; degiskeninin setter'inda _age = value diyebildigimiz gibi _age = value + 5 de diyebiliriz.
        // @ Propertylerin adi degisken adinin ilk harfinin buyuk oldugu sekilde yazilir yukarida oldugu gibi.
        
        
        
        
        
        
    }
}