package day20stringbuilderstringbuffer;

public class StringBuilder01 {

    /*
        1) "StringBuilder" Java'da farkli bir Class'dir.
        2) "StringBuilder" String olusturmaya yarar.
        3) "String" Class varken nicin "StringBuilder"a ihtiyac duyariz?
           Cunku "String" Class "Immutable Class" dir ama biz bazen "Mutable" String'lere ihtiyac duyariz.
           "StringBuilder" bize "Mutable" String verir.
        4) "Immutable Class" larda varolan deger degistirilemez. Siz varolan degeri degistirmek istediginizde
            i) Memory'de yeni bir variable yeni degerle olusturulur
            ii) Eski variable'in pointer'i yeni variable'a döndürülür.
            iii) Eger bir variable'i hicbir pointer gostermiyorsa o variable "Garbage Collector" tarafindan silinir.

            "Mutable Class" larda varolan deger degistirilebilir. Orjinal deger korunmaz.
        5) "String Class"larin "Immutable" yapisi "security" icin onemlidir.
            Ayni degere sahip birden fazla String oldugunda, Java bir tane container olusturur ve ayni degere sahip
            String'lerin bu container'i kullanmasini temin eder. Bu memory'yi korumak icin iyidir ancak container'daki degeri
            bir variable icin degistirdigimizde tum variable'larin etkilenmesi tehlikesi vardir. Bu tehlikeden kurtulmak icin Java
            String'leri "Immutable (Degismez)" yapmistir. Fakat herhangi bir variable'in degerini degistirmek icin Java bir yol bulmustur.
            Degistirmek istediginiz variable icin yeni bir container olusturur ve variable'in pointer'ini bu yeni variable'a yonlendirir.
            Boylelikle hem degisim saglanmis hem de digerleri etkilenmemis olur.


    */

    public static void main(String[] args) {

        String str = "Java";
        str = "Super Java";
        System.out.println(str);

        //StringBuilder nasil olusturulur?
        //1. Yol:
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1);//Java

        //2. Yol:
        StringBuilder strb2 = new StringBuilder();
        //Yol a:
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append("!!!");
        System.out.println(strb2);//Java is easy!!!

        //Yol b:
        strb2.append(" Learn").append(" Java earn").append(" money.");//Method Chain
        System.out.println(strb2);//Java is easy!!! Learn Java earn money.

        //StringBuilder'larda character sayisi nasil bulunur? ==> length() methodu ile bulunur.
        StringBuilder strb3 = new StringBuilder();
        strb3.append("Car");
        strb3.append("xxxxxxxxxxxxxxx");

        int numOfChar = strb3.length();
        System.out.println(numOfChar);//3

        //Capacity asimlarinda capacity var olanin iki katının iki fazlasina cikar
        int capacity1 = strb3.capacity();
        System.out.println(capacity1);//34 ==> 16*2 + 2

        strb3.append("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        int capacity2 = strb3.capacity();
        System.out.println(capacity2);//70 ==> 34*2 + 2

        //setCharAt(2,'r') ==> Index 2'deki karakteri 'r' ye cevirir.
        strb3.setCharAt(2,'r');
        System.out.println(strb3);//Carxxxxxxxxxxxxxxxmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

        //delete(3,18); ==> Index 3(dahil) den index 18(haric) e kadar tum karakterleri siler.
        strb3.delete(3,18);
        System.out.println(strb3);//Carmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

        //deleteCharAt(2); Index 2'deki karakteri siler.
        strb3.deleteCharAt(2);
        System.out.println(strb3);//Cammmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

        //reverse(); Methodu StringBuilder'i ters cevirir. Ali ==> ilA
        // "mutable" larda sadece method kullanmak orjinal degeri degistirmek icin yeterlidir.
        strb3.reverse();
        System.out.println(strb3);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        // "Immutable" larda orjinal degeri degistirmek icin methodu kullanmak yeterli olmaz. Bir de "atama islemi" yapmalisiniz.
        String abc = "Java";
        abc = abc.replace("a","i");
        System.out.println(abc);//Jivi

        //toString(); methodu StringBuilder'lari String'e cevirir.
        String stringstrb3 = strb3.toString();
        System.out.println(stringstrb3);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //String'den de StringBuilder'a aşağıdaki gibi donebilirsiniz.
        StringBuilder strb4 = new StringBuilder(stringstrb3);
        System.out.println(strb4);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //insert(3, "XXXX") 3. karakterden sonra "XXXX" leri koyar.
        strb4.insert(3,"XXXX");
        System.out.println(strb4);//mmmXXXXmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //insert(3,"KLMOPQRSTU",5,8); ==> 3. karakterden sonra "KLMOPQRSTU" String'inin 5,6,7'deki karakterlerini yerleştirir.
        strb4.insert(3,"KLMOPQRSTU",5,8);
        System.out.println(strb4);//mmmQRSXXXXmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC


        StringBuilder a = new StringBuilder("Iava");
        StringBuilder b = new StringBuilder("Java");

        //compareTo() methodu i)StringBuilder tamamiyla ayni ise 0 verir.
        //                   ii)a alfabetik sirada b'den sonra gelirse pozitif olarak aradaki alfabetik sıralama farkini gosterir.
        //                  iii)a alfabetik siralamada b'den once gelirse negatif olarak aradaki alfabetik siralama farkini gosterir.
        int sonuc = a.compareTo(b);
        System.out.println(sonuc);//0



























    }



















}
