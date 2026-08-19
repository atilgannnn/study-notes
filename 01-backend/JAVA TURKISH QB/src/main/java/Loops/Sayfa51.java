package Loops;

public class Sayfa51 {


    public static void main(String[] args) {

        /*

        14) 3 ile 9 arasındaki tam sayıların çarpımını bulmak için kodu yazınız.

        */


        //1. Yol:

        int multiply = 1;
        for (int i = 3; i < 10 ; i++) {

            multiply *= i;



        }

        System.out.println(multiply);

        System.out.println();

        //2. Yol:

        int multiply2 = 1;
        int j = 3;
        while (j<10){

            multiply2 *= j;
            j++;

        }

        System.out.println(multiply2);

        System.out.println();

        int multiply3 = 1;
        int k = 3;
        do {

            multiply3 *=k;
            k++;

        }while(k<10);

        System.out.println(multiply3);



    }
}
