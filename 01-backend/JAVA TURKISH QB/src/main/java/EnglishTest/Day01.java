package src.main.java.EnglishTest;

public class Day01 {

    public static void main(String[] args) {

        String str = "Hello World!";
        System.out.println(str.length()>str.charAt(6));

        String str1 = "Java";
        System.out.println(str1.replace('a','i'));

        String str2 = "Learn java,earn money";
        System.out.println(str2.replace("earn","?"));

        String str3 = "Teach more,learn more";
        System.out.println(str3.replace("more","less"));

        String str4 = "Java";
        System.out.println(str4.replace("","/"));
        System.out.println(str4.replace("a",""));
        System.out.println(str4.replace("a","A").replace('v','V'));
        System.out.println(str4.replace("m","A"));





    }

}
