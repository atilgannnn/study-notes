package day14_inheritenceencapsulation.KelimeOyunu;

import java.util.Scanner;

public class KelimeOyunu {

    static int oyuncu = 1;

    static int puan1 = 0;

    static int puan2 = 0;

    static String kelime = "";

    static String ekleme = "";

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(oyuncu+". oyuncu bir kelime giriniz: "+kelime);

        kelime = input.next();//oyuncunun verdigi kelimeyi class levelda hiclik olarak atamistik

        oyuncuDegistir();//Oyuncu degistirme methodu

        onaySor();





    }

    public static void onaySor() {

        System.out.println("Girilen kelime: " +kelime);
        System.out.println(oyuncu+ ". girilen kelimeyi kabul ediyor musunuz? :\n 1: Evet \n 0: Hayır");

        int kabul = input.nextInt();

        if(kabul==1){//1 tercihi girilen kelimeyi kabul ettigini gosterir

            if (oyuncu==1) {//islemi yapan 1.oyuncu ise

                puan2 += kelime.length();

            }else{

                puan1+=kelime.length();
                oyunaDevamEdecekMi();

            }

        }else{

            oyunuBitir();//girilen kelimeyi kabul etmiyor

        }


    }

    public static void oyunaDevamEdecekMi(){

        System.out.println("Oyuna devam etmek istiyor musunuz? : 1:Evet  2:Hayır");
        int tercih = input.nextInt();
        if (tercih==1) {//1 ise devam

            kelimeEkle();
        }else{

            System.out.println("Oyun bitti");
            System.out.println("Birinci oyuncunun puanı: "+puan1);
            System.out.println("İkinci oyuncunun puanı: "+puan2);

            if (puan1>puan2){

                System.out.println("Kazanan Havva Hanım");

            }else if(puan2>puan1){

                System.out.println("Kazanan Göksel Bey");

            }else{

                System.out.println("Oyun berabere");
            }
        }


    }

    private static void kelimeEkle() {


        System.out.println("Eski kelimeye eklenecek str giriniz");
        ekleme = input.next();

        System.out.println("Yeni str ı başa mı sona mı ekleyelim? \n 1:Başa ekle \n 0:Sona ekle");
        int tercih = input.nextInt();

        if (tercih==1){

            kelime=ekleme+kelime;

        }else{

            kelime=kelime+ekleme;
        }

        oyuncuDegistir();
        onaySor();


    }

    private static void oyunuBitir() {

        System.out.println("Oyunu " +oyuncu+" kazandı");

    }

    public static void oyuncuDegistir() {

        if(oyuncu==1){//havva

            oyuncu=2;//goksel

        }else{

            oyuncu=1;

        }






    }


}
