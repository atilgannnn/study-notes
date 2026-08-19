package Loops;

import java.util.Scanner;

public class Sayfa60 {

    /*

    27) Belirli bir arrayden, toplamı belirli bir sayı olan tüm çiftleri bulunuz.
    Array {4, 6, 5, -10, 8, 5, 20} ve sayı 10 ise, çıktı 4+6=10, 5+5=10, -10+20=10 olacaktır.

    */

    public static void main(String[] args) {

        Integer arr[] = {4,6,5,-10,8,5,20};
        int num = 10;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length ; j++) {

                if (arr[i] + arr[j] == num){

                    System.out.println(arr[i]+ "+" +arr[j]+ "=" +num);
                }

            }

        }


        /*

        28) Belirli bir sayıdan küçük tüm asal sayıları yazdıran bir kod yazınız.
        Örnek: kullanıcı 20 girerse çıktı 2, 3, 5, 7, 11, 13, 17, 19 olacaktır.

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi = input.nextInt();

        printPrime(sayi);


    }

    private static boolean isPrime(int sayi){
        if (sayi<=1){
            return false;
        }
        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0){
                return false;
            }
        }
        return true;

    }

    private static void printPrime(int sayi) {
        for (int i = 2; i <= sayi ; i++) {

            if(isPrime(i)){
                System.out.print(i + " ");
            }

        }


    }


}
