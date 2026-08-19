package Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sayfa80 {

    public static void main(String[] args) {

        /*

        1) Bir listede kaç farklı öğe olduğunu gösteren kodu yazınız.
        Örnek: {10, 31, 15, 7, 15, 7, 7} ==> 4

        */

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(7);
        myList.add(7);

        Set<Integer> mySet = new HashSet<>(myList);
        System.out.println(mySet.size());

        /*

        2) Set ve Liste arasındaki ortak öğeleri yazdırmak için kod yazınız.
        Örnek: {10, 31, 15, 7, 13} ==> List {10,7,35,13} ==> Set


        */

        List<Integer> myList1 = new ArrayList<>();
        myList1.add(10);
        myList1.add(31);
        myList1.add(15);
        myList1.add(7);
        myList1.add(13);

        Set<Integer> mySet1 =new HashSet<>();
        mySet1.add(10);
        mySet1.add(7);
        mySet1.add(35);
        mySet1.add(13);

        mySet1.retainAll(myList1);
        System.out.println(mySet1);



    }


}
