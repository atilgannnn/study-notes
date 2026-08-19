package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        /*
                Example 1: Kullanicidan aldiginiz ismin ilk ve son harfini ekrana yazdiriniz.
                Ramazan ==> RN


         */

        //1.Yol:
        Scanner input = new Scanner(System.in);
       // System.out.println("Lutfen isminizi giriniz...");
       //  String isim = input.next();

        //char ilkHarf = isim.charAt(0);

        //char sonHarf = isim.charAt(isim.length()-1);//Yazdiginiz kod sadece bazi durumlar icin calisirsa o code'a "Hard Coding" denir.
                                                    //Yazdiginiz kod her durum icin calisirsa o code'a "Dynamic Coding" denir.
        //System.out.println(" "+ilkHarf+sonHarf);

        //2.Yol:
        //String ilk = isim.substring(0,1);

        //String son = isim.substring(isim.length()-1);

       //System.out.println(ilk+son);

        //Example 2: Verilen String'deki sadece hayvan isimlerini yazdiriniz.
        //          "Ben kedi, esim tavuk, oglum sever inek"


        //substring()'in 2 kullanimi vardir.
        //i)substring(baslangic indeksi,bitis indeksi) String'in ortasindan bir parca almaya yarar
        //ii)substring(baslangic indeksi) String'in verilen indeksten sonuna kadar almaya yarar.
        String str = "Ben kedi, esim tavuk, oglum sever inek";
        String kedi = str.substring(4,8);
        String tavuk = str.substring(15,20);
        String inek = str.substring(34,38);
        System.out.println(kedi+tavuk+inek);

        //Example 3:Ilk isim ve soy isimi iceren isimlerden ilk ve soy isimlerin bas harflerini ekrana yazdiriniz.
        //          Ali Can ==> AC          Tahsin Yurdakul ==> TY

        System.out.println("Ilk ve soy isminizi giriniz");
        String tamIsim = input.nextLine();

        String a = tamIsim.substring(0,1);
        String b = tamIsim.split(" ")[1].substring(0,1);

        System.out.println(a+b);











    }









}
