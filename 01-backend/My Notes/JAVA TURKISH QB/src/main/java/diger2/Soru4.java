package diger2;

public class Soru4 {

            /*

            What is the result of the following code?

            */

    public static void main(String[] args) {


        int total = 0;

        StringBuilder letters = new StringBuilder("abcdefg");

        total += letters.substring(1, 2).length();
        total += letters.substring(6, 6).length();
        //total += letters.substring(6, 5).length();
        System.out.println(letters.subSequence(1, 3));

        System.out.println(total);

    }








}
