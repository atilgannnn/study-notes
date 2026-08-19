package Loops;

public class Sayfa41 {

    public static void main(String[] args) {

        /*

        4) Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız. Örnek; 223878  ́ 37

        */

        //1. Yol:
        int num1 = 223878;
        String sayi1 = String.valueOf(num1);
        String d1 ="";
        for (int i = 0; i < sayi1.length() ; i++) {
            String c1 = sayi1.substring(i,i+1);
            if(sayi1.indexOf(c1) == sayi1.lastIndexOf(c1)){
                d1+=c1;
            }

        }
        System.out.println(d1);

        System.out.println();

        //2. Yol:

        int num2 = 223878;
        String sayi2 = String.valueOf(num2);
        String d2 = "";
        int j = 0;
        while(j<sayi2.length()){
            String c2 = sayi2.substring(j,j+1);
            if(sayi2.indexOf(c2) == sayi2.lastIndexOf(c2)){
                d2+=c2;
        }j++;
        }
        System.out.println(d2);

        System.out.println();

        //3. Yol:

        int num3 = 223878;
        String sayi3 = String.valueOf(num3);
        String d3 = "";
        int k = 0;
        do {
            String c3 = sayi3.substring(k,k+1);
            if (sayi3.indexOf(c3) == sayi3.lastIndexOf(c3)){
                d3+=c3;
            }
            k++;
        }while(k<sayi3.length());

        System.out.println(d3);






























    }
























}
