package day06_nestedifswitch;

import java.util.Scanner;

public class C01_Ternary {

    public static void main(String[] args) {

         /*
            TASK :
             Kullanıcıdan sifirdan buyuk pozitif bir tamsayı girmesini isteyin.
             Girilen pozitif tamsayı 3 basamaklı ise ekrana "3 Basamaklı" yazdırın.
             3 basamaklı degilse çift olup olmadigini kontrol edin.
             Çift ise "3 basamaklı olmayan çift sayı" yazdırın.
             Çift sayı degilse "3 basamaklı olmayan tek sayı yazdırın."
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int sayi = input.nextInt();

        System.out.println();

        System.out.println("**************TERNARY ILE COZUM********************");

        String sonuc =(sayi > 0)        ? (sayi>99 && sayi<1000)    ? ("Uc basamakli sifirdan buyuk sayi") :
                      (sayi%2==0) ? ("Uc basamakli olmayan cift sayi") : ("Uc basamakli olmayan tek sayi") :
                      "Lutfen sifirdan buyuk bir sayi giriniz";
        System.out.println(sonuc);


        System.out.println("*********IF ELSE ILE COZUM");

        if(sayi > 0){
            if (sayi<1000 && sayi>99){
                System.out.println("Uc basamaklı pozitif sayi");
            }else if(sayi%2==0){
                System.out.println("Uc basamakli olmayan cift sayi");
            }else
                System.out.println("Uc basamakli olmayan tek sayi");
        }else
            System.out.println("Lutfen sıfırdan buyuk pozitif bir tamsayı giriniz");














    }













}
