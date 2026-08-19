package IfStatement;

import java.util.Scanner;

public class Sayfa22 {

    public static void main(String[] args) {
        /*
        7) Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.
        a) Kodunuz "ali Can", "Ali can", "ali can" için "Baş harflerinde hata" yazmalıdır.
        b) Kodunuz, aşağıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.
        c) "Ali" veya "Can" veya "ali"Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yazmalıdır.
        d) Kodunuz bir veya daha fazla boşluk (" " veya " " gibi karakterler) için " Isim girilmedi" yazmalıdır.
        e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad" yazmalıdır.
        Not : Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları çıktı olarak konsolda görünmelidir.
        Örneğin; "ali3" için kodunuz "Baş harflerinde hata", "Ad veya soyadı eksik" ve "Geçersiz Ad"
         */

        String isim = "Ali Can";
        String bosluksuzIsim = isim.trim();
        char adIlkHarf = bosluksuzIsim.charAt(0);
        char soyadIlkHarf = bosluksuzIsim.split(" ")[1].charAt(0);
        String ilkAd = bosluksuzIsim.split(" ")[0];
        String soyAd = bosluksuzIsim.split(" ")[1];

       }


    }






















