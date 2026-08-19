package Variables;

import java.util.Scanner;

public class Sayfa04 {

    public static void main(String[] args) {

        /*
            5) Değerleri farklı olan iki boolean data tipinde değişken oluşturunuz
            ve bu değerleri iki ardışık değer arasında boşluk bırakacak şekilde aynı satırda yazdırınız.
         */

        boolean sonuc1 = true;
        boolean sonuc2 = false;

        System.out.println(sonuc1 + " " + sonuc2);

        /*
            6) 3 öğe (kitap, defter ve laptop) fiyatı için long data tipinde değişkenler oluşturunuz.
            Konsolda 2 kitap, 4 defter ve 3 laptop için toplam fiyatını yazdırınız.

         */

        long kitap = 150;
        long defter = 50;
        long laptop = 41000;

        long hesap = (2*kitap)+(4*defter)+(3*laptop);
        System.out.println(hesap);

        /*
             7) İki tamsayıyı değiştirmek için bir kod yazınız.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz...");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("Degistirdkten sonra= " + n1+ "-" + n2 );















    }










}
