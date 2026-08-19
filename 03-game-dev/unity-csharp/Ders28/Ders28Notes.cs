namespace MarketSim.DersNotlari.Ders28
{
    public class Ders28Notes
    {
        // # Bu derste item build ve item rotate ile ilgili gelistirmelerimizi projeye ekledik.\\
        
        // $ Input Actions'da yer alan Interactions > Hold ne ise yarar?
        // & Hold basili tut bir sure sonra tepki ver gibi kullanilan bir yer. Yani tusa basili tuttugun surede bunu yap gibi degil.
        
        
        // @ Mouse Sensitivity'yi field olarak aldik. X ve Y degerlerini verirken X i pozitif Y yi negatif girdik.
        // @ Boylece mouse u yukari kaydirinca yukari, asagi kaydirinca asagi bakiyor.
        
        // # Marketimizin duvar ve tavanini ayarladik. Tavan icin plane kullandik ve 180 derece dondurduk.
        // # Boylece markete yukaridan bakarken cati gorunmuyor ama marketin icinde tavan varmis gibi gorunuyor.
        
        // % Market simulator sistemlerinde insa mantigi vardir. Kasa, Raf ve Sandalye gibi seyleri insa ederiz.
        // % Bu ucunun de inheritance mantigina gore bir parenta bagli olmasi gerek.
        // % BaseBuilding isminde bir abstract class olusturuyoruz.
        // % Daha sonra ayri ayri Shelf, Cash ve Chair siniflari olusturup BaseBuilding i bunlara parent olarak veriyoruz.
        
        // % Shelf, Cash ve Chair icin ayri ayri prefabler olusturuyoruz. Bunlara ayni isimde empty parentlar veriyoruz (scaling vs icin) ve ilgili scriptleri bu parentlara component olarak veriyoruz.
        // & Kodumuzu daha clean hale getirmek icin OnEnable'daki dinlenen fonksiyonlari lambda expression ile yeniden duzenledik.
        // & Boylece OnDisable'a da gerek kalmadi.
        
        // # Sahnede bos bir BuildingManager objesi olusturduk ve Building Manager isimli bir script olusturup bunu sahnedeki BuildingManager objesine component olarak verdik.
        // # BuildingManager'i static yaptik ve Shelf, Chair ve Cash prefableri icin SerializeField degiskenler olusturduk.
        // # Bu degiskenlere olusturdugumuz ilgili prefableri attik.
        
        // $ Input Actions'da gerekli tus atamalarini ve Input Manager'da gerekli event listeningleri yaptik.
        // $ Ancak sahnedeki prefablerim ile ilgili bir sikinti var. Prefabler hem yere gomulmus gibi hem de surekli ayni prefab spawn oluyor (Saniyede 5 kere fln)
        
        // # Spawn sorununu cozmek icin prefablerin parentlarinin layerini "Ignore Raycast" yaptik.
        // # Ardindan parent icindeki ilk objenin konumunu yere gore duzelttik cunku bu bir pivot sorunuydu.
        // # Tum bunlari tamamlayinca prefablere box collider ekleyip boyutlarini ayarladik.
        // # Duvar ve zeminle etkilesime girdiginde renginin kirmizi veya yesil olabilmesi icin de temas edip etmedigini anlamak adina Rigidboyd yerdik hepsine ve Is Kinematic i tikledik.
        
        
        
    }
}