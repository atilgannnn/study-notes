package DateClass;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Sayfa15GrubaSor {

    public static void main(String[] args) {

        /*

        7) Belirli bir tarihte yılın son 2 hanesini alınız.

        */

        LocalDate bugun = LocalDate.of(2022,11,24);
        int sonIkiRakam = bugun.getYear()%100;
        System.out.println(sonIkiRakam);

        /*

        8) Belirli bir yılın "Artık yıl" olup olmadığını kontrol etmek için kodu yazınız.
        Artık Yıl:
        i) Bir yıl 100'e ve 400'e tam bölünüyorsa buna artık yıl denir. Örneğin; 2000 artık yıl, 1900 değildir.
        ii) Bir yıl 100'e ve 4'e tam bölünemiyorsa artık yıl olarak adlandırılır. Örneğin; 2004 artık yıl, 2007 değildir.

        */

        LocalDate belirliYil = LocalDate.of(1990,10,6);
        boolean leapYear = belirliYil.isLeapYear();
        System.out.println(leapYear);

        /*

        9) İki farklı tarihin ay numaralarının toplamını bulunuz.

        */

        LocalDate date1 = LocalDate.of(1990,10,6);
        LocalDate date2 = LocalDate.of(1994,8,17);

        System.out.println("Sum is:" +date1.getMonth()+date2.getMonth());//Sum is:OCTOBERAUGUST yazdırdı hatam nerede?

        /*

        10) İki farklı tarih için saat farkını bulunuz.

         */

        long saatFarki = ChronoUnit.HOURS.between(date1,date2);
        System.out.println(saatFarki);//UnsupportedTemporalTypeException attı






    }

}
