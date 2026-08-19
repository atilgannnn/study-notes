package Arrays;

import java.util.Arrays;

public class Sayfa68 {

    public static void main(String[] args) {

        /*

        10) Verilen bir String arraydeki öğelerin karakterlerinin toplamını bulmak için kod yazınız.

        */

        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};

        int sum1 = 0;
        int sum2 = 0;

        for (String w : arr){

            sum1 += w.length();

            for (int i = 0; i < w.length() ; i++) {

                char ch = w.charAt(i);

                sum2 += ch;

                System.out.println(sum2);//2247

            }

        }
        System.out.println(sum1);//21

        //BU SORUDA CHARACTERLERIN ASCII DEGERLERİ TOPLAMI DESEYDI NASIL YAPABILIRDIK?

        /*

        11) Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız.
        Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

        */

        int [] array = new int[]{5,0,2,0,3};
        int [] array2 = new int[array.length];

        int firstIdx = 0;
        int lastIdx = array.length-1;

        for (int i = 0; i < array.length; i++) {

            if (array[i]!=0){

                array2[firstIdx] = array[i];
                firstIdx++;

            }else{

                array2[lastIdx]=0;
                lastIdx--;

            }


        }
        System.out.println(Arrays.toString(array2));//[5, 2, 3, 0, 0]








    }


}
