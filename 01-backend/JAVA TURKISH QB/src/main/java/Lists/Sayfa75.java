package Lists;

import java.util.ArrayList;
import java.util.List;

public class Sayfa75 {

    public static void main(String[] args) {

        /*

        6) Listede 15 veya 13 varsa, bu elemanları kaldırınız.
           Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)

        */

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(31);
        list.add(15);
        list.add(13);
        list.add(54);
        if (!list.contains(13) && !list.contains(15)){

            System.out.println("Liste 13 ve 15 içermiyor");

        }else{

            for (int i = 0; i < list.size(); i++) {

                if(list.get(i)==13){

                    int idx13 = list.indexOf(13);
                    list.remove(idx13);
                    i--;

                }

                if (list.get(i)==15){

                    int idx15 = list.indexOf(15);
                    list.remove(idx15);
                    i--;
                }

            }
            System.out.println(list);
        }


    }


}
