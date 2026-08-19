package TernaryStatement;

public class Sayfa25 {

    public static void main(String[] args) {


         /*
            1) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
            Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
            Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"
         */

        String pwd = "a1b 2c3";
        String gecerliMi = pwd.replaceAll("\\s","").length()> 7 ? "Gecerli Parola" : "Gecersiz Parola";
        System.out.println(gecerliMi);

          /*
            2) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
            a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
            b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
            c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "
          */

        int kenar1 = 9;
        int kenar2 = 7;
        int kenar3 = 7;

        String esitMi = kenar1 == kenar2 && kenar2 == kenar3? "Eşkenar Üçgen" : (kenar1 == kenar2 && kenar2 != kenar3 || kenar2 == kenar3 && kenar3 != kenar1 || kenar1 == kenar3 && kenar1 != kenar2 ? "İkizkenar Üçgen" : "Çeşit Kenar Üçgen");

        System.out.println(esitMi);



















            /*
            3) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
            a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalı-
            ğa yuvarla”
            b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”
            Örneğin; 127 yukarı yuvarlanacak ve değer 130 olacaktır.
            125 yukarı yuvarlanacak ve değer 130 olacaktır. 123 aşağı yuvarlanacak ve değer 120 olacaktır.
            */

        int sayi = 123;
        String sonuc = sayi%10 >= 5 ?  ("Son basamagi bir ust ondaliga yuvarla: " + (sayi/10+1)*10) : ("So basamagi bir alt ondaliga yuvarla: " + (sayi/10)*10);
        System.out.println(sonuc);



































    }




























}
