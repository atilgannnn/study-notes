package Lists;

import java.util.ArrayList;
import java.util.List;

public class Sayfa72 {

    public static void main(String[] args) {

        /*

        3) Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.

        */

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);
        int multiply = 1;
        for (Integer w : myList) {

            if (w%2==0){

                multiply *= w;

            }else{

                continue;
            }

        }
        System.out.println(multiply);


    }


}
