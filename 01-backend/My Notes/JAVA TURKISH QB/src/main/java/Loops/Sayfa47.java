package Loops;

import java.util.Arrays;

public class Sayfa47 {

    public static void main(String[] args) {

        /*

        10) Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız işaretiyle yazdırmak için gereken kodu yazınız.
        Örneğin; 75.4238  ́ *4*2*3*8

        */

        double number = 75.4238;
        String s = String.valueOf(number);

        s = s.split("\\.")[1];
        System.out.println(s);

        String newS = "";
        for (int i = 1; i <= s.length() ; i++) {
            String x = s.substring(i-1,i);

            newS += "*" + x;
        }

        System.out.println(newS);

























    }









}
