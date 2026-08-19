package Loops;

public class Sayfa46 {


    public static void main(String[] args) {


        /*
        

        9) String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
        Örneğin; 'Ali Can?' ==> l*i*a*n*

        */

        //1. Yol:

        String a = "Ali Can?";
        a = a.replaceAll("[^a-z]","");
        String b = "";
        for (int i = 0; i < a.length() ; i++) {
            String c = a.substring(i,i+1);
            b += c + "*";
        }
        System.out.println(b);

        System.out.println();

        //2. Yol:

        String d = "Ali Can?";
        d = d.replaceAll("[^a-z]","");
        String e = "";
        int j = 0;
        while(j<d.length()){

            String f = d.substring(j,j+1);
            e += f+"*";
            j++;
        }
        System.out.println(e);

        System.out.println();

        //3. Yol:

        String g = "Ali Can?";
        g = g.replaceAll("[^a-z]","");
        String h = "";
        int k = 0;
        do {
            String o = g.substring(k,k+1);
            h += o+"*";
            k++;
        }while(k<g.length());
        System.out.println(h);





















    }



}
