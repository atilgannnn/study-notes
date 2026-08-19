package Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sayfa82 {

    public static void main(String[] args) {

        /*

        5) Bir listede tekrarlanan öğeler olup olmadığını kontrol etmek için kodu yazınız.

        */

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(13);

        Set<Integer> mySet = new HashSet<>(myList);

        if (myList.size()>mySet.size()){

            System.out.println("Tekrarlanan oge vardır");
        }else{

            System.out.println("Tekrarlanan oge yoktur");
        }




    }

}
