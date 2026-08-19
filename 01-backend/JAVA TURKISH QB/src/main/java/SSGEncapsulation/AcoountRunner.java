package SSGEncapsulation;

public class AcoountRunner {

    public static void main(String[] args) {

        Account acc = new Account();

        acc.setAcc_no(11234758599012l);
        acc.setEmail("frotan1954@gmail.com");
        acc.setName("Frotan");
        acc.setAmount(1200F);
        System.out.println(acc.getAcc_no());
        System.out.println(acc.getAmount());
        System.out.println(acc.getName());
        System.out.println(acc.getEmail());


    }

}
