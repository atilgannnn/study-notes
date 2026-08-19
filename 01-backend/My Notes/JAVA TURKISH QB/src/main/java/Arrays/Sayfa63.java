package Arrays;

import java.util.Arrays;

public class Sayfa63 {


    public static void main(String[] args) {

        /*


        1) Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.

        Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
               (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10


         */

        int a [] = new int[]{12,5,8,13,14};
        Arrays.sort(a);

        System.out.println(Arrays.toString(a));//[5, 8, 12, 13,14]

        if (a.length%2!=0){

            int ortaElemanIdx = a.length/2;
            System.out.println(a[ortaElemanIdx]);

        }else{

            int ortaElemanIdx = a.length/2;
            int ortaEleman = (a[ortaElemanIdx]+a[ortaElemanIdx-1])/2;
            System.out.println(ortaEleman);

        }

        /*
            2) String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
            Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

        */

        String[] names = new String[]{"Kemal","Jonathan","Mark","Angie","Veli"};

        int minLength = names[0].length();
        System.out.println(minLength);//5 --> "Kemal" in length'ini farazi olarak en kucuk atadık.

        for (String w : names){

            minLength = Math.min(minLength,w.length());

        }

        for (String w : names){

            if (minLength == w.length()){

                System.out.println(w);
            }

        }










    }


}
