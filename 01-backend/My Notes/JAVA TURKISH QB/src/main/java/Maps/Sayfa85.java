package Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Sayfa85 {

    public static void main(String[] args) {

        /*

        5) Bir String’ deki kelimelerin kaç defa tekrarlandığını ifade eden kod yazınız.(Büyük/küçük harfe duyarlı değil)

        */

        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";

        s = s.replaceAll("[\\p{Punct}]","").toLowerCase();
        Map<String,Integer> wordOccurance = new HashMap<>();
        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));//[apex, is, easy, type, codes, to, learn, apex, to, earn, money, learn, apex]
        for (String w : words){
            Integer numOfOccurance = wordOccurance.get(w);
            if(numOfOccurance==null){

                wordOccurance.put(w,1);

            }else{

                wordOccurance.put(w, numOfOccurance+1);

            }
            System.out.println(wordOccurance);//{codes=1, money=1, learn=2, earn=1, is=1, to=2, type=1, easy=1, apex=3}


        }


    }

}
