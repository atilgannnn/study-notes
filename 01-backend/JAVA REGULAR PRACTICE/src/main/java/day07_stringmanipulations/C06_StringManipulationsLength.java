package day07_stringmanipulations;

import java.util.Scanner;

public class C06_StringManipulationsLength {


    public static void main(String[] args) {

        /*
         * Length()
         * length() method'u girilen String'in uzunlugunu verir
         * butun karakterlerin adedi (bosluklar da birer karakterdir)
         */
        //havva == length == 5
        //havva == index == 4

        String cumle = "Bugun hava yagmurlu";
        System.out.println(cumle.length());

        String str1 ="";
        System.out.println(str1.length());

        String str2 =" ";
        System.out.println(str2.length());

        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz: \n isim :");
        String isim = input.next();
        System.out.println("Soyisim");
        String soyIsim = input.next();

        if (isim.length() > soyIsim.length()){
            System.out.println("Isminiz soyisminizden uzun");
        } else if (isim.length() == soyIsim.length()) {
            System.out.println("Isminiz soyisminizle ayni uzunlukta");
        }else System.out.println("Soyisminiz isminizden uzun");

        // Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        Scanner input2 = new Scanner(System.in);
        System.out.println("Lutfen 4 karakterli bir kelime giriniz");
        String kelime = input2.next();
        System.out.println(kelime.length());

        if(kelime.length() == 4){
            char bir = kelime.charAt(0);
            char iki = kelime.charAt(1);
            char uc = kelime.charAt(2);
            char dort = kelime.charAt(3);
            System.out.println("Tersten yazilmis hali : " +dort+uc+iki+bir);
        } else if (kelime.length() > 4) {
            System.out.println("Girdiginiz kelime dort karakterden fazla");

        }else if (kelime.length() < 4){
            System.out.println("Girdiginiz kelime dort karakterden az");
        }


    }



















}
