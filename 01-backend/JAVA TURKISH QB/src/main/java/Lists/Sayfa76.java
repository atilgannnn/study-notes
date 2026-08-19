package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sayfa76 {

    public static void main(String[] args) {

        /*

        7) Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
           Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür.

        */

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(15);
        myList.add(13);
        myList.add(54);
        Collections.sort(myList);
        System.out.println(myList);

        int minFark = Integer.MAX_VALUE;
        for (int i = 1; i < myList.size() ; i++) {

            minFark = Math.min(minFark, myList.get(i) - myList.get(i-1));
        }
        for (int i = 1; i < myList.size() ; i++) {

            if (myList.get(i) - myList.get(i-1) == minFark){

                System.out.println(myList.get(i)+ " and " +myList.get(i-1));

            }

        }

        /*

        8) Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
           Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)

        */

        List<Integer> myList2 = new ArrayList<>();
        myList2.add(12);
        myList2.add(31);
        myList2.add(7);
        myList2.add(13);
        myList2.add(10);
        System.out.println(myList2);
        for (Integer w : myList2) {

            if (w==7 || w==10 ){
                continue;
            }

            myList2.set(myList2.indexOf(w),w+2);

        }
        System.out.println(myList2);



    }



}
