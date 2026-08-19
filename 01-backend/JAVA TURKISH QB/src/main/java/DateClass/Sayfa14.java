package DateClass;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Sayfa14 {

    public static void main(String[] args) {

        /*

        4) Ali, 29 Ekim 1923'ten 45 yıl 8 ay 5 gün sonra doğmuştur.
           Veli, 15 Eylül 1993'ten 24 yıl 2 ay 11 gün önce doğmuştur.
           Ali ve Veli'nin kesin doğum tarihini hesaplamak için kodu yazınız.
           Ali ve Veli'nin doğum tarihinin aynı olup olmadığını kontrol etmek için kodu yazınız.

        */

        LocalDate aliDogumGunu = LocalDate.of(1923,10,29).plusYears(45).plusMonths(8).plusDays(5);
        LocalDate veliDogumgunu = LocalDate.of(1993,9,15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println(aliDogumGunu);
        System.out.println(veliDogumgunu);

        if (aliDogumGunu.equals(veliDogumgunu)){

            System.out.println("Dogum Gunleri Esittir");
        }else{

            System.out.println("Dogum Gunleri Esit Degildir");
        }

        /*

        5) Veli, Ali'den 3 yıl 11 gün sonra doğmuştur.
        Ali size doğum tarihi bilgisini 24 Kasım 2012 olarak vermiştir.
        Veli'nin doğum tarihini hesaplamak için gerekli kodu yazınız.

        */

        LocalDate aliDogum = LocalDate.of(2012,11,24);
        LocalDate veliDogum = aliDogum.plusYears(3).plusDays(11);
        System.out.println(veliDogum);

        /*

        6) Kendinizin ve çocuğunuzun doğum tarihi için Tarih Değerleri oluşturup, ardından farkı gün olarak hesaplayınız.

        */

        LocalDate sevimDogumGunu = LocalDate.of(1967,3,10);
        LocalDate sahinDogumGunu = LocalDate.of(1990,10,6);
        long fark = ChronoUnit.DAYS.between(sevimDogumGunu,sahinDogumGunu);
        System.out.println("Dogum gunu farkı :"+ fark);


    }


}
