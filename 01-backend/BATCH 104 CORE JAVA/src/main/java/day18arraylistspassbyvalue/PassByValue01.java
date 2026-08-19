package day18arraylistspassbyvalue;

public class PassByValue01 {

        /*
        1)Java variable'larin orijinal degerlerini korumak ister.
        2) Variable method'lar icinde kullanildiginda, Java method'un icine orjinal degeri koymaz,
           o degerin kopyasini uretir ve method'a o kopyayi yollar. Method kopya üstünde degisiklik yapar.
           Dolayısıyla variable'ın orjinal degeri korunmus olur.
           Bu sisteme "Pass By Value" denir.
           Note: Java "Pass By Vale" kullanir."Pass By Reference" kullanmaz.
           Note: Bazi programlama dilleri orjinal degeri koruma altina almamistir. Bu isi developer'lara birakmistir.
           Bu tarz dillere "Pass By Reference" kullanir.
        */


    public static void main(String[] args) {

        int x = 5;//Gömlek
        System.out.println(x);//5

        //static method olan "main method" un icindeki her sey static olmalidir.

        change(5);
        System.out.println(x);

        int ucret = 100;

        ucret = indirim(ucret);//90

    }

        public static void change(int a){
            System.out.println(a*3);
        }

        //void dısındaki "return" type'larda method body'si icinde "return" keyword kullanilmalidir.

        public static int indirim (int gomlekUcreti){

                return gomlekUcreti-10;

        }








































}
