package Lists;

import java.util.ArrayList;
import java.util.List;

public class Sayfa74GrubaSor {

    public static void main(String[] args) {

        /*

        5) Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
           Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)

        */

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(11);
        myList.add(15);
        myList.add(34);
        myList.add(43);

        System.out.println(myList);
        if (myList.contains(15)){

            for (Integer w : myList) {

                if (w==15){

                    int idx = myList.indexOf(15); //int idx olusturmadan myList.set(15,51) yapınca OutOfBounds exception atıyor neden?
                    myList.set(idx,51);

                }

            }
            System.out.println(myList);

        }else{

            System.out.println("Liste 15 elemanini icermiyor");
        }





    }

}
