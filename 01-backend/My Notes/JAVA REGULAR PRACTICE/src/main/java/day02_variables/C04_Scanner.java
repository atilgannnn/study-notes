package day02_variables;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        //  Soru 1)   Kullanicinin  girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yazdiriniz

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("4 basamakli bir sayi giriniz ");
        int sayi= scanner1.nextInt();


        //bir sayinin birler basamagindaki rakami  %10 ile hesaplatabiliriz  1234
        int sonRakam=sayi%10;
        int ilkRakam=sayi/1000;
        System.out.println("ilk rakam + son rakam "+(ilkRakam+sonRakam));

        //  Soru 2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         /* Ornek : Inputs : 853
         Output : Girdiginiz sayinin birler basamagi : 3
                  Girdiginiz sayinin onlar basamagi : 5
                  Girdiginiz sayinin yuzler basamagi : 8
         */

        Scanner input = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int sayi3 = input.nextInt();
        // 1) 1 ler basamagindaki sayiyi bulun
        int birler = sayi3 % 10;
        System.out.println("girdiginiz sayinin birler basamagi " + birler);//3
        sayi3=sayi3 / 10;
        //sayi3 /= 10;
        System.out.println("ikiBas = " + sayi3);//85
        // 2) 10 lar basamagindaki sayiyi bulun
        int onlar = sayi3 % 10;
        System.out.println("girdiginiz sayinin onlar basamagi " + onlar);//5
        sayi3 = sayi3 / 10;
        // 3) 100 ler basamagindaki sayiyi bulun
        int yuzler = sayi3;
        System.out.println("girdiginiz sayinin yuzler basamagi " + yuzler);










    }

















}
