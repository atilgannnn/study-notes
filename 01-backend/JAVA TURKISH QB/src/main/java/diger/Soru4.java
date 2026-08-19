package diger;

import java.util.Scanner;

public class Soru4 {


    public static void main(String[] args) {


         /*

        SORU 4 : Kullanicidan 100'den kucuk bir tamsayi isteyin.1'den başlayarak girilen sayiya kadar 3'un katı olan sayilari yazdirin.


        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 100 den kucuk bir tamsayi giriniz...");

        int sayi = input.nextInt();

        for (int i = 1; i < sayi ; i++) {
            if (i%3==0){
                System.out.print(i);
            }

        }
























        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk bir tamsayi giriniz");

        int sayi = input.nextInt();
        for (int i = 1; i <=sayi; i++) {
            if (i%3==0){
                System.out.print(i+" ");
            }



        }

        */
























    }


















}
