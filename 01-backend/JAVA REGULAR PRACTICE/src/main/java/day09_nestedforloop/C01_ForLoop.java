package day09_nestedforloop;

import java.util.Scanner;

public class C01_ForLoop {


    public static void main(String[] args) {


        /*
           Kullanıcıdan aldiğınız 'c' ve 'a' iceren bir String değer içerisindeki
        'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
        */
        
        //Bir soruyda kaç tane diyorsa muhakkak sayaç vardir!!!

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz...");
        String str = input.nextLine();
        
        int sayac = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a'){

                sayac++;
            } else if (str.charAt(i) == 'c' ) {
                break;

            }

        }

        System.out.println("'c' oncesi 'a' larin sayisi " + sayac);




















    }





















}
