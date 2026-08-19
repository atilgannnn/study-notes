package Arrays;

public class Sayfa67 {

    public static void main(String[] args) {

        /*

        8) İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.

        */

        String [] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};

        int size = arr.length;

        for (int i = 0; i < size ; i++) {

            String firstChar = arr[i].substring(0,1);
            String lastChar = arr[i].substring(arr[i].length()-1);

            if (firstChar.equals(lastChar)){

                System.out.print(arr[i]+" ");//alabama sos sets


            }


        }


        System.out.println();

        /*

        9) Verilen bir String arraydeki belirli bir öğenin var olup olmadığını bulmak için kod yazınız.

        */

        String[] array = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};

        String s = "object";

        int counter = 0;

        for (String w : array){

            if (w.equalsIgnoreCase(s)){

                counter++;

            }


        }

        if (counter>0){

            System.out.println(s+ " Array'de var");
        }else{

            System.out.println(s+ " Array'de yok");
        }








    }



}
