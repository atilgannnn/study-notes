package Loops;

public class Sayfa49 {

    public static void main(String[] args) {

        /*

        12) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.

                                A A A A A A A A
                                A X X X X X X A
                                A X X X X X X A
                                A X X X X X X A

        */


        //1. Yol:
        int rows1 = 4;
        int columns1 = 8;
        for (int i = 1; i <= rows1; i++) {

            String a = "";
            if (i == 1 || i == rows1) {

                for (int j = 1; j <= columns1; j++) {

                    a += "A ";

                }
                System.out.println(a);
            } else {

                a += "A ";

                for (int k = 2; k < columns1; k++) {

                    a += "X ";

                }

                a += "A ";
                System.out.println(a);

            }


        }

        System.out.println();

        //2. Yol:

            int rows2 = 4;
            int columns2 = 8;
            int l = 1;
            while (l <= rows2) {
                String b = "";
                if (l == 1 || l == rows2) {

                    for (int m = 1; m <= columns2; m++) {

                        b += "A ";

                    }
                    System.out.println(b);

                } else {
                    b += "A ";
                    for (int n = 2; n < columns2; n++) {

                        b += "X ";
                    }
                    b += "A ";
                    System.out.println(b);
                }

                l++;
            }


        }


    }













