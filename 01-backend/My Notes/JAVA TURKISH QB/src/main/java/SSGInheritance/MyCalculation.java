package SSGInheritance;

public class MyCalculation extends Calculation{

    public void carpma(int x,int y){
        super.toplama(a,b);
        super.cikarma(a,b);
        z = x*y;
        System.out.println("Verilen sayilarin carpimi "+z);

    }

    public void bolme(int x,int y){
        System.out.println("super");
        System.out.println(super.buyukSayi);
        z = x/y;
        System.out.println("Verilen sayilarin bolumu "+z);

    }

    public static void main(String[] args) {

  //      Calculation cal = new Calculation();//extend edilmeyen classtan cagirmak icin obje olusturdum
  //      cal.cikarma(10,6);
  //      cal.toplama(10,5);

        MyCalculation call = new MyCalculation();
        call.toplama(a,b);
        call.cikarma(a,b); //Inheritance ile parent'a gidip degerleri ve methodlari cagirarak islem yaptirdik.
        System.out.println("*******************");
        call.carpma(a,b);
        call.bolme(a,b);
        System.out.println(call.buyukSayi);//100
    }



}
