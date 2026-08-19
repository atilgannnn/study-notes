package SSGEncapsulation;

import java.util.Locale;

public class CreditRunner {

    public static void main(String[] args) {

        CreditCard cc1 = new CreditCard();
        System.out.println(cc1.getCcn());//1234432123455432
        System.out.println(cc1.getAge());//21
        System.out.println(cc1.isExpired());//false

        System.out.println("********************************");

        cc1.setCcn("1912456789121416");
        System.out.println(cc1.getCcn());
        cc1.setAge(60);
        System.out.println(cc1.getAge());//60

        CreditCard cc2 = new CreditCard();

        System.out.println(cc2.getAge());//21

        String str = cc1.getCcn();
        cc1.setCcn("************"+str.substring(str.length()-4));

        System.out.println(cc1.getCcn());//************1416



    }



}
