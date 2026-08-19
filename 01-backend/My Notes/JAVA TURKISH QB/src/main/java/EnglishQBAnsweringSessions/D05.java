package src.main.java.EnglishQBAnsweringSessions;

public class D05 {

    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder(9);
        System.out.println(sb.length() + " - " + sb.capacity());

        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.length() + " - " + sb1.capacity());

        StringBuilder sb2 = new StringBuilder("Java");
        System.out.println(sb2.length() + " - " + sb2.capacity());

        StringBuilder sb3 = new StringBuilder("StringBuilder");
        System.out.println(sb3.delete(3, 6).toString() + " - " + sb3.length());





    }



}
