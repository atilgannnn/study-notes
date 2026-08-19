package Loops;

public class Sayfa48 {


    public static void main(String[] args) {


        /*

        11) Bir String’ i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM

        */

        //1. Yol:
        String name = "Mark";
        String newName = "";
        for (int i = name.length()-1; i > -1 ; i--) {

            String a = name.substring(i,i+1);
            newName += a;

        }

        System.out.println(newName);

        System.out.println();

        //2. Yol:
        String name1 = "Mark";
        String newName1 = "";
        int j = name1.length()-1;
        while(j>-1){
            String b = name.substring(j,j+1);
            newName1 += b;
            j--;
        }
        System.out.println(newName1);

        System.out.println();

        //3. Yol:

        String name2 = "Mark";
        String newName2 = "";
        int k = name2.length()-1;
        do {

            String c = name2.substring(k,k+1);
            newName2 += c;
            k--;
        }while(k>-1);

        System.out.println(newName2);













    }



}
