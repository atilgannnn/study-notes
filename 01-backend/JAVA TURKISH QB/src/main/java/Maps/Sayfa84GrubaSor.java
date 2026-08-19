package Maps;

import java.util.*;

public class Sayfa84GrubaSor {

    public static void main(String[] args) {

        /*

        3) Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map bulunmaktadır.
        Ürün sayılarını artan sırada yazdırınız.

        */

        Map<String,Integer> products = new HashMap<>();
        products.put("Laptop",82);
        products.put("TV",53);
        products.put("Refrigerator",12);
        products.put("Music System",87);
        products.put("Mobile Phone",53);

        Object[] productNumber = products.values().toArray();//Burada neden Object kullandık??
        Arrays.sort(productNumber);
        System.out.println(Arrays.toString(productNumber));//[12, 53, 53, 82, 87]


        /*

        4) Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map bulunmaktadır.
        Ürün adlarını alfabetik sırayla yazdırınız.

        */

        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);

        Set<String> productNames = product.keySet();
        List<String> listedProductNames = new ArrayList<>(productNames);
        System.out.println(listedProductNames);//[Laptop, TV, Refrigerator, Music System, Mobile Phone] --> Alfabetik olmadı!!





    }

}
