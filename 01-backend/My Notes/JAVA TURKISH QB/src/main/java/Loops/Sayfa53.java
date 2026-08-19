package Loops;

public class Sayfa53 {

    public static void main(String[] args) {

        /*

        16) Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.

        */

        //1. Yol:

        String s = "Christmas";
        String result = "";

        for (int i = 0; i < s.length() ; i++) {

            String ch = s.substring(i,i+1);
            if (ch.equals("m")){
                break;
            }

            result += ch;

        }
        System.out.println(result);

        System.out.println();

        //2. Yol:

        String result2 = "";
        int j = 0;

        while (j<s.length()){

            String ch2 = s.substring(j,j+1);


            if (ch2.equals("m")){
                break;
            }
            result2 += ch2;
            j++;
        }

        System.out.println(result2);

        System.out.println();

        //3. Yol:

        String result3 = "";
        int k = 0;

        do {

            String ch3 = s.substring(k,k+1);


            if (ch3.equals("m")){
                break;
            }

            result3 += ch3;
            k++;

        }while (k<s.length());

        System.out.println(result3);




    }




}
