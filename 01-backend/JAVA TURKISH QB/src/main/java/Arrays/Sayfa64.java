package Arrays;

import java.util.Arrays;

public class Sayfa64 {

    public static void main(String[] args) {

        /*

        3) Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı bulunuz.
        Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2

        */

        //1. Way:
        int[] numbers = new int[]{-12,18,-5,23,-2};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));//[-12, -5, -2, 18, 23]

        int maxNegative = numbers[0];
        int minPositive = numbers[numbers.length-1];

        for (int w : numbers ){

            if (w<0){

                maxNegative = Math.max(maxNegative,w);

            }

            if (w>=0){

                minPositive = Math.min(minPositive,w);

            }

        }

        System.out.println("Maximum Negative: " +maxNegative);
        System.out.println("Minimum Positive: " +minPositive);

        System.out.println();

        //2. Way:

        for (int i = 0; i < numbers.length ; i++) {

            if (numbers[i]<0 && numbers[i+1]>0){

                System.out.println("Maximum Negative: " + numbers[i]);
                System.out.println("Minimum Positive: " + numbers[i+1]);

            }

        }









    }



}
