package StringManipulations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sayfa11 {

    public static void main(String[] args) {

       /*

       13) Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
       Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir.
       Şifrede en az 1 sembol olmalıdır.
       Örnek: 'A2b!' için kodunuz konsolda false yazdırmalıdır.
       'A2b3cdef' için kodunuz konsolda false yazdırmalıdır '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
       '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır. '! a b 3 k' kodunuz konsolda false yazdırmalıdır.

        */


        /*

        Scanner input = new Scanner(System.in);
        System.out.println("Sifrenizi giriniz...");
        String sifre = input.next();
        Boolean bosluk = sifre.indexOf(" ")!=-1;
        Boolean sekizKrkliMi = sifre.replaceAll("\\s","").length() >= 8;
        Boolean enAzBirSembolVarMi = sifre.replaceAll("\\s","").replaceAll("[0-9A-Za-z]","").length() > 0;
        System.out.println("Sifre gecerli mi: " + (sekizKrkliMi && enAzBirSembolVarMi && bosluk));

         */


            //AKŞAM GRUPLA BU SORUYA BAKALIM!




         /*

         14) Bir String’ in belirli bir tek karaktere sahip olup olmadığını üç farklı şekilde kontrol etmek için kod yazınız.

         */

        //1. YOL:

        String word = "Halikarnas";

        boolean varMi = word.contains("H");

        System.out.println(varMi);

        //2. YOL:

        boolean varMi1 = word.replaceAll("^k","").length()>0;

        System.out.println(varMi1);

        //3. YOL:

        boolean varMi2 = word.indexOf("k")!=-1;
        System.out.println(varMi2);






       






















    }
























}
