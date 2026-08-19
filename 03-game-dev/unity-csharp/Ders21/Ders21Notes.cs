namespace DersNotlari.Ders21
{
    public class Ders21Notes
    {
        // ? Bu derste inheritance ve structure yapilarini tekrar ettik !
        
        // @ Dersin basinda ben bir soru sordum. Resident Evil Requiem'i Developer mode da inceleyen bir Youtuber'in videosuna denk gelmistim.
        // @ Sorum suydu : Bazi assetler cut scene den sonra loading oluyor ve bazi interactable assetler de oyunun basinda havada duracak sekilde bir yerlerde load olmus.
        // @ Bunun thread management ile bir alakasi var mi?
        
        // $ CEVAP : Evet var. Pointer'lar sahnede spawn olan sahneye yerlestirilmis her nesne referans olarak bir pointer'a isaret ediyor.
        // $ Pointerlar RAM de tutuluyor cunku gecici datalar. Ama pointler threadler arasinda bolunemiyor. Ama ne bolunuyor "POINTER ID NUMARALARI"
        // $ POINTER ID leri mesela x id li pointer yan thread de beklesin ve su noktada spawn olsun gibi gibi seyler yapabiliyoruz.
        // $ Unity pointerlari arkada kendisi hallediyor.
        
        // # Bu asset renderlanmasi Level Streaming ile alakali bir durum.
        // ? Bu noktada bunun LOD ile mi alakali oldugunu sordum. Hoca dedi ki :
        // --> LOD => Asset senden ne kadar uzaksa o assetin Vertex sayisini dusuruyor. Boylece assetler gorus acisina girilecegi zaman renderlanip yukleniyor.
        // --> OCCLUSION CURRING => Direkt cameranin cekmedigi seyleri renderlamiyor. Bu RE Requiem de assetlerde yapilan sey.
        
        // ? Hocaya ayrica RE Requiem de gordugum bir dis mekandan iceriye bakinca iceride esya var gibi gorundugu ama assetin icinin bos oldugu bir efekti sordum.
        // ? Bunun texture dosyalariyla mi yoksa shader ile mi yapildigini sordum.
        // $ CEVAP : Bunun adi PARALLAX EFFECT ve bu material ile yapiliyor. Hem Unity de hem de Unreal Engine de yapilabiliyor.
        
        // ! Simdi mesela ben oyunumda bir ogrencinin String name, int age ve float weight bilgisini tutmak istiyorum.
        // ! Bunu normalde yapabilecegim (Junior Kafasinda) tek yontem ayri ayri List ler olusturmak.
        // ! public List<string> students_name = new(); public List<int> students_age = new(); public List<float> students_weight = new(); gibi
        // @ Ancak bunu yapmanin en iyi yolu ise STRUCT ile yapmaktir.
        // @ Bizim birden fazla degeri tek bir cati altinda toplamamiz gerektiginde imdadimiza structlar yetisiyor.
        
        // ? Burada hocaya sordum : HashMap veya HashSet gibi bir yapi kullanamaz miydik?
        // $ CEVAP : C# da Dictionary kullanabilirsin ancak onlar da key - value seklinde deger aliyorlar. Bu sebeple en az ve en cok 2 deger alabilirler.
        // $ Yani public Dictionary <string,int> students_id = new(); dersek sadece key ve value alabiliriz.
        
        // TODO : Hoca bir ara size dictionary'leri anlatirim dedi. Hatirlat!
        
        // # Asagidaki bir Struct ornegini gorebilirsin!
        /*
         [Serializable]
         public struct student_struct 
         {
            public string name;
            public int age;
            public float weight;         
         }
         
         public class Student : MonoBehaviour {
         
            public List<student_struct> studentsList = new();
            public void AddStudent(string name, int age, float weight) {
                
                student_struct newStudent = new student_struct(); // Bir kez nesnemi olusturdum.
                newStudent.name = name;
                newStudent.age = age;
                newStudent.weight = weight;
                
                studentsList.Add(newStudent);
            
            }
         
         }
        
         */
        
        // ! SIMDI BU KISIM COK ONEMLI O YUZDEN BUYUK PUNTOLARLA YAZIYORUM !
        // $ Structure ve class yapilarinda new() ile olusturdugumuz yapilar aslinda pointer yapilari.
        // $ Unity de pointerlarin ayarlanmasi otomatik olarak Unity tarafindan ayarlaniyor bu acidan Unity guclu bir tool.
        // $ C++ da ise pointerlar developer tarafindan yonlendiriliyor. Bu ne demek?
        // $ Pointerlarin calisma sekli ve zamani developer tarafindan belirlenebildigi icin RAM de kapladigi alan da bu sayede yonetilmis oluyor.
        // $ Bu yuzdendir ki Unreal Engine C++ ile yazildigindan herkes Unreal Engine'de yapilan oyunlarin daha hizli calistigini soyler. Sebebi budur.
        // $ Bizler de Unity de pointerlari Constructive ve Deconstructive Functionlar ile manipule edebiliyoruz.
        // $ Asagida Constructive ve Deconstructive Function orneklerini gorebilirsin !
        
        // @ ONEMLI NOT :
        // @ C#'DAKI CONSTRUCTIVE FUNCTION = JAVA'DAKI CONSTRUCTOR.
        // @ C#'DAKI DECONSTRUCTIVE FUNCTION = JAVA'DA YOK. JAVA'DA ONUN YERINE OTOMATIK GARBAGE COLLECTOR VAR.
        
        
        /*
         
         [Serializable]
           public struct student_struct 
           {
              public string name;
              public int age;
              public float weight;         
           }
           
           // ! CONSTRUCTOR
           public student_struct(string n, int a, float w)
           {
              name = n;
              age = a;
              weight = w;
           }
           
           // ! DECONSTRUCTOR
           public void Deconstruct(out string n, out int a, out float w)
           {
               n = name;
               a = age;
               w = weight;
           }
           
           public class Student : MonoBehaviour {
           
              public void AddStudent(string name, int age, float weight) {
                  
                  // 1. Nesneyi oluşturuyoruz (Constructor çalışır)
                  student_struct newStudent = new student_struct(name, age, weight);
                  
                  // 2. Deconstructor'ı ÇAĞIRIYORUZ (Deconstruction)
                  // Bu satır arka planda senin yazdığın Deconstruct(out n, out a, out w) metodunu çalıştırır.
                  var (gelenIsim, gelenYas, gelenKilo) = newStudent;
              
              }
           
           }

         */
        
        // ! INHERITANCE NEDIR? NE ISE YARAR?
        
        // @ Bizler oyunlarda inheritance'i bir seyleri otomasyona baglamak icin kullandigimiz yapidir.
        // @ Ozellikle oyunlarda benzer logiclere sahip ama farklilastirmak istedigimiz yerlerde bunu kullaniyoruz.
        // $ Mesela bir asker ve bir zombie olan bir oyunda asker ve zombie icin ayri ayri saldirma ve bagirma gibi fonksiyonlar vermek yerine inheritance ile tek bir yerden duzenleyebiliyoruz.
        // $ Baska bnir ornek olarak bir araba yarisi oyunu dusunelim. Bir spor bir de casual bir arabamiz var.
        // $ Bunlarin ikisi de ileri gidiyor, geri gidiyor, el freni vs var.
        // $ Iste bunlar icin ayri ayri ileri gitme, geri gitme, fren yapma vs gibi fonksiyonlar yazmak yerine arac adinda bir parent olusturuyorum.
        // $ Tum bu fonksiyonlari parenta veriyorum. Spor ve casual arabalari arac in children i yapiyorum.
        // $ Child classlardan da bu fonksiyonlari cagirip her biri icin kendi classi icerisinde ozellestirebiliyorum.
        
        // ! ABSTRACT NEDIR? NE ISE YARAR?
        
        // # Bizler oyunda bir classin component olarak bir nesneye verilmesini istemiyorsak, o sinifi abstract yapariz.
        // # Abstract bir fonksiyon base sinifta yazilir ve curly brackets olmaz. Icini alt siniflarda bu fonksiyonu cagirinca doldururuz.
        // # Abstract fonksiyon override edildiginde base siniftaki asil abstract function in body si (curl brackets ve ici) olmadigi icin base.HandBreak(); gibi bir cagirma YAPILAMAZ!
        // $ Mesela araba, motor ve gemi olusturduk oyunumuzda. Hepsi de ileri ve geri gidecek sonucta.
        // $ Bu fonksiyonu abstract yaparsak her ucunde de kullanabiliriz cunku ana fonksiyon alt cocuklarda rahatca tanimlanabilir.
    }
}