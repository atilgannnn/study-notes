package day02_variables;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String kullaniciIsmi = input.next();  //"next()" sadece ilk kelimeyi alir yani mesela kullanici adi Fatma Sumeyye ise sadece Fatma'yi alir. Her ikisini de almasi icin "nextline()"girilmelidir.

        ////Soru 1 ) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplatan bir program yazdirin
        ////( CEMBERIN CEVRESI = 2*3.14*r  DAIRENIN ALANI = 3.14*r*r  )

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz =");
        double r = scan.nextDouble();
        System.out.println("Cemberin cevresi = " +2*314*r/100); //pi sayısını 314/100 ya da 3.14 diye yazabiliriz.
        System.out.println("Dairenin alani = " +3.14*r*r);

        //Soru 2 )  Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini isteyip o dikdortgenin alan ve
        // cevre hesabini yapan bir program yaziniz.

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lutfen kısa kenar uzunlugunu giriniz");
        double kisaKenar = scan.nextDouble();
        System.out.println("Lutfen uzun kenar uzunlugunu giriniz");
        double uzunKenar = scan.nextDouble();
        System.out.println("Dikdortgenin Alani = " + kisaKenar*uzunKenar);
        System.out.println("Dikdortgenin Cevresi = " + 2*(kisaKenar+uzunKenar));

        //Soru 3) Kenar uzunluklari kullanicidan alinana bir ucgenin cevresini hesaplayan bir program yaziniz.(byte kullanin)
        // Ucgenin cevresi=a+b+c

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Ucgenin 3 kenar uzunlugunu giriniz");
        byte a = scan3.nextByte();
        byte b= scan3.nextByte();
        byte c= scan3.nextByte();

        int cevre = a+b+c;
        System.out.println("Ucgenin cevresi =" + cevre);

        //Soru-4 :
        //Kullanicidan aldiginiz sekille asagidaki gibi bir gorunum olusturan bir kod yaziniz.

        /*
             A
            A A
           A A A
        */

        Scanner scan4= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char ch = scan4.next().charAt(0);

        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch);
        System.out.println(ch+" "+ch+" "+ch);





















    }






}
