package Loops;

public class Sayfa50 {

    public static void main(String[] args) {

        /*

        13) 3 ile 14 arasındaki tam sayıların toplamını bulmak için kodu yazınız.

        */


        //1. Yol:
        int sum = 0;

        for (int i = 3; i <15 ; i++) {

            sum += i;

        }

        System.out.println(sum);

        System.out.println();

        //2. Yol:

        int sum2 = 0;
        int j = 3;

        while(j<15) {

            sum2 += j;
            j++;

        }

        System.out.println(sum2);

        System.out.println();


        //3. Yol:
        int sum3 = 0;

        int k = 3;

        do {

            sum3 += k;
            k++;
        }while(k<15);

        System.out.println(sum3);

        



    }

}
