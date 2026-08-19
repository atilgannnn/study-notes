package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sayfa70 {

    public static void main(String[] args) {


        /*

        13) Kullanıcıdan 2 String girmesini isteyiniz.
        Stringlerin karakterleri ve karakter sayıları aynıysa konsola "Anagramdır" yazdırın.
        Aksi takdirde, konsolda "Anagram Değil" yazdırınız.

        Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.


        */

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci string ifadeyi giriniz");

        String a = input.nextLine();

        System.out.println("İkinci string ifadeyi giriniz");
        String b = input.nextLine();

        String[] arr1 = a.toLowerCase().split("");
        Arrays.sort(arr1);
        String [] arr2 = b.toLowerCase().split("");
        Arrays.sort(arr2);

        if (a.length()!=b.length()){

            System.out.println("Anagram değil");
        } else if (a.isEmpty() || b.isEmpty()) {

            System.out.println("Anagram değil");
            
        } else if (Arrays.equals(arr1,arr2)) {

            System.out.println("Anagram");
            
        }else{

            System.out.println("Anagram değil");
        }


    }



}
