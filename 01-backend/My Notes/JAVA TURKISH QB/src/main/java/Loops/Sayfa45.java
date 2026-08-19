package Loops;

public class Sayfa45 {

    public static void main(String[] args) {


        /*

        8) 20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk bırakarak yazdırmak için gereken kodu yazınız.

        */

        //1. Yol:


        for (int i = 20; i > 2 ; i--) {

            if (i%2!=0){

                System.out.print(i+" ");
            }

        }

        System.out.println();

        //2. Yol:

        String s1 = "";
        int j = 20;
        while(j>2){

            if (j%2!=0){

            s1 += j + " ";


            }
            j--;
        }

        System.out.print(s1);

        System.out.println();

        //3. Yol:

        String s2 = "";
        int k = 20;
        do {

            if (k%2!=0){
                s2 += k + " ";
            }
            k--;
        }while(k>2);

        System.out.print(s2);


















    }






}
