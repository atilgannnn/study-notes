package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sayfa77 {

    public static void main(String[] args) {

        /*

        9) String bir listede verilen tüm fiyatların toplamını bulunuz.
           Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04

        */

        List<String> list = new ArrayList<>();
        list.add("$12.99");
        list.add("$23.60");
        list.add("$54.45");
        double sum = 0;
        for (String w : list) {

            Double price = Double.valueOf(w.replace("$",""));
            sum += price;

        }
        System.out.println(sum);//91.04

        /*

        10) Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
            Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70

        */

        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$8.25");
        myList.add("$23.60");
        myList.add("$54.45");
        List<Double> decimalList = new ArrayList<>();
        for (String w : myList) {

            Double decimalPrice = Double.valueOf(w.replace("$",""));
            decimalList.add(decimalPrice);

        }
        System.out.println(decimalList);//[12.99, 8.25, 23.6, 54.45]

        Collections.sort(decimalList);
        System.out.println(decimalList);//[8.25, 12.99, 23.6, 54.45]
        Double sum2 = decimalList.get(0) + decimalList.get(decimalList.size()-1);
        System.out.println(sum2);//62.7



    }

}
