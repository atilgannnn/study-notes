package Loops;

import java.util.Scanner;

public class Sayfa58 {

    public static void main(String[] args) {

        /*

        24) Kullanıcıya kaç tane fibonacci sayısı görmek istediğini sorunuz. Ardından bu fibonacci sayılarını yazdıran kodu yazınız.
        Örnek: kullanıcı 6 girerse çıktı 1 1 2 3 5 8 olacaktır.

        */

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç tane fibonacci sayisi gormek istediginizi giriniz");
        int number = input.nextInt();
        int fibo1 = 1;
        int fibo2 = 1;
        int fibonacci = 0;
        System.out.print(fibo1 + " ");
        System.out.print(fibo2 + " ");
        for (int i = 1; i < number-1 ; i++) {

            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

            System.out.print(fibonacci + " ");

         */


            /*

            25) Bir sayı, her basamağının küpünün toplamına eşitse Armstrong sayısı olarak adlandırılır.
            Örneğin, 153, her basamağın küpüne eşit olan 153= 1 + 125 + 27 olduğundan bir Armstrong sayısıdır.
            Verilen numaranın Armstrong sayısı olup olmadığını kontrol etmek için bir kod yazınız.

            */

            int sayi = 407;
            String sayi1 = String.valueOf(sayi);
            int counter = 0;
            for (int j = 0; j < sayi1.length(); j++) {

                String ch = sayi1.substring(j,j+1);
                int ch1 = Integer.valueOf(ch);
                counter += ch1*ch1*ch1;

            }if (counter==sayi){
            System.out.println("Armstrong sayisidir");
        }else{
            System.out.println("Armstrong sayisi degildir");
        }
            
        }


    }



