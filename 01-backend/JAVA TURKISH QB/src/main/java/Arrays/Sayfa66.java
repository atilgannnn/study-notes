package Arrays;

public class Sayfa66 {

    public static void main(String[] args) {

        /*

        6) Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz.

        */

        String s = "Apex is an object oriented programming language";
        String[] newS = s.split(" ");
        int counter = 0;

        for ( String w : newS){

            if (w.startsWith("a") || w.startsWith("A")){

                counter++;

            }
        }
        System.out.println(counter);//2

        System.out.println();

        /*

        7) Yukarıda verilen String'deki sesli harf sayısını bulunuz.

        */

        String [] s1 = s.toLowerCase().split("");
        int vowelCounter = 0;

        for (String w : s1){

            switch (w){

                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    vowelCounter++;
            }

        }
        System.out.println("The Number Of Vowels Is: " + vowelCounter);



    }


}
