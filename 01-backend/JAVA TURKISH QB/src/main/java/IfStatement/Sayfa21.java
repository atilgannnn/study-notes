package IfStatement;

import java.util.Scanner;

public class Sayfa21 {

    public static void main(String[] args) {

       /*
        6) Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
        a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
        b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda kodunuz "2" yazmalıdır (sayı dinamik olacak)
        c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdan Santigarata olarak girdiğinde, konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
       */


        Scanner input = new Scanner(System.in);

        System.out.println("Çevirmek istedğiniz değeri giriniz");
        String str = input.next();

        String mildenkilometreye = "a";
        String saniyedensaate = "b";
        String fahrenheittansantigrata = "c";


        if(str.equals(mildenkilometreye)){
            System.out.println("Lütfen mil değerini giriniz");
            double mil = input.nextDouble();
            System.out.println(mil*1.60934);
        }else if(str.equals(saniyedensaate)){
            System.out.println("Lütfen saniye değerini giriniz");
            double saniye = input.nextDouble();
            System.out.println((saniye/60)/60);
        }else if(str.equals(fahrenheittansantigrata)){
            System.out.println("Lütfen fahrenheit değerini giriniz");
            double fahrenheit = input.nextDouble();
            System.out.println(fahrenheit*0.556);
        }else System.out.println("Geçersiz sayı girdiniz!");











        




















    }





















}
