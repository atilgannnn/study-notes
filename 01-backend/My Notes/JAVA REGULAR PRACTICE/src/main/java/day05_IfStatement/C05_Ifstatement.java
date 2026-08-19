package day05_IfStatement;

import java.util.Scanner;

public class C05_Ifstatement {

    public static void main(String[] args) {

        //Kullanicidan iki sayi alin buyuk olmayan sayiyi yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz...");

        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();

        if (sayi1 < sayi2){
            System.out.println("Buyuk olmayan sayi =" + sayi1);
        }else if (sayi1 > sayi2){
            System.out.println("Buyuk olmayan sayi =" + sayi2);
        }else {
            System.out.println("Sayilar birbirine esit");
        }

        // Ternary Yöntemi ile Çözümü

        System.out.println(sayi1 == sayi2 ? "Sayilar Esit" : sayi1>sayi2 ? sayi2 : sayi1);












    }












}
