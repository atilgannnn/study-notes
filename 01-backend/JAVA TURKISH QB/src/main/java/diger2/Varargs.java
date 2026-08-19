package diger2;

public class Varargs {

    public static void main(String[] args) {

        new Varargs().Varargs(1, "Hello");
        new Varargs().Varargs(1, "Hello", "Hi");
    }

        public void Varargs(int x,String... y){

            System.out.println(y[y.length-x]+" ");
        }




}
