package day11_multidimensionalarrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_Fibonacchi {


    public static void main(String[] args) {

         /*
               INTERVIEW
               Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
               0-1-1-2-3-5-8-13-21-34....
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = input.nextInt();

        List<Integer> fibonacchi = new ArrayList<>();
        fibonacchi.add(0);
        fibonacchi.add(1);

        int i = 1;
        if (sayi<=1){
            System.out.println("Lutfen 1 den buyuk bir sayi giriniz");
        }else{

            while(fibonacchi.get(i)<sayi){
                fibonacchi.add(fibonacchi.get(i)+ fibonacchi.get(i-1));//bir onceki eleman ile topladik
                i++;//bir basamak ilerlesin



            }
            if (fibonacchi.get(fibonacchi.size()-1)>sayi){//fibonacchi de yer almiyorsa

                fibonacchi.remove(fibonacchi.size()-1);//son elemani sil

                System.out.println("Girdiginiz sayi fibonacchi'de yer almiyor. Girilen sayiya kadarki fibonacchi "+fibonacchi);

            }else{
                System.out.println("Girdiginiz sayi fibonacchi sayisidir "+fibonacchi);
            }

        }


        




    }
}
