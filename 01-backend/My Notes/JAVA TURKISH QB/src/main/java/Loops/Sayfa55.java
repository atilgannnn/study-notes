package Loops;

public class Sayfa55 {

    public static void main(String[] args) {

        /*

        18) Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız. Örneğin; Hello ==> Heo

        */

        //1. Yol:
        String s = "Hello";
        for (int i = 0; i < s.length(); i++) {

            String ch = s.substring(i,i+1);
            if (s.indexOf(ch)==s.lastIndexOf(ch)){

                System.out.print(ch);


            }


        }

        System.out.println();


        //2. Yol:

        int j = 0;
        while(j<s.length()){

            String ch2 = s.substring(j,j+1);
            if (s.indexOf(ch2) == s.lastIndexOf(ch2)){
                System.out.print(ch2);

            }

            j++;

        }

        System.out.println();

        int k = 0;
        do {

            String ch3 = s.substring(k,k+1);
            if (s.indexOf(ch3) == s.lastIndexOf(ch3)){

                System.out.print(ch3);

            }

            k++;


        }while(k<s.length());




    }


}
