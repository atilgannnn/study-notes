package src.main.java.FlipGridOverloadOverrideLambda;

public class Deneme {

    public static void main(String[] args) {

        System.out.println(toplama(5, 3));
        System.out.println(toplama(1, 2, 3));
        System.out.println(toplama("2", 3));


    }

        public static int toplama (int a, int b){

            return a+b;

        }

        public static int toplama (int a,int b,int c){

            return a+b+c;

        }

        public static int toplama (String x, int y){

            return 0;
        }






    }




