package diger;

import java.util.Scanner;

public class Soru9 {


    public static void main(String[] args) {

        /*

        SORU 9 (INTERVIEW QUESTION) : Kullanicidan bir String isteyin. Kullanicinin girdigi String'in palindrome olup olmadigini kontrol eden
        bir program yazin.


        */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen String bir ifade giriniz");

        String ifade = input.nextLine();
        String yeniIfade = "";

        for (int i = ifade.length()-1; i > -1 ; i--) {
            char ch = ifade.charAt(i);
            yeniIfade += ch;
        }if (ifade.equalsIgnoreCase(yeniIfade)){
            System.out.println("palindrom");
        }else System.out.println("palindrom degil");

























































    }





















}
