package day08_loops;

import java.util.Scanner;

public class C01_ForLoop {

    public static void main(String[] args) {


        //Kullanicidan baslangic , bitis ve artis miktarini alarak aradaki tum sayilari aralarina virgul koyarak yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen başlangic degeri giriniz");

        int baslangic = 10;
        int bitis = 50;
        int artisMiktari = 5;

        for (int i = baslangic; i <= bitis ; i+=artisMiktari) {
            if (i < bitis) {
                System.out.print(i + ",");
            } else
                System.out.print(i);

        }

























    }



























}
