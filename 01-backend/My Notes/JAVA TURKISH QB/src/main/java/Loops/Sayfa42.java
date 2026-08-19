package Loops;

public class Sayfa42 {


    public static void main(String[] args) {

        /*

        5) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
                                       A A A A A
                                       A A A A A
                                       A A A A A
        */

        int rows = 3;
        int columns = 5;

        for (int i = 1; i <= rows ; i++) {

            String s = "";
            for (int j = 1; j <= columns ; j++) {
                s+=" A";

            }
            System.out.println(s);
        }

        System.out.println();

        //2. Yol:

        int rows1 = 3;
        int columns1 = 5;
        int k = 1;
       while(k<=rows1){
           String s1 = "";
           for (int m = 1; m <=columns1 ; m++) {
               s1+=" A";
           }
           System.out.println(s1);
           k++;
       }

        System.out.println();

       //3. Yol:

        int rows2 = 3;
        int columns2 = 5;
        int o = 1;
        do {
            String s2 = "";
            for (int p = 1; p <= columns2 ; p++) {
                s2+=" A";
            }
            System.out.println(s2);
            o++;
        }while (o<=rows2);

        

















    }

















}
