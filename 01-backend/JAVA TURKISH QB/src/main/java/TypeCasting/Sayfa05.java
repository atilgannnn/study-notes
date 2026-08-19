package TypeCasting;

public class Sayfa05 {


    public static void main(String[] args) {

        /*
            1) Short data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.
         */

        short yas = 5;
        int yeniYas = yas;

        /*
            2) Long data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.
         */

        long yas1 = 8;
        int yeniYas1 = (int)yas1;

        /*
            3) Double data tipinde bir değişken oluşturunuz ve onu bir float değişkenine dönüştürünüz.
         */

        double sayi = 145.0;
        float sayi2 = (float)sayi;

        /*
            4) Double data tipinde bir değişken oluşturunuz ve onu bir short değişkenine dönüştürünüz.
            Sonrasında bu short değişkenin değerini konsolda yazdırınız.
            Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır.
         */

        double x = 124.0;
        short y = (short)x;
        System.out.println(y);

        /*
            5) Byte data tipinde bir değişken oluşturunuz ve onu bir double değişkenine dönüştürünüz.
            Sonrasında bu double değişkenin değerini konsolda yazdırınız.
            Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır.
         */

        byte a = 23;
        double b = a;
        System.out.println(b);


















    }
}
