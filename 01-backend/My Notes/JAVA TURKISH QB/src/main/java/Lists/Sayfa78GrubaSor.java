package Lists;

import java.util.ArrayList;
import java.util.List;

public class Sayfa78GrubaSor {


    public static void main(String[] args) {


    /*

    11) Döngüleri kullanarak tamsayılardan oluşan bir listenin tüm öğelerinin benzersiz (tekrarsız) olup olmadığını kontrol ediniz.

    */

        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(31);
        liste.add(15);
        liste.add(7);
        liste.add(15);
        liste.add(23);
        Integer counter = 0;
        for (Integer w : liste) {

            for (Integer k : liste) { //Neden nested for each yaptık ve burada counter ne işe yarıyor?

                if (w==k){

                    counter++;

                }

            }

        }
        if (counter==liste.size()){

            System.out.println("Tekrarlanan oge yoktur");

        }else{

            System.out.println("En az 1 oge tekrarlanmistir ");
        }



    }






}
