package day14_inheritenceencapsulation.KelimeOyunu;

import java.util.Scanner;

public class KelimeOyunuHocanınÇözümü {



        static int oyuncu=1;
        static int puan1=0;
        static int puan2=0;
        static String kelime="";
        static  String ekleme="";
        static Scanner input=new Scanner(System.in);

        public static void main(String[] args) {


            System.out.println(oyuncu+".oyuncu bir kelime giriniz");
            kelime=input.next();//oyuncunu verdigi kelimeyi class levelda hiclik olarak atamistik

            oyuncuDegistir();//oyuncu degistirme methodu
            onaySor();
        }

        public static void onaySor() {
            System.out.println("Girilen kelime "+kelime);
            System.out.println(oyuncu+" .oyuncu girilen kelimeyi kabul ediyormusunuz: \n 1: Evet \n 0 Hayir");

            int kabul=input.nextInt();
            if(kabul==1) {//1 tercihi girilen kelimeyi kabiul ettigini gosterir
                if(oyuncu==1){//islemi yapan 1.oyuncu ise
                    puan2+=kelime.length();

                }else
                    puan1+=kelime.length();
                oyunaDevamEdecekMi();



            }else oyunuBitir();// girilen kelimeyi kabul etmiyor

        }

        private static void oyunaDevamEdecekMi() {

            System.out.println("oyuna devam etmek istiyormusunuz 1: Evet 0: Hayir");
            int tercih=input.nextInt();
            if(tercih==1) {//1 ise devam
                kelimeEkle();
            }else {
                System.out.println("Oyun Bitti");
                System.out.println("Havva hanimin puani "+puan1);
                System.out.println("Goksel beyin puani "+puan2);
                if(puan1>puan2){
                    System.out.println("Kazanan Havva hanim");
                }else if(puan2>puan1){
                    System.out.println("Kazana Goksel bey");
                }else
                    System.out.println("Oyun berabere");
            }
        }

        private static void kelimeEkle() {
            System.out.println("Eski kelimeye eklenecek str giriniz");
            ekleme=input.next();
            System.out.println("Yeni str'i basa mi sona mi ekliyelim ?\n 1: basa ekle 0: sona ekle");

            int tercih=input.nextInt();
            if(tercih==1) {
                kelime = ekleme + kelime;
            }else kelime=kelime+ekleme;
            oyuncuDegistir();
            onaySor();

        }

        private static void oyunuBitir() {
            System.out.println("Oyunu "+oyuncu+" .oyuncu kazandi ");
        }

        public static void oyuncuDegistir() {
            if(oyuncu==1){//havva
                oyuncu=2;//goksel bey
            }else
                oyuncu=1;
        }


    }




