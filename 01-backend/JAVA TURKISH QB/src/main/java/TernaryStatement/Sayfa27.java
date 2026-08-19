package TernaryStatement;

public class Sayfa27 {

    public static void main(String[] args) {

        /*

             7) Ternary kullanarak; 2 tamsayıdan küçük olanı konsola yazdıran bir program yazınız.

         */

        int a = 6;
        int b = -5;

        int comparison = a<b? a : b;
        System.out.println(comparison);


        /*

              8) Sayı 3 basamaklı ise konsolda kodunuz "Bu sayı 3 basamaklıdır" olacaktır.
              Aksi takdirde, kodunuz " Bu sayı 3 basamaklı değildir" olacaktır.

         */

        // 1.Yol:
        int x = -250;

        String s = x>99 && x<1000 || x<-99 && x>-1000 ? "Bu sayi 3 basamaklıdır" : "Bu sayi 3 basamaklı değildir";
        System.out.println(s);

        System.out.println("****************");

        // 2.Yol:
        int z = -100;

        z = Math.abs(z);

        String s2 = z>99 && z<1000 ? "Bu sayi 3 basamaklıdır" : "Bu sayi 3 basamaklı değildir";
        System.out.println(s2);

        /*

            9) Ternary kullanarak; konsolda tek sayılar için “Tek” , çift sayılar için “Çift” yazdırınız.

         */

        int ss = -3;

        String ciftMi = ss%2 == 0 ? "Çift" : "Tek";

        System.out.println(ciftMi);

        /*
            10) Ternary kullanarak; konsolda sayı pozitif ise “Pozitif” , negatif ise “Pozitif Değil” yazdırınız.

         */

        int number = -25;

        String pozitifMi = number>0 ? "Pozitif" : "Pozitif Değil";
        System.out.println(pozitifMi);























    }

























}
