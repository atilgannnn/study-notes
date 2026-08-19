package IfStatement;

import java.util.Scanner;

public class Sayfa20 {

    public static void main(String[] args) {



        /*
        4) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
        b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayı giriniz...");
        int sayi = input.nextInt();
        if(sayi%10>=5){
            System.out.println("Yuvarlama Islemi =" + (sayi/10+1)*10);
        }else{
            System.out.println("Yuvarlama Islemi =" + (sayi/10)*10);
        }

        /*
        5) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
        b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
        c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen"
         */

        Scanner input2 = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarını giriniz");

        double kenar1 = input2.nextDouble();
        double kenar2 = input2.nextDouble();
        double kenar3 = input2.nextDouble();

        if(kenar1 == kenar2 && kenar3 == kenar1){
            System.out.println("Eşkenar Ucgen");
        }else if (kenar1 == kenar2 && kenar3 != kenar1 || kenar1 == kenar3 && kenar2 != kenar1 ||kenar2 == kenar3 && kenar2 != kenar1){
            System.out.println("Ikizkenar Ucgen");
        }else{
            System.out.println("Cesitkenar Ucgen");
        }
































    }




















}
