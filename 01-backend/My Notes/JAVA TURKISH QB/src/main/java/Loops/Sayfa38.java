package Loops;

public class Sayfa38 {


    public static void main(String[] args) {

        /*

        1) 120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki ardışık tam sayı arasında boşluk bırakarak yazınız.

        */

        //1. Yol:

        for (int i = 120; i >10 ; i--) {
            if(i%4==0 && i%6==0)
                System.out.print(i+" ");


        }

        System.out.println();

        //2. Yol:

        int j = 120;

        while(j>10){
            if(j%4==0 && j%6==0) {
                System.out.print(j + " ");
            }

            j--;
        }
        System.out.println();

        //3. Yol:

        int k = 120;

        do {
            if (k%4==0 && k%6==0) {
                System.out.print(k + " ");
            }
            k--;
        }while(k>10);



























    }
























}
