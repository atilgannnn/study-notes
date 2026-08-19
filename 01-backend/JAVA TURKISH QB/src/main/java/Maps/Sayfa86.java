package Maps;

import java.util.*;

public class Sayfa86 {

    public static void main(String[] args) {

        /*

        6) Belirli bir listede tekrarlanan öğelerin sayısı nasıl kontrol edilir?

        */

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);

        Map<Integer,Integer> myMap = new HashMap<>();

        for (Integer w : myList){

            Integer numOfOccurance = myMap.get(w);
            if (numOfOccurance==null){

                myMap.put(w,1);

            }else{

                myMap.put(w,numOfOccurance+1);
            }

        }

        Collection<Integer> myValues = myMap.values();
        System.out.println(myValues);//[1, 2, 3, 1]
        Integer counter = 0;
        for (Integer w : myValues){

            if (w>1){

                counter++;
            }

        }

        System.out.println("Tekrarlanan oge sayisi " +counter+ " tanedir");//Tekrarlanan oge sayisi 2 tanedir



    }

}
