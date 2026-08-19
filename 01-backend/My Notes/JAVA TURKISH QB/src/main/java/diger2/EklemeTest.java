package diger2;

public class EklemeTest {

    public static void main(String[] args) {

        long zaman = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i <10000 ; i++) {

            sb.append("Programlama");

        }

        System.out.println("StringBuffer: " + (System.currentTimeMillis() - zaman) + "ms");

        zaman = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i = 0; i <10000 ; i++) {
            sb2.append("Programlama");
        }

        System.out.println("StringBuilder: " + (System.currentTimeMillis() - zaman) + "ms");


    }

}
