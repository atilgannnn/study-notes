package TernaryStatement;

public class Sayfa26 {

    public static void main(String[] args) {

        /*

        4) Nested Ternary kullanarak Apex kodunu yazınız.
        Bir yılın artık yıl olup olmadığını kontrol eden bir program yazınız.
        Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir. Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir.

         */

        int yil = 2020;

        String artikYil = yil%100 == 0 ? (yil%400 == 0? "Artık yil" : "Artık yil degil") : (yil%4 == 0 ? "Artık yıl" : "Artık yıl degil");
        System.out.println(artikYil);

        /*
            5) Nested Ternary kullanarak;
            Şifreyi kontrol etmek için kodu yazınız.
            8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
            8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdır.
        */

        String sifre = "kilklgtrsx";

        String sifreKontrol = sifre.length()>8 ? (sifre.startsWith("i") ? "Geçerli" : "Geçersiz"): (sifre.startsWith("k") ? "Geçerli" : "Geçersiz");
        System.out.println(sifreKontrol);

        /*

        6) Bir sayının mutlak değerini hesaplamak için kodu yazınız.
        Pozitif sayılar ve sıfır mutlak değer için sayı ile aynıdır.
        Negatif sayıların mutlak değerini bulmak için sayıyı -1 ile çarpınız.

        */

        int num = -800;

        int mutlak = num > 0 ? num : num*-1;

        System.out.println(mutlak);



















    }























}
