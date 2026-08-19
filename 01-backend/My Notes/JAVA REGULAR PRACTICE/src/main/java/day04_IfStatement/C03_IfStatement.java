package day04_IfStatement;

import java.util.Locale;
import java.util.Scanner;

public class C03_IfStatement {


    public static void main(String[] args) {

        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hristiyanlar icin kutsal gun” yazdirin.

        // String'lerde == neden kullanilmaz. Onun yerine equals kullaniriz. Cunku Java'da 2 tane memory var. Stack ve Heap.
        //Non-Primitive olan String'de referans değerine de bakıldığı için "==" yerine "equals" kullanılır.

        // 1.Yol:

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");

        String gun = input.next().toLowerCase();//toLowerCase kucuk harf yapar.

        if(gun.equals("cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        }if(gun.equals("cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");
        }if (gun.equals("pazar")){
            System.out.println("Hristiyanlar icin kutsal gun");
        }if(!gun.equals("cuma") && !gun.equals("cumartesi") && !gun.equals("pazar")){
            System.out.println("Kutsal gun degil");
        }

        // 2.Yol:

        String gun1 = input.next();
        if(gun1.equalsIgnoreCase("cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        }if(gun1.equalsIgnoreCase("cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");
        }if(gun1.equalsIgnoreCase("pazar")){
            System.out.println("Hristiyanlar icin kutsal gun");
        }if (!gun1.equalsIgnoreCase("cuma") && !gun1.equalsIgnoreCase("cumartesi") && !gun1.equalsIgnoreCase("pazar")){
            System.out.println("Kutsal gun degil");
        }

        // 3. Yol:
        String gun2 = input.next().toLowerCase();

        if (gun2.equals("cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        } else if (gun2.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        }else if (gun2.equals("pazar")){
            System.out.println("Hristiyanlar icin kutsal gun");
        }else                                                   //Else'de curly braces açmamıza gerek yok.
            System.out.println("Kutsal gun degil");
        }


    }

