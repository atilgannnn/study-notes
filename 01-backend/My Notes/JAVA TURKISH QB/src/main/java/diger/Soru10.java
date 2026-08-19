package diger;

import java.util.Scanner;

public class Soru10 {

    public static void main(String[] args) {


        /*

        SORU 10 : Kullanicidan 2 sayi isteyin. Girilen sayilar ve aralarindaki tum sayilari toplayip
        sonucu yazdiran bir program yazin.


        */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        int sayi1 = input.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2 = input.nextInt();

        int toplam = 0;

        for (int i = sayi1; i <=sayi2 ; i++) {

            toplam += i;

        }
        System.out.println(toplam);





























        //Burada önce küçük sonra büyük sayiyi girmesi gerekiyor yoksa program hata veriyor.






















    }





















}
