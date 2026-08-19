package Arrays;

import java.util.Arrays;

public class Sayfa65 {

    public static void main(String[] args) {

        /*

        4) String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini alınız.
        Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM

        */

        String[] names = new String[]{"Kemal","Jonathan","Mark","Jackson","Ali"};
        String initials = "";

        for (String w : names){

            if (w.endsWith("n") || w.endsWith("k")){

                initials += w.substring(0,1);

            }


        }

        System.out.println(initials);

        System.out.println();

        /*

        5) String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
        Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26

        */

        String [] names1 = new String[]{"Kemal","Jonathan","Mark","Angie","Veli"};

        int sum = 0;

        for (String w : names1){

            sum += w.length();

        }

        System.out.println("Total Number Of Characters Is: " +sum);






    }



}
