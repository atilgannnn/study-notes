package Loops;

public class Sayfa44 {


    public static void main(String[] args) {
        /*

            7) Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
            3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30

        */

        //1. Yol:

        int num1 = 3;
        for (int i = 1; i < 11; i++) {

            System.out.println(num1+"X"+i+"="+num1*i);

        }

        System.out.println();

        //2. Yol:

        int num2 = 3;
        int j = 1;
        while(j<11){

            System.out.println(num2+"X"+j+"="+num2*j);
            j++;
        }

        System.out.println();

        //3. Yol:

        int num3 = 3;
        int k = 1;
        do {
            System.out.println(num3+"X"+k+"="+num3*k);
            k++;
        }while (k<11);

















    }


}
