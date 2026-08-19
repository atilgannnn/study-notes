package src.main.java.SSGHashMapHashTable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

    public static void main(String[] args) {

        /*
            Aşağıdaki anahtarlara ve değerlere sahip olacak bir MAP oluşturun
            Math = 9
            inglizce = 8
            Farsca = 7
            Turkce = 6
            Fransizce = 7
            Ardından, 7'den fazla olan tüm dersleri ve puanlarını yazdırın

         */


        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("Math", 9);
        hm1.put("ingilizce", 8);
        hm1.put("ingilizce", 9);
        hm1.put("Farsca", 7);
        hm1.put("Turkce", 6);
        hm1.put("Fransizca", 7);


        //1. Yol:
        Set<Map.Entry<String,Integer>> setForm1 = hm1.entrySet();
        for (Map.Entry<String,Integer> w : setForm1){

            if (w.getValue()>7){

                System.out.println("7 den fazla olan tum dersler " +w.getKey()+" "+w.getValue());

            }


        }




        //2. Yol:

        Set<String> keys = hm1.keySet();
        System.out.println(keys);//[Turkce, inglizce, Farsca, Math, Fransizce]

        Collection<Integer> values = hm1.values();
        System.out.println(values);//[6, 9, 7, 9, 7]

        for (Integer w : values){

            if (w>7){

                System.out.println("values : " +w);

            }


        }







    }


}
