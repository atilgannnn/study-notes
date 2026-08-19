package diger;

import java.util.Scanner;

public class Soru7 {

    public static void main(String[] args) {

        /*

        SORU 7 (INTERVIEW QUESTION) : Kullanicidan bir String isteyin ve String'i tersten yazdirin.

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz...");

        String str = input.nextLine();
        String ters = "";

        for (int i = str.length()-1; i > -1 ; i--) {
            char ch = str.charAt(i);
            ters+=ch;

        }
        System.out.println(ters);






















        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen String bir ifade giriniz");

        String ifade = input.nextLine();
        String tersIfade = "";
        for (int i = ifade.length()-1; i >-1 ; i--) {
            char ch = ifade.charAt(i);
            tersIfade+=ch;

        }
        System.out.println(tersIfade);

        */





























    }




























}
