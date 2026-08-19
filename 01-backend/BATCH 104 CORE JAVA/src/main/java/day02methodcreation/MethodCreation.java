package day02methodcreation;

public class MethodCreation {

    //main method icerisinde kullanacaginiz her sey "static" olmalidir.
    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2,5));
        System.out.println(ucSayiyiCarp(2,1.5,6));

        System.out.println(ilkIkiyiToplaUcuncuIleCarp(2,8,3.2));

        //sout yazip "Enter" a basiniz System.out.println() otomatik olarak yazilir.
        //Ekrana bir sey yazdirmak icin iki tane kod var. i)System.out.println() ==> Satirbasi yapar ii)System.out.print() ==> Satirbasi yapmaz



        }

    //Example 1: Toplama islemi yapan bir method olusturunuz
    public static double toplamaYap (double a, double b){
        return a+b;
    }

    //Exammple 2: Uc sayiyi birbiri ile carpan bir method olusturunuz
    public static double ucSayiyiCarp (double a, double b, double c){
        return a*b*c;
    }
    //Example 3: Uc sayidan ilk ikisini toplayip ucuncu ile carpan bir method olusturup, sonucu ekrana yazdiriniz

    public static double ilkIkiyiToplaUcuncuIleCarp (double x, double y, double z){
        return (x+y)*z;
    }

}
