package StringManipulations;

import java.util.Locale;
import java.util.Scanner;

public class Sayfa12 {


    public static void main(String[] args) {

        /*

        15) String gomlekFiyat = ‘$12.99’;
        String kitapFiyat = ‘$35.99’;
        Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız.

        */

        String gomlekFiyat = "$12.99";
        String kitapFiyat = "$35.99";

        String g = gomlekFiyat.replaceAll("[$.]","");
        String k = kitapFiyat.replaceAll("[$.]","");
        

        double gomlekPrice = Double.valueOf(g);
        double kitapPrice = Double.valueOf(k);

        System.out.println("Toplam Fiyat " +(gomlekPrice+kitapPrice)/100);

        /*

        16) Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız. Not: İkinci isim kapsam dışındadır.
        Örnek: Tom Hanks ==> TH, Mary Star ==> MS

        */

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen isminizi ve soyisminizi giriniz...");

        //1. YOL:

        String isimSoyisim = input.nextLine().toUpperCase();
        String ilkHarf = isimSoyisim.substring(0,1);
        int soyadIlkHarfIndex = isimSoyisim.indexOf(" ")+1;
        String sonHarf = isimSoyisim.substring(soyadIlkHarfIndex,soyadIlkHarfIndex+1);
        System.out.println(ilkHarf+sonHarf);

        //2. YOL:

        String isim = isimSoyisim.substring(0,1);
        String soyIsim = isimSoyisim.split(" ")[1].substring(0,1);

        System.out.println(isim+soyIsim);

        /*

        17) Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.

        */

        String kelime = "Java.ile.hayat.cok.guzel.";

        //1. YOL:

        int noktalamaSayisi = kelime.replaceAll("[^\\p{Punct}]","").length();
        System.out.println(noktalamaSayisi);

        //2. YOL:

        int toplamKarakterSayisi = kelime.length();
        int noktalamaIsaretleriHariciSayi = kelime.replaceAll("\\p{Punct}","").length();
        int noktalamaIsaretlerininSayisi = toplamKarakterSayisi-noktalamaIsaretleriHariciSayi;

        System.out.println(noktalamaIsaretlerininSayisi);
























    }






















}
