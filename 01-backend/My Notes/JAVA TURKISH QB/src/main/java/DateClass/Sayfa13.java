package DateClass;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Sayfa13 {

    public static void main(String[] args) {

        /*

        1) Ali'nin kaç gün yaşadığını bulan kodu yazınız.
        Ali'nin doğum tarihi 12 Mayıs 2002'dir.

        */

        LocalDate dogumGunu = LocalDate.of(2002,5,12);
        LocalDate bugununTarihi = LocalDate.now();

        long yasadigiGunSayisi = ChronoUnit.DAYS.between(dogumGunu,bugununTarihi);
        System.out.println(yasadigiGunSayisi);//7497

        /*

        2) Ali'nin kaç ay yaşadığını bulan kodu yazınız.
        Ali'nin doğum tarihi 4 Haziran 1997'dir.

        */

        LocalDate aliDogumGunu = LocalDate.of(1997,6,14);
        LocalDate bugun = LocalDate.now();

        long yasadigiAySayisi = ChronoUnit.MONTHS.between(aliDogumGunu,bugun);
        System.out.println(yasadigiAySayisi);//305

        /*

        3) Ali'nin doğum tarihi 4 Haziran 1997'dir.
        Ali'nin doğum tarihinden 2 yıl, 3 ay ve 12 gün sonraki tam tarihi bulmak için kodu yazınız.

        */

        LocalDate aliBirthDay = LocalDate.of(1997,6,14);
        LocalDate futur = aliBirthDay.plusYears(2).plusMonths(3).plusDays(12);
        System.out.println(futur);//1999-09-26




    }

}
