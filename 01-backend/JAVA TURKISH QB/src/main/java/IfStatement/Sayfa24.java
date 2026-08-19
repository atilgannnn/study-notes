package IfStatement;

import java.util.Scanner;

public class Sayfa24 {


    public static void main(String[] args) {

        /*
        9) Herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan basit bir hesap makinesi oluşturmak için kod yazınız.
        a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
        b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
        c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
        d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
        */

        double a = 10 , b = -5;

        String operator = "/";
        if(operator.equals("+")){
            System.out.println(a + b);
        }else if(operator.equals("-")){
            System.out.println(a - b);
        }else if(operator.equals("*")){
            System.out.println(a * b);
        } else if (operator.equals("/")){
            System.out.println(a/b);
        }else System.out.println("Tanımlanamayan işlem");



        /*
        10) Verilen BMI değerleri için Vücut Kitle İndeksi (BMI) ile ilgili mesajları yazdırmak için kod yazınız.
            Geçersiz BMI değeri < 0
            Zayıf = <18.5
            Normal ağırlık = 18.5–24.9
            Fazla kilolu = 25–29.9
            Obezite = 30 veya daha büyük BMI

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir BMI değeri giriniz...");
        double bmi = input.nextDouble();

        if(bmi < 0){
            System.out.println("Geçersiz BMI değeri");
        }else if(bmi > 0 && bmi < 18.5 ){
            System.out.println("Zayıf");
        }else if (bmi >= 18.5 && bmi <24.9){
            System.out.println("Normal ağırlık");
        }else if (bmi >= 25 && bmi < 29.9){
            System.out.println("Fazla kilolu");
        }else if (bmi > 30){
            System.out.println("Obezite");
        }





















    }








}
