package day03_ifStatement;

import java.util.Scanner;

public class C05_ifStatement {

    public static void main(String[] args) {

        /*
            TASK:
            Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
            dort islemden biriyle isleme koyup sonucu yazdiriniz.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen \n toplama islemi icin 1 \n cikarma islemi icin 2 \n bolme islemi icin3 \n carpma islemi icin 4 \n giriniz");

        int islem = input.nextInt();//Kullanicinin islem tercihi icin bir variable olusturduk.

        System.out.println("Lutfen iki tam sayi giriniz"); // Kullaniciya bildirimde bulundum.

        double num1 = input.nextDouble(); //1.sayi assign edildi.
        double num2 = input.nextDouble(); //2.sayi assign edildi.


        if(islem==1) {
            System.out.println("Toplama isleminin sonucu :" + num1 + "+" + num2 + "=" + (num1 + num2));
        }else if(islem==2) {
            System.out.println("Cikarma isleminin sonucu :" + num1 + "-" + num2 + "=" + (num1 - num2));
        }else if(islem==3) {
            System.out.println("Bolme isleminin sonucu :" + num1 + "/" + num2 + "=" + (num1 / num2));
        }else if (islem==4) {
            System.out.println("Carpma isleminin sonucu :" + num1 + "*" + num2 + "=" + (num1 * num2));
        }else System.out.println("Hatali giris yaptiniz ");
                    }
                }




















