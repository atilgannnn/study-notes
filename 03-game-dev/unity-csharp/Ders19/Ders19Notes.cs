namespace DersNotlari.Ders19
{
    public class Ders19Notes
    {
        
        // ? Bu derste 
        
        /*
         * Vegetable'i rafin collision i icerisinde oldugumuzda cok hizli raftan alip baska rafa yerlestiriyor. Bunu cozerek derse basladik.
         * BaseItem icewrisinde bunu kontrol altina almak icin private bool _canInteractable = true; setleyerek getter ve setter ekledik. Ayni sinifta if(!_canIntyeractable) return; dedik.
         * Shelf classta da position set oncesinde _canInteractable'i false a setledik.
         */
        
        // ! Bir diger problem ise citlere veya rafa surtundugumuzde kamera ve karakter kayboluyor. Bu Angular Velocity yo tetikleyip karaktere geri donuyor ve karakteri spin ettiriyor.
        // ! Bu fizik motorundan mutevellit olusan bir durum.
        // ! Burada karsi kuvvetin biriktigini nasil anladik? Freeze Rotation y degeri tikliydi ve tikini kaldirdik. Character'i duvara goturup surtundugumuzde Mevlana gibi dondu :D
        
        // $ Rigidbody icerisinde Linear Damping ve Angular Damping denilen iki kisim var.
        // --> Linear (Hareket Kuvveti) Damping ==> Fizik motorundaki hareket kuvvetine karsi olusturdugumuz direnctir.
        // --> Mesela ucaktan atlayip parasut acinca kisi yavas yavas yere dogru suzulur. Linear Damping bu senaryodaki parasut gibidir.
        // --> Angular (Donus Kuvveti) Damping ==> Fizik motorundaki donus kuvvetine karsi olusturdugumuz direnctir.
        // --> Mesela bir araba yarisinda viraji alirken yaptigimiz donuse karsilik aldigimiz onlem Angular damping e ornek gosterilebilir.
        
        // # Bunu cozmek icin PhysicMaterial klasoru olusturup icine PM_Character fizik materyali olsuturduk.
        // # Daha sonra bu dosyayi Character'in Material kismina surukleyip biraktik.
        // # Ardindan tum Friction degerlerini sifirlayip Friction Combine'i Minimuma cektik.
        
        // TODO : Benim lokalde rafa gidince collisiondan oturu ben hala bu problemi yasiyorum. Hocaya sor!
        // TODO : Hoca ayrica Automatic Tensor ve icindeki alt basliklari (Inertia Tensor ve Inertia Tensor Rotation) anlatacagim dedi ama anlatmadi henuz. Hatirlat!
        
        // @ FarmManager scriptini olusturup sahne attiktan sonra (hierarchy ye yani), FarmManager icerisinde singleton yapmak icin static instance ini olusturduk.
        // @ Ardindan da ayni class icerisinde OnSeedPlanted, OnVegetableSpawned ve OnVegetableCollected eventlerini olsuturduk ve Awake fonskiyonunu tanimladik.
        
        
        
        
        
    }
}