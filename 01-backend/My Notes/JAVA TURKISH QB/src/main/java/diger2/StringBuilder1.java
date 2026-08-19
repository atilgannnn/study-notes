package diger2;

public class StringBuilder1 {


    public static void main(String[] args) {

        String s1 = "Yasasin Developerlar";
        System.out.println(s1);

        StringBuilder sb1 = new StringBuilder(s1);
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer(s1);
        System.out.println(sb2);

        System.out.println(sb2.toString());











    }

}
