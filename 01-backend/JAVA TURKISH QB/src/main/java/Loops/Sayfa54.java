package Loops;

public class Sayfa54 {

    public static void main(String[] args) {

        /*

        17) Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.

        */

        int num = 12345;
        int sum = 0;
        for (int i = num; i > 0 ; i=i/10) {

            sum = sum + i%10;

        }

        System.out.println(sum);

        System.out.println();

        int sum2 = 0;
        int j = num;
        while(j>0){

            sum2 = sum2 + j%10;
            j = j/10;
        }

        System.out.println(sum2);

        System.out.println();

        int sum3 = 0;
        int k = num;
        do {
            sum3 = sum3 + k%10;
            k = k/10;
        }while (k>0);

        System.out.println(sum3);





    }




}
