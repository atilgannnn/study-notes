package day13_overridingoverloadingstatickeywords;

public class Try {

    int b = 10;
    static int a = 10;

    public static void main(String[] args) {

        Try t1 = new Try();
        Try t2 = new Try();
        t1.a = a+2;
        t2.a = a+3;


        Try t3 = new Try();
        Try t4 = new Try();
        t3.b = 12;
        t4.b = 13;
        System.out.println(t3.b);
        System.out.println(t4.b);




    }


}
