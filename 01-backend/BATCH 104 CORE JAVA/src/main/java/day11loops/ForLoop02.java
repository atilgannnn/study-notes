package day11loops;

public class ForLoop02 {

    public static void main(String[] args) {

        //Bir String'deki "m" karakteri haric tum karakterleri yazdiriniz.
        //Andromeda ==> Androeda

        String str = "Andromeda";

        //1. Yol:
        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c != 'm') {
                System.out.print(c);
            }


        }

            System.out.println();

        //2. Yol:
        for(int i = 0; i<str.length();i++) {
            char c = str.charAt(i);

            if (c == 'm') {
                continue;//Boşveeeer komutu (Devamke :)) ==> Loop'un icinde bazi degerler icin Loop'un calismamasini isterseniz "continue" kullaniniz.
            }
            System.out.print(c);
        }
            System.out.println();

            //Example 2: 1'den 100'e kadar 6 ile bolunenler haric tum tamsayilari ekrana yazdiriniz

            for(int a=1; a<101; a++){

                if(a%6==0){
                    continue;
                }
                System.out.print(a + " ");

            }

            System.out.println();


            //Example 3: Size verilen bir String'deki 'm' den onceki karakterleri yazdiriniz.
            //           Luxemburg ==> Luxe

            String s = "Luxemburg";

            for(int b=0 ; b<str.length(); b++){
                char c = s.charAt(b);
                if(c =='m') {
                    break;
                }
                System.out.print(c);
            }





















    }




    }




