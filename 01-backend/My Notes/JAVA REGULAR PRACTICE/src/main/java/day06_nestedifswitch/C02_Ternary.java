package day06_nestedifswitch;

import java.util.Scanner;

public class C02_Ternary {

    public static void main(String[] args) {

        /*
            Kullanicidan Final notunu 'A' ,'B' ,'C' seklinde  girmesini isteyiniz,
            'A'  ->  "Cok Basarili"
            'B'  ->  "Basarili"
            'C'  ->  "Orta"    bu notlar disindakilere de
                     Digerleri..
                        yazdiriniz.Nested Ternary ile cozunuz
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir harf notu giriniz...");
        String finalNotu =input.next();

        String result = (finalNotu.equalsIgnoreCase("A"))    ?   "Çok Başarılı"  :
                        (finalNotu.equalsIgnoreCase("B"))    ?   "Başarılı"      :
                        (finalNotu.equalsIgnoreCase("C"))    ?   "Orta"          : "Diğerleri";

        System.out.println(result);




















    }














}
