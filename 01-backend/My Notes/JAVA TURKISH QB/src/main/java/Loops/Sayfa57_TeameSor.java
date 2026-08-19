package Loops;

import java.util.Scanner;

public class Sayfa57_TeameSor {

    public static void main(String[] args) {

        /*

        22) 5 hariç 3'ten 9'a kadar olan tam sayıları yazdırmak için kod yazınız.

        */

        //1. Yol:

        for (int i = 3; i < 10; i++) {
            if (i==5){
                continue;
            }
            System.out.print(i+" ");
        }

        System.out.println();


        /*
        //2. Yol:
        int j = 3;
        while(j<10){

            if (j==5){

                continue;

            }

            j++;

        }
        System.out.print(j+ " ");

        */

        /*
        //3. Yol:

        int k = 3;
        do {

            if (k==5){
                continue;
            }

            k++;

        }while (k<10);
        System.out.println(k+" ");

        */

        /*

        23) Asal sayı olup olmadığını kontrol etmek için kullanıcıdan bir tam sayı girmesini isteyiniz.
        Örnek: kullanıcı 43 girerse çıktı “43 bir asal sayıdır”, kullanıcı 120 girerse “120 asal değildir” olur.
        kullanıcı negatif tam sayılar girerse çıktı “Pozitif bir tam sayı giriniz” şeklinde kullanıcıyı yönlendiriniz.

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen asal bir sayi giriniz");
        int sayi = input.nextInt();
        int counter = 0;
        if(sayi>0){

            if(sayi==1){

                System.out.println("Asal sayidir");


            }else{

                for (int i = 2; i < sayi; i++) {

                    if (sayi%i==0){
                        counter++;

                    }
                }


            }if (counter==0){
                System.out.println("Asal sayidir");
            }else{
                System.out.println("Asal sayi degildir");


            }





        }else
            System.out.println("Pozitif tam sayi giriniz");





    }
}
