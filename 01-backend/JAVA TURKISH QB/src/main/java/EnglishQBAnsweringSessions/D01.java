package src.main.java.EnglishQBAnsweringSessions;

public class D01 {

    public static void main(String[] args) {

        //System.out.println(m1(true, false, true));
        m3("Result:",2,2);


    }

    public static int m1(boolean b1,boolean... b2){

        return b2.length;


    }

    public static void m3(String x,int... y){

        int p = 1;
        for(int w:y){

            p=p*w;


        }

        System.out.print(x);
        System.out.println(p);



    }



}
