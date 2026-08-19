package day03_ifStatement;

public class C02_AsciiDegerleri {

    public static void main(String[] args) {

        char harf = 'a';
        char harf2 = 'A';

        System.out.println("harf>harf2 ==> " +(harf>harf2)); //Karsilastirma islemlerinin sonucu boolean ("true" ya da "false" döner)

        //Buyuk harflerin ASCII degerleri kucuk harflerin ASCII degerlerinden daha kucuktur.

        // Ornek1) Herhangi bir char variable'ın ASCII degerlerini kod yazarak bulun.

        char x = 'B';
        System.out.println('B'+0);//Deger 66
        char y = ' ';
        System.out.println(' '+0);//Deger 32

        //Karakterlerin ASCII degerini bulmak icin toplamaya etkisi olmayan '0' seceriz. Boylece karakterin ASCII degerini buluruz.

        char m = 'm';
        System.out.println("m'nin ASCII degeri : "+(m+0));

        // 2.Yol:

        //char'larda Java char karaktere int de atayabiliriz. Cunku char'in bir resim karakteri bir de sayisal(ASCII) degeri vardir.
        //Bu nedenle ASCII degerlerini hesaplayabiliriz.

        int harf3 = 'm';

        System.out.println("m'nin ASCII degeri = " + harf3);

        int harf4 = m;
        System.out.println("m'nin ASCII degeri = " + harf4);

        //Iki byte degerini kıyaslayan bir kod yaziniz.

        byte b1 = 12;
        byte b2 = -125;

        System.out.println("b1>b2 ==> " + (b1>b2));//true doner.

        //Iki float degerini kıyaslayan bir kod yaziniz.

        float f1 = 2.45645f;
        float f2 = 5.86786F;

        System.out.println(" f1>f2 ==> "+(f1>f2));//false doner.
        System.out.println("b1>f1 ==> "+(b1>f1));//true doner.

        //Iki primitive degeri kıyaslayan bir kod yaziniz.

        long lng1 = 5456456464L;
        System.out.println("b1<lng1 ==> " +(b1<lng1));//true doner.

        char ch = 'h';
        System.out.println("b1>ch ==> " +(b1>ch));//false doner.

        //Kiyaslamalar her zaman boolean dondurur.
















    }






}
