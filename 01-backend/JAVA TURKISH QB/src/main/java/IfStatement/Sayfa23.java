package IfStatement;

public class Sayfa23 {

    public static void main(String[] args) {


        /*

        8) ABD'deki eyalet kısaltmalarının biçimini kontrol etmek için kod yazınız.
        a) Kısaltma 2'den fazla karakter içeriyor ise kodunuz, "Eyalet kısaltmaları 2 karakterden fazla olamaz" yazmalıdır.
        b) Kısaltmada küçük harfler var ise kodunuz, "Eyalet kısaltmaları küçük harf içeremez" yazmalıdır.
        c) Kısaltmanın harflerinden farklı karakterler var ise kodunuz, "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez" yazmalıdır.
        Not: Kısaltmada 1'den fazla hata varsa ilgili tüm hata mesajları yazdırılmalıdır.
        örnek; "fl3" için kodunuz; "Eyalet kısaltmaları 2 karakterden fazla olamaz",
        "Eyalet kısaltmaları küçük harf içeremez", ve "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez" yazmalıdır.

        */

        String eyaletKodu = "fl3";

        if (eyaletKodu.length() > 2){
            System.out.println("Eyalet kısaltmaları 2 karakterden fazla olamaz");
        }if (eyaletKodu.replaceAll("[^a-z]","").length()!=0){
            System.out.println("Eyalet kısaltmaları kucuk harf içeremez");
        }if (eyaletKodu.replaceAll("[^a-zA-z]", "").length()!=0){
            System.out.println("Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez");
        }else System.out.println("Kodunuz Dogru");






























    }















}
