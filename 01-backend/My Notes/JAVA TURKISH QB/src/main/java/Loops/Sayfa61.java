package Loops;

public class Sayfa61 {

    /*

    29) Herhangi bir döngü kullanmadan 1'den 100'e kadar tam sayıları yazdıran bir program yazınız.

    */

    public static void main(String[] args) {
        printNumbers(100);
    }

    private static void printNumbers(int i) {
        if (i>0){

            printNumbers(i-1);
            System.out.print(i+" ");

        }
        return;
    }





}
