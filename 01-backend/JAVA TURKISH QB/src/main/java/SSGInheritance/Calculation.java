package SSGInheritance;

public class Calculation {


    public static int a = 30;
    public static int b = 10;
    int z;
    public void toplama(int x, int y){

        z = x+y;
        System.out.println("Verilen sayilarin toplami: "+z);

    }

    protected void cikarma (int x, int y){

        z = x-y;
        System.out.println("Verilen sayilarin farki: "+z);

    }

    int buyukSayi = 100;




}
