package day18arraylistspassbyvalue;

public class MethodOverloading01 {

         /*

        Method Overloading Nasil Yapilir?

        1)Method isimleri ayni olmalidir
        2)Method parametreleri farkli olmalidir
            i)Parametre sayilari degistirilebilir.
            ii)Parametrelerin data typle'larini degistirebilirsiniz.
            iii)Parametrelerin yerlerini degistirebilirsiniz. Ancak data type'lari farkli ise.
        3)Method Ismi + Parametreler = Method Signature
        Method Signature disinda ne degistirirseniz degistirin Java o methodlari farkli kabul etmez cunku imzaya bakar.

         */

    public static void main(String[] args) {

        add(3,5);

        add(3,5.0);


    }

    public static void add (int a, int b){
        System.out.println(a+b);
    }

    public static void add (int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void add (int a, double b){
        System.out.println(a+b);
    }

    public static void add (double a, int b){
        System.out.println(a+b);
    }

























}
