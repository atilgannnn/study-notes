package diger;

import java.util.Scanner;

public class Soru8 {


    public static void main(String[] args) {



         /*


        SORU 8 (INTERVIEW QUESTION) : Kullanicidan bir String isteyin ve String'i tersine ceviren bir method yazin.


        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz...");
        String str = input.nextLine();
        System.out.println("Bir sayi girin");
        int a = input.nextInt();
        System.out.println(str);
        System.out.println(tersIfade(str));
        a = Math.abs(a);
        int faktoryelSayisi = faktoriyel(a);
        System.out.println(faktoryelSayisi);
    }
        public static String tersIfade(String kelime){


            String ters = "";

            for (int i = kelime.length()-1; i > -1 ; i--) {
                char ch = kelime.charAt(i);
                ters+=ch;

            }return ters;


        }


        public static int faktoriyel (int sayi){
        int sum = 1;
        for (int k = sayi ; k > 0 ; k--){

            sum*=k;


        }return sum;






        }




















































}
