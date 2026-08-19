package day03_ifStatement;

public class C04_MantikOperatorleri {

    public static void main(String[] args) {

        //&& ile & arasindaki fark
        //&& de boolean sonuc 3 te 1 false bulunca durur tum satiri kontrol etmeye calismaz.
        // Ancak & tum atiri kontrol eder ondan sonra durur.
        //Sonucta fark yok sadece biri ilk hatayi buldugunda durur digeri sonuna kadar gider. && tek &'ye gore daha hizli calisir.

        System.out.println(5+2 ==8);//false doner.

        boolean sonuc1 = 5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuc1 ==>" +sonuc1);//true

        boolean sonuc2 =5>4 && 7>9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuc2 ==>" +sonuc2);//false

        // sayi1'in 10 ile 20 araliginda oldugunu true diyerek dondurelim.
        //10<sayi1<20 Java uclu karsilastirma yapmaz
        //Ikili karsilastirmalar yapip mantiksal operatorlerle birlestirmeliyiz.


        int sayi1=15;

        System.out.println(10<sayi1 && sayi1<20);//true doner.

        int sayi2 = 5;

        System.out.println("sayi2 10 ile 20 arasinda degildir :" +(sayi2<10 || sayi2<20));//true doner.

        //&& --> ve  || --> veya anlamına gelir unutma!














    }








}
