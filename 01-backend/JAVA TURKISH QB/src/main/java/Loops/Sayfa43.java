package Loops;

public class Sayfa43 {

    public static void main(String[] args) {

        /*

        6) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.

                A
                A A
                A A A
                A A A A

        */

        //1. Yol:

        int rows = 4;

        for (int i = 1; i < 5 ; i++) {
            String str = "";
            for (int j = 0; j < i ; j++) {
                str=" A";
                System.out.print(str);
            }

            System.out.println();
        }

        System.out.println();

        //2. Yol:

        int rows1 = 4;
        int k = 1;

        while(k<5){
            String str1 = "";
            for(int l = 0; l < k ; l++){
                str1+=" A";
            }

            System.out.println(str1);
            k++;
        }

        System.out.println();

        //3. Yol:

        int rows2 = 4;
        int m = 1;
        do {
            String str2 = "";
            for (int n = 0; n < m ; n++ ){
                str2+=" A";
            }
            System.out.println(str2);
            m++;
        }while(m<5);




























    }





















}
