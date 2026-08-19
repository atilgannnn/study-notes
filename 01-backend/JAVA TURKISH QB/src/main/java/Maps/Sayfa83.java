package Maps;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Sayfa83 {

    public static void main(String[] args) {

        /*

        1) Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map bulunmaktadır.
        Toplam ürün sayısını bulmak için kodu yazınız.

        */

        Map<String,Integer> product = new HashMap<>();
        product.put("Laptop",12);
        product.put("TV",53);
        product.put("Refrigerator",12);
        product.put("Music System",87);

        Collection<Integer> numOfProducts = product.values();

        Integer sum = 0;
        for (Integer w : numOfProducts){

            sum += w;
        }

        System.out.println(sum);

        /*

        2) Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map bulunmaktadır.
        Ürünler arasında " Laptop " olup olmadığını kontrol etmek için kodu yazınız.

        */

        Map<String,Integer> goods = new HashMap<>();
        goods.put("Laptop",12);
        goods.put("TV",53);
        goods.put("Refrigerator",12);
        goods.put("Music System",87);

        String expectedProduct = "Laptop";
        if (goods.containsKey(expectedProduct)){

            System.out.println("Var");

        }else{

            System.out.println("Yok");
        }


    }

}
