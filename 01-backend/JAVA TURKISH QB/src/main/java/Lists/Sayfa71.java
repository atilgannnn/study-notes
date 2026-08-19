package Lists;

import java.util.ArrayList;
import java.util.List;

public class Sayfa71 {

    public static void main(String[] args) {


        /*

        1) Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.

        */

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);

        int sum = 0;

        for (Integer w: myList) {

            sum += w;


        }
        System.out.println(sum);

        /*

        2) Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.

        */

        List<Integer> myList2 = new ArrayList<>();
        myList2.add(12);
        myList2.add(31);
        myList2.add(7);
        myList2.add(13);
        myList2.add(10);

        int sum2 = 0;

        for (Integer w : myList2) {

            if (w==13){

                break;
            }

            sum2 += w;


        }

        System.out.println(sum2);



    }


}
