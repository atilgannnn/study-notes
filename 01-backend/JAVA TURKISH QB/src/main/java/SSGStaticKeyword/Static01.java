package SSGStaticKeyword;

public class Static01 {

    static String  okulIsmi= "Yildiz koleji";
    static String okulTelefonu="3122563635";
    static String ogrenciIsim="fatih";

    private void nonStaticMethod() {

        System.out.println("Non-Static Method");

    }

    public static void staticMethod(){

        System.out.println("Static Method");

    }

    public static void main(String[] args) {

        Static01 s1 = new Static01();
        System.out.println(s1.ogrenciIsim);
        System.out.println(s1.okulIsmi);
        System.out.println(s1.okulTelefonu);
        s1.nonStaticMethod();


    }




}
