package IfStatement;

import java.util.Scanner;

public class Sayfa19 {

    public static void main(String[] args) {

        /*
            3) Ayın numarasını girdiğinizde ayın adını yazdırmak için gereken kodu yazınız.
            Örnek; 1 için çıktı: "Ocak", 2 için çıktı: "Şubat" vb.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir ay numarasi giriniz...");
        byte ayNo = scan.nextByte();
        if(ayNo ==1){
            System.out.println("Ocak");
        }else if(ayNo == 2){
            System.out.println("Şubat");
        }else if(ayNo == 3){
            System.out.println("Mart");
        }else if(ayNo == 4){
            System.out.println("Nisan");
        }else if(ayNo == 5){
            System.out.println("Mayis");
        }else if(ayNo == 6){
            System.out.println("Haziran");
        }else if(ayNo == 7){
            System.out.println("Temmuz");
        }else if(ayNo == 8){
            System.out.println("Agustos");
        }else if (ayNo == 9){
            System.out.println("Eylul");
        }else if(ayNo == 10){
            System.out.println("Ekim");
        }else if(ayNo == 11){
            System.out.println("Kasim");
        }else if(ayNo == 12){
            System.out.println("Aralık");
        }else{
            System.out.println("Gecersiz ay numarasi");
        }














    }






}
