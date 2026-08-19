package day27exceptions;

public class Exceptions01 {


    public static void main(String[] args) {

        double r1 = compareNumOfCharacters("Java","xy");
        System.out.println(r1);

        double r2 = compareNumOfCharacters(null,"xy");
        System.out.println(r2);

        double r3 = compareNumOfCharacters("Selenium","");
        System.out.println(r3);




    }

    //Verilen iki String'den birinin karakter sayisinin digerinin kaç katı oldugunu veren methodu olusturunuz


    public static double compareNumOfCharacters(String s,String t){

        double result = 0;
        try{

            result = s.length() / t.length();

        }catch(NullPointerException e){
            System.out.println("length() methodu null ile kullanilamaz");
        }catch(ArithmeticException e){
            System.out.println("Herhangi bir sayi sifir ile bolunemez");
        }finally{
            System.out.println("Database ile connection kesildi");
        }

        return result;

    }

    /*

    "final","finally","finalized" aciklayiniz.
    1)"final" bir keyword'dur. Variable,Class ve Method'lar icin kullanilir.
    2)"finally" bir "code block" dur."try-catch" veya sadece "try" ile kullanilir.
      "finally" code block icine yazilan kodlar her halükarda çalıştırılır.
      Mesela Database ile connection'i kesmek her halükarda yapilmasi gereken bir fiildir. Bunu "finally" ile yapabiliriz.
    3)"finalize" bir method'dur. Bu method Java tarafindan datalar imha edilmeden önce çağırılır.
      Bu method datalari imha edilecek hale getirir
      ve daha sonra "Garbage Collector" bu datalari imha eder.

      "finalize" methodunu Java Developerlar da cagirabilir ama Java kendi bildigini yapar.

    */


}
