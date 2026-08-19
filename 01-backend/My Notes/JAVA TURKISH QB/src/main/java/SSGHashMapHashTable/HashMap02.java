package src.main.java.SSGHashMapHashTable;

import java.net.CookieHandler;
import java.util.Collection;
import java.util.Map;

public class HashMap02 {

    public static void main(String[] args) {

        Map<Integer,String> sinif = Students.myMap();
        System.out.println(sinif);
        System.out.println(sinif.keySet());
        System.out.println(sinif.entrySet());
        Collection<String> values = sinif.values();

        //sadece values
        for (String w : values){

            System.out.println(w);

        }

        System.out.println("keys:values");
        for (Map.Entry<Integer,String> w : sinif.entrySet()){

            System.out.println(w.getKey()+" "+w.getValue());


        }


    }


}
