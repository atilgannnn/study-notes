package Sets;

import java.util.*;

public class Sayfa81 {

    public static void main(String[] args) {

        /*

        3) Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
        Örnek: ‘Mississippi’  ́ Misp

        */

        String str = "Mississippi"; //String ifadeyi aldık
        String[] arr = str.split("");//Split kullanarak harf harf ayırdık ve array e atadık
        List<String> chars = Arrays.asList(arr);//Array'i List'e çevirdik
        Set<String> setStr = new HashSet<>(chars);//List'i Set'e atadık ki tekrarsız karakterler sadece kalsın
        System.out.println(setStr);


        /*

        4) Bir liste ve bir set oluşturunuz. Set içerisinde var olan listenin bütün elemanlarını kaldıran bir kod yazınız.

        */

        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(31);
        a.add(15);
        a.add(7);
        a.add(13);

        Set<Integer> b = new HashSet<>();
        b.add(10);
        b.add(7);
        b.add(35);
        b.add(13);

        b.removeAll(a);
        System.out.println(b);//[35]





    }


}
