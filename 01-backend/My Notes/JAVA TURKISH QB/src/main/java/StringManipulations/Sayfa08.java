package StringManipulations;

public class Sayfa08 {

    public static void main(String[] args) {

    /*
        4) Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını konsolda yazdırınız.
        Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.

    */

        String s = "1a3Bcf4!...";

        Integer s1 = s.replaceAll("[0-9]","").length();

        System.out.println(s1);

        /*

        5) Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son karakteri yazdırınız.
        Örnek: 'Ali Can' için n yazdırmalısınız. ‘Miami’ için i yazdırmalısınız.

         */

        String adim = "Atilgan Sahin Ulasan";

        String adim1 = adim.replaceAll("\\s","");
        String sonHarf = adim1.substring(adim1.length()-1);

        System.out.println(sonHarf);

        /*

        6) Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin toplamını bulunuz.

         */

        String deger = "Ayaz";

        int ilkHarfIndex = deger.charAt(0);
        int sonHarfIndex = deger.charAt(deger.length()-1);
        System.out.println(ilkHarfIndex+sonHarfIndex);






























    }






















}
