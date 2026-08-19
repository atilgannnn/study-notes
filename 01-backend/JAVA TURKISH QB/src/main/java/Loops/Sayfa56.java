package Loops;

import static java.lang.Integer.valueOf;

public class Sayfa56 {

    public static void main(String[] args) {

        /*

        19) Bir String’ deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.

        */

        String str = "Ali Can123* 456";
        str = str.replaceAll("\\s","").replaceAll("\\p{Punct}","");
        System.out.println(str.length());




        /*

        20) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.

        * * * * * *
        * * * * *
        * * * *
        * * *
        * *
        *

        */

        //1.Yol:


        for (int i = 1; i < 7; i++) {

            for (int j = 7; i < j ; j--) {

                System.out.print("* ");

            }

            System.out.println();

        }

        System.out.println();

        //2. Yol:

        int satir = 1;

        while(satir<7){

            int sutun = 7;


            while(sutun>satir){

                System.out.print("* ");


             sutun--;
            }

            System.out.println();

          satir++;
        }

        System.out.println();

        //3. Yol:

        int satir1 = 1;
        do {

            int sutun1 = 7;

            do {
                System.out.print("* ");
            sutun1--;
            }while(sutun1>satir1);
            System.out.println();
        satir1++;
        }while(satir1<7);

        System.out.println();


        /*

        21) Bir tamsayının benzersiz(tekrarsız) basamaklarının toplamını bulmak için kodu yazınız.
            Örnek:12133455  ́ 2+4=6

        */

        //1. Yol:
        int num = 12133455;
        String num1 = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < num1.length() ; i++) {
            String ch = num1.substring(i,i+1);
            if (num1.indexOf(ch) == num1.lastIndexOf(ch)) {

                sum += Integer.valueOf(ch);
            }

        }

        System.out.print(sum);


        System.out.println();

        //2. Yol:
        String num2 = String.valueOf(num);
        int sum2 = 0;
        int j = 0;
        while(j<num2.length()){

            String ch2 = num2.substring(j,j+1);
            if (num2.indexOf(ch2) == num2.lastIndexOf(ch2)){

                sum2 += Integer.valueOf(ch2);
            }

            j++;

        }

        System.out.println(sum2);

        System.out.println();

        //3. Yol:

        String num3 = String.valueOf(num);
        int sum3 = 0;
        int k = 0;
        do {

            String ch3 = num3.substring(k,k+1);
            if (num3.indexOf(ch3) == num3.lastIndexOf(ch3)){

                sum3 += Integer.valueOf(ch3);

            }
            k++;

        }while(k<num3.length());

        System.out.println(sum3);















    }


}
