package diger;

import java.util.Scanner;

public class Soru11 {


    public static void main(String[] args) {

        /*

        SORU 11 (INTERVIEW QUESTION) : Kullanicidan 10'dan kucuk bir tamsayi isteyin ve girilen sayinin faktöryelini bulun.
        (5! = 5*4*3*2*1)


        */



        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 10'dan kucuk bir tamsayi giriniz");

        int sayi = input.nextInt();
        sayi = Math.abs(sayi);
        int faktoriyel = 1;

        for (int i = sayi; i > 0 ; i--) {

            faktoriyel *= i;


        }
        System.out.println(faktoriyel);














































    }






















}
