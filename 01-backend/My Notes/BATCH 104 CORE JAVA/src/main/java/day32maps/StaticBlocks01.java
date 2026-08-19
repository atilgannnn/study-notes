package day32maps;

public class StaticBlocks01 {

    public static double pi;

    //static block'lar ihtiyacimiz olan variable'larin class olusturma safhasında elimizde olmasini saglar.
    //static block'lar class icindeki her seyden once calistirilir. "main method" dan ve diger tum methodlardan once calistirilir.
    //static block'lar icinde sadece "static variable"lara deger atanabilir.
    //Birden fazla "static block" varsa ustteki once calistirilir.

    static {

        System.out.println("Static Block 2");

    }


    public static void main(String[] args) {

        System.out.println("Main Method");

    }

    static {

        pi = 3.14;
        System.out.println("Static Block 1");

    }



}
