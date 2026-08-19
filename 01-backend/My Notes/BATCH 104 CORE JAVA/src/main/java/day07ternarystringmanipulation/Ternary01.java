package day07ternarystringmanipulation;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1: Bir sayinin pozitif olup olmadigini ekrana yazdiran kodu yaziniz.

        //1.Way : if-else

        int a = -12;
        if(a>0){
            System.out.println("Positive");
        }else{
            System.out.println("Not Positive");
        }

        //2.Way : ternary
                      //Condition   ?   Condition dogru ise uygulanack kod      :           Condition yanlis ise uygulanacak kod
        String result = a>0         ?   "Positive"                              :            "Not Positive";
        System.out.println(result);

        //Example 2: Iki sayidan kucuk olanini secen kodu yaziniz.

        int b = 120;
        int c = 23;

        int min = b<c ? b : c;
        System.out.println(min);

        //Example 3: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //           Pozitif sayilarin ve sifirin mutlak degeri kendileridir.
        //           Negtif sayilarin mutlak degeri -1 ile carpilmis halidir.


        int d = -45;

        int abs = d<0 ? -1*d : d;
        System.out.println(abs);

        //Example 4: Iki tane sayi ayni isaretli ise bu sayilari carpiniz. Farklı isaretli ise "Islem Yapamam" mesaji veriniz.
        int e = 12;
        int f = 10;

        //Ternary farkli data tiplerinde sonuc return ederse sonucun data tipini "Object" yapiniz.
        Object islem = (e>0 && f>0) || (e<0 && f<0) ? e*f : "Islem Yapamam";
        System.out.println(islem);

        //Java'da her class'in en az bir tane "parent class" i vardir.
        //Sadece "Object" class'in "parent" class'i yoktur.






















    }






}
