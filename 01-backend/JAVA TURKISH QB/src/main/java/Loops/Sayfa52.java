package Loops;

public class Sayfa52 {

    public static void main(String[] args) {

        /*

        15) Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için kod yazınız.

        */

        //1. Yol:

        String letters = "";
        for (char i = 'A'; i < 'D' ; i++) {

            letters += i;

        }

        System.out.println(letters);

        System.out.println();

        //2. Yol:

        String letters2 = "";
        char j = 'A';
        while (j<'D'){

            letters2 += j;
            j++;

        }

        System.out.println(letters2);

        System.out.println();

        //3. Yol:

        String letters3 = "";
        char k = 'A';

        do {
            letters3 += k;
            k++;
        }while (k<'D');

        System.out.println(letters3);


    }




}
