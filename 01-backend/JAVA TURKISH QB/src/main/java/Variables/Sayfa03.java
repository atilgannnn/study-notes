package Variables;

public class Sayfa03 {

    public static void main(String[] args) {

        /*
            1) Herhangi bir 3 öğenin fiyatları için double data tipinde değişkenler oluşturunuz.
            Fiyatların toplamını konsola yazdırınız.
         */


        double etek = 14.99;
        double ayakkabi = 250.99;
        double gomlek = 44.99;

        double toplam = etek+ayakkabi+gomlek;
        System.out.println(toplam);

        /*
            2) Herhangi bir 3 öğe için float, long ve integer data tipinde değişkenler oluşturunuz.
            Bu değişkenlerin değerlerinin çarpımını konsolda yazdırınız.
         */

        int sayi1 = 12;
        long sayi2 = 131;
        float sayi3 = 15.99f;
        System.out.println("Carpim = " + sayi1*sayi2*sayi3);


        /*
            3) Basit faizi bulmak için bir kod yazınız.
            Not: Basit faiz formülü = anapara * oran * yılDegeri /100
         */

        int anapara = 15000;
        int oran = 400;
        int yilDegeri = 2;

        int basitFaiz = anapara * oran * yilDegeri/100;
        System.out.println(basitFaiz);


        /*
            4) Bir String ve iki long data tipinde değişken oluşturunuz.
            Konsolda bu long değişkenlerin toplamını ve çarpımını String ile yazdırınız.
         */

        long s1 = 56453154L;
        long s2 = 878897987L;
        String s = "Sonuc";

        System.out.println("s = " + s1+s2);
        System.out.println("s = " + s1*s2);
















    }

}
