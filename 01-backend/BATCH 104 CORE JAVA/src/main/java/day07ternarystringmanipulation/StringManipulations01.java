package day07ternarystringmanipulation;

public class StringManipulations01 {

    public static void main(String[] args) {


        /*
                            STRING CLASS METHODLARI
             1)equals(): i)Iki tane String'in ayni olup olmadigini anlamamiza yarar.
                         ii)equals() metod'u boolean return eder.

             2)equalsIgnoreCase(): i)Iki tane String'in ayni olup olmadigini buyuk harf kucuk harfe dikkat etmeden anlamamiza yarar.
                                   ii)equalsIgnoreCase() method'u "boolean" return eder.

             3)toLowerCase(): i)Bir String'deki tum harfleri kucuk harfe cevirmek icin kullanilir.
                              ii)toLowerCase() method'u "String"return eder.

             4)toUpperCase(): i)Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir.
                             ii)toUpperCase() method'u "String" return eder.

             5)charAt(): i)Bir String'den belli bir index'deki karakteri almak icin kullanilir.
                        ii)charAt() method'u "char" return eder.

             6)length(): i)Bir String'de kac tane karakter kullanildigini ogrenmek icin kullaniir.
                        ii)lenght() method'u "int" return eder.

             7)contains(): i)Bir String'de belli bir karakterin veya karakterlerin var olup olmadigini anlamak icin kullanilir.
                          ii)contains() method'u "boolean" return eder.

             8)split(): i)Bir String'i istedigimiz karakterden parcalamaya yarar.
                       ii)split() method'u "array" return eder.

         */

         /*

            Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.

            i)En az 8 karakter icermeli
            ii)Space karakteri icermemeli
            iii)Ilk harfi "M" veya "m" olmali
            iv)Son karakteri "?" olmali.

          */
        String pwd = "Manisa12?";

        //i)En az 8 karakter icermeli

        boolean first = pwd.length()>7;

        // ii)Space karakteri icermemeli

        boolean second = !pwd.contains(" ");

        //iii)Ilk harfi "M" veya "m" olmali

        boolean third = pwd.charAt(0)=='M' || pwd.charAt(0)=='m';

        //iv)Son karakteri "?" olmali.

        boolean fourth = pwd.charAt(pwd.length()-1)=='?';

        System.out.println(first && second && third && fourth);










    }









}
