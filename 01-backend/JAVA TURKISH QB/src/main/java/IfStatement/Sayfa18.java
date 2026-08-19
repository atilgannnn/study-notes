package IfStatement;

import java.util.Locale;
import java.util.Scanner;

public class Sayfa18 {

    public static void main(String[] args) {

        /*
        1) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Aralık, Ocak, Şubat için "Kış"
        b) Mart, Nisan, Mayıs için "İlkbahar"
        c) Haziran, Temmuz, Ağustos için "Yaz"
        d) Eylül, Ekim, Kasım için "Sonbahar"
        e) Diğerleri için "Geçersiz ay adı"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir ay adi giriniz");
        String ayAdi = input.next().toLowerCase();
        if(ayAdi.equals("aralik") || ayAdi.equals("ocak") || ayAdi.equals("subat")){
            System.out.println("Kış");
        }else if(ayAdi.equals("mart") || ayAdi.equals("nisan") || ayAdi.equals("mayis")){
            System.out.println("Ilkbahar");
        }else if(ayAdi.equals("haziran") || ayAdi.equals("temmuz") || ayAdi.equals("agustos")){
            System.out.println("Yaz");
        }else if (ayAdi.equals("eylul") || ayAdi.equals("ekim") || ayAdi.equals("kasim")){
            System.out.println("Sonbahar");
        }else{
            System.out.println("Geçersiz");
        }

        /*
        2) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
        b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
        c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"
        Not: Çözümdeki koşulların sıralarına dikkat ediniz.
         */

        Scanner sfr = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String pwd = sfr.nextLine();
        if(pwd.length() > 7 && !pwd.contains(" ")){
            System.out.println("Gecerli Sifre");
        }else if(pwd.contains(" ")){
            System.out.println("Sifrede bosluk karakteri kullanmayiniz");
        }else {
            System.out.println("Gecersiz Sifre");
        }
















    }


















    }














