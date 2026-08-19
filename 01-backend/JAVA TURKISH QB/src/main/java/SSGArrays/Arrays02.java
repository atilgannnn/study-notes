package SSGArrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};// 90,23,5,.....

        //1. Yol:
        for (int i = 0 ; i < array.length; i++){

            System.out.print(array[i] + " ");//90 23 5 109 12 22 67 34

        }

        System.out.println();

        //2. Yol:
        for (int x : array){

            System.out.print(x + " ");//90 23 5 109 12 22 67 34


        }

        System.out.println();

        //Bir eleman dizide olup olmadığı nasıl kontrol edilir

        //1. Yol:

        for (int w : array) {

            if(w==90){
                System.out.println(" var");//var
                break;
            }

        }

        System.out.println();

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));//[5, 12, 22, 23, 34, 67, 90, 109]

        System.out.println(Arrays.binarySearch(array,23));//3 (index numarasını yazdırdı)

        System.out.println(Arrays.binarySearch(array,128));//-9 (eksi ile olmadığını söylüyor, 9 ile de olsaydı hangiş indexte olurdu onu söylüyor)






    }


}
