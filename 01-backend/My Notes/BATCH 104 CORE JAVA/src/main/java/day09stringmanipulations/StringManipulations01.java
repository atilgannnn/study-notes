package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        String str = "Kara kara dusunme Ankara";

        //indexOf() methodu verilen karakter veya karakterlerin ilk gorunumunun indexini verir.
        int idxA = str.indexOf("kara");
        System.out.println(idxA);//1

        //lastIndexOf() metodu verien arakter veya karakterlerin son gorunumunun indexini verir.
        int idxA2 = str.lastIndexOf("kara");
        System.out.println(idxA2);//9

        String s = "Mississippi";

        int idxI = s.indexOf('i');//indexOf() hem String hem de char ile kullanilabilir.
        System.out.println(idxI);//1

        int idxss1 = s.indexOf("iss"); // Ilk gorunumun "ilk" karakterinin indexini verir.
        System.out.println(idxss1);

        int idxss2 = s.lastIndexOf("iss"); // Son gorunumun "ilk" karakterinin indexini verir.
        System.out.println(idxss2);

        //Example 1: Bir String'deki bir karakterin tekrarli veya tekrarsiz olup olmadigini gosteren kodu yaziniz.
        //          "Helloooo" ==> H->Tekrarsiz     e->Tekrarsiz    l->Tekrarli     o->Tekrarli

        String t = "Helloooo";

        char c = 'H';
        if(t.indexOf(c)==t.lastIndexOf(c)){
            System.out.println("Tekrarsiz");
        }else{
            System.out.println("Tekrarli");
        }

        String u = "Learn Java earn money";

        //inexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar karakteri geçtikten sonra
        //istenen karakterin ilk gorunumunun indexini return eder.

        int sonuc = u.indexOf("e",4);
        System.out.println(sonuc);//11

       //lastIndexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi index olarak kabul edip en baştan
       //bu indexe kadar olan karakterleri bir kutu içine aliniz ve lastIndexOf() metodunu sadece bu kutu icindeki String icin kullaniniz.
       String m = "Hello everyone!";
       int e = m.lastIndexOf("e",10);
       System.out.println(e);

       String v = " ";

       //isEmpty() metodu bir String'in bos olup olmadigini kontrol eder. Eger String'de hic karakter yoksa
       //isEmpty() "true" return eder, herhangi bir karakter varsa "false" return eder.
       //lenght()==0 demek isEmpty() true verir demektir.
       //Bir String'in bos olup olmadigini anlamak icin "lenght()==0" kullanmayin, "isEmpty()" kullanin.

       boolean bosMU = v.isEmpty();
       System.out.println(bosMU);

       String x = "";

       //isBlank() hem bos String icin hem de "sadece space" iceren String'ler icin true return eder.
       boolean blankMi = x.isBlank();
       System.out.println(blankMi);

       //Example 2: Kullanicidan alinan isim mutlaka space'den farkli en az 1 karakter icermelidir.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ilk isminizi giriniz...");

        String ilk = input.nextLine();
        if(ilk.isBlank()){
            System.out.println("Sana ismini gir dedim...");

        }else{
            System.out.println(ilk);
        }














    }








}
