package SSGStringBuilder;

public class StringBuilder01 {

    public static void main(String[] args) {

        String str= "Ali Can";
        str = "ali can";
        System.out.println(str);

        StringBuilder sb1 = new StringBuilder("Java cok guzel");
        sb1.append("dir");
        sb1.append("program");
        sb1.append("QA").append("cok").append("kolay");//method chain
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer();
        sb2.append("Java ");
        System.out.println(sb2);//Java

        String str2 = sb1.toString();
        System.out.println(str2);

        StringBuffer sb3 = new StringBuffer(str2);
        System.out.println(sb3);



    }


}
