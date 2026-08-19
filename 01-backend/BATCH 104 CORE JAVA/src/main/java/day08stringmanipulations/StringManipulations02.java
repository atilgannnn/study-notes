package day08stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        //Example 1: Bir String'deki space haric kaç tane karakter kullanildigini gosteren kodu yaziniz.
        //          "Ali okula gitti." ==> 14

        String str = "Ali okula gitti.";

        //replace() methodu'u bir String'deki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir.
        int num = str.replace(" ","").length();
        System.out.println(num);

        //Example 2: Bir String'deki tum 'a' harflerini 'A' ya ceviriniz.

        String s = "Ankara'nın tasina gozlerimin yasina bak.";

        String yeniS = s.replace("a","A");

        System.out.println(yeniS);

        //Example 3: Bir String'deki tum "kara" kelimeleri yerine "*" koyunuz.
        String t = "Kara kara dusunme Ankara";
        String yeniT = t.replace("kara", "*");
        System.out.println(yeniT);

        //Example 4: Bir String'deki tum sayilari "*" a ceviriniz.
        //          "AC202117004" ==> AC********

        String stdId = "AC202117004";
        String yeniStdId = stdId.replaceAll("[0-9]","*");

        System.out.println(yeniStdId);

        /*

            Bir grup datayi ifade eden kodlara "Regex" denir.
            "Regex" Regular Expressions'in kisaltilmis halidir.

            1)Tum rakamlar ==> [0-9]
            2)Tum kucuk harfler ==> [a-z]
            3)Tum buyuk harfler ==> [A-Z]
            4)Tum harfler ==> [a-zA-Z]
            5)Sesli harfler ==> [aeiouAEIOU]
            6)Space ==> [ ]
            7)Tum rakamlar ve tum harfler ==> [0-9a-zA-Z]
            8)Tum noktalama isaretleri ==> \\p{Punct}

            1)Rakamlar hariç tum karakterler ==> [^0-9]
            2)Kucuk harfler haric tum karakterler ==> [^a-z]
            3)Buyuk harfler haric tum karakterler ==> [^A-Z]
            4)Diger karakterler haric tum harfler ==> [^a-zA-Z]
            5)Sesli harfler haric tum karakterler ==> [^aeiouAEIOU]
            6)Space ==>[^ ]
            7)Tum rakamlar ve tum harfler haric ==> [^0-9a-zA-z]
            8)Tum noktalama isaretleri haric ==> [^\\p{Punct}] (Burada daima koseli parantez kullanmak zorundasin)

         */

        //Example 5: Verilen bir String de kullanilan noktalama isareti ve rakamlar ve space karakteri haric tum karakterlerin sayisini
        //            bulan kodu yaziniz.

        String u = "Ali 13 yasinda, dersem inanma!...";

        int sonuc = u.
                    replaceAll("[0-9]", "").
                    replace(" ","").
                    replaceAll("\\p{Punct}", "").
                    length();
        System.out.println(sonuc);

        //Example 6: Bir password'un gecerli olup olmadigini asagidaki kurallara gore testy eden kodu yaziniz.
        //          i)Space haric en az 8 karakter olmali
        //          ii)En az 1 sembol icermeli
        //          iii)En az 1 rakam icermeli
        //          iv)En az 1 buyuk harf icermeli
        //          v)En az 1 kucuk harf icermeli

        String pwd = "B78c? K!m";

        //i)Space haric en az 8 karakter olmali
        boolean first = pwd.replace(" ","").length()>7;

        //ii)En az 1 sembol icermeli
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]","").length()>0;

        //iii)En az 1 rakam icermeli
        boolean third = pwd.replaceAll("[^0-9]]","").length()>0;

        //iv)En az 1 buyuk harf icermeli
        boolean fourth = pwd.replaceAll("[^A-Z]","").length()>0;

        //v)En az 1 kucuk harf icermeli
        boolean fifth = pwd.replaceAll("[^a-z]","").length()>0;

        boolean pwdGecerli = first && second && third && fourth && fifth;

        if (pwdGecerli){
            System.out.println("Password'unuz gecerlidir...");
        }else{
            System.out.println("Password'unuz gecerli degildir...");
        }

        //Example 7: Bir String'deki noktalama isaretleri haric karakter sayisini gosteren kodu yaziniz.

        String cumle = "Sen yapmazsan, ben yapmazsam, o yapmazsa kim yapacak?...";

        int number = cumle.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(number);

        //Example 8: Verilen bir String "Al" ile basliyor ve "x" ile bitiyorsa ekrana "Harika" yazdirin.
        //             Aksi halde "Normal" yazdirin.

        String v = "Kalex";

        boolean baslangic = v.startsWith("Al");
        boolean bitis = v.endsWith("x");

        String result = baslangic && bitis ? "Harika" : "Normal";
        System.out.println(result);


    }











}
