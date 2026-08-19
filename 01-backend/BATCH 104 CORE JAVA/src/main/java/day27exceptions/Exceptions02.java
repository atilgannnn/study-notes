package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

    /*
        1)FileInputStream("src/main/java/day27exceptions/File1.txt");
        "new" den sonraki "FileInputStream" hata verir. Cunku ; biz Java'ya veriln adresteki dosyaya git dedik,
        Java iki endişeye kapildi. i)Ya adres yanlışsa ii)Ya verilen adreste dosya yoksa.
        Biz "method isminden" sonra "throws FileNotFoundException" yazarak Java'ya bu iki endişe duydugun durum olursa
        "Exception At" dedik.

        2)while((k=fis.read()) != -1){} yazdigimizda "read()" methodu hata verir.Cunku biz Java'ya dosyadaki karakteri oku dedik.
        Java bir endiseye kapildi i)Ya okumasi gereken karakterler Java'nin bilmedigi karakterlerse
        Biz method isminden sonra "throws IOException" yazarak Java'ya bu durumla karşılaştığında "Exception At" dedik.

        3)Method isminden sonra "throws IOException" yazarsanız Java "throwsFileNotFoundException" i siler. Cunku
        "IOException", "FileNotFoundException" i kapsar."IOException","FileNotFoundException" in parent'idir, onun yaptigi her seyi yapabilir.
        O yuzden "IOException" varken "FileNotFoundException" a gerek yoktur.

        "IOException","Input Output Exception" demektir.

        4)Gordugunuz gibi "IOException" ve "FileNotFoundException" biz kod yazarken,daha "Run" butonuna basmadan ortaya çıktı.
        Bu tarz exception'lara "Compile Time Exception" denir. Diğer adlari "Checked Exception" dır.
        "Compile Time Exception" lar kesinlikle halledilmelidir(Exception Handling). Halletmeden kod yazmaya devam etmeyiniz.


    */

    public static void main(String[] args) throws IOException {
        readTextFromTheFile();
        readTheText();

    }

    //Bir text file'daki texti okuyan kodu yaziniz.
    //1.Way:
    public static void readTextFromTheFile() throws IOException {

        FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");

        int k = 0;

        while((k=fis.read()) != -1){

            System.out.print((char)k);
        }

    }

    //2.Way:

    public static void readTheText(){

        try {
            FileInputStream fis = new FileInputStream("src/main/java/day27exceptions/File1.txt");

            int k = 0;

            while((k=fis.read()) != -1){

                System.out.print((char)k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosyanın adresi veya varlığı ile ilgili bir problem var");
        } catch (IOException e) {
            System.out.println("Dosyada okunamayan bir karakter var");
        }

    }

}
