package Loops;

import java.util.Scanner;

public class Sayfa59 {

    public static void main(String[] args) {

        /*

        26) Kullanıcıdan bir String ve bir karakter alınız.
        String'de verilen karakterin ilk olduğu index ile son tekrarlandığı index arasındaki karakter sayısını sayınız.
        Boşluk karakterlerini saymayınız.
        Kod, kullanıcının seçtiği karakter String ‘de sadece bir kez varsa konsolda -1, Kod, kullanıcının seçtiği karakter String ‘de yoksa konsolda -1 döndürsün.

        Örneğin; "Java is easy" - 'a' ==>  5
                 "Java is easy" - 'w' ==> -1
                 "Java is easy" - 'e' ==> -1

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir String ifade giriniz");
        String str = input.nextLine().replaceAll("\\s","");
        System.out.println("Lütfen bir karakter giriniz");
        char ch = input.next().charAt(0);
        int counter = 0;

        if (str.indexOf(ch) == str.lastIndexOf(ch)) {

            System.out.println("-1");
        }

        for (int i = str.indexOf(ch)+1; i < str.lastIndexOf(ch) ; i++) {

            if (str.charAt(i) != ch){

                counter++;

            }

            System.out.println(counter);


        }












    }


}
