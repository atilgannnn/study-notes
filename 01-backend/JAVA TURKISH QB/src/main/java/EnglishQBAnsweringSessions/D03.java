package src.main.java.EnglishQBAnsweringSessions;

public class D03 {

    public static void main(String[] args) {

        StringBuilder strBld = new StringBuilder("John ");
        strBld.append("Woo ").append("Leo").deleteCharAt(6);
        System.out.println(strBld);

        StringBuilder str = new StringBuilder("LearnJava");
       // str.deleteCharAt(3);
       // System.out.println(str.substring(2,6));

        str.setCharAt(5,'L');
        System.out.println(str);

        StringBuilder str2 = new StringBuilder(7);
        str2.append("Java");
        System.out.println(str2.capacity() +","+str2.length());


    }




}
