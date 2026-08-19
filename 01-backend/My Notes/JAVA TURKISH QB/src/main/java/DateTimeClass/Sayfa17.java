package DateTimeClass;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Sayfa17 {

    public static void main(String[] args) {

        /*

        3) Ali 5 Şubat 2015 TRT 10:00'da İstanbul' da, Mark 5 Şubat 2015 12:00 EST' de ABD' de doğmuştur.
        Ali'nin doğum saati ile Mark'ın doğum saati arasındaki saat cinsinden fark nedir?

        */

        LocalDateTime ali = LocalDateTime.of(2015,2,5,10,0,0);
        LocalDateTime mark = LocalDateTime.of(2015,2,5,10,0,0);
        ZonedDateTime aliLokal = ali.atZone(ZoneId.of("Europe/Istanbul"));
        ZonedDateTime markLokal = mark.atZone(ZoneId.of("America/New_York"));
        long saatFarki = ChronoUnit.HOURS.between(aliLokal,markLokal);
        System.out.println(saatFarki);

        /*

        4) Ali 5 Şubat 2015 saat 10:15 EST'de doğmuştur, Veli 6 Mart 2015 saat 12:25 EST'de doğmuştur.
        Ali ve Veli'nin doğum süreleri arasındaki fark nedir?

        */

        LocalDateTime alican = LocalDateTime.of(2015,2,5,10,15,0);
        LocalDateTime velican = LocalDateTime.of(2015,3,6,12,25,0);
        long saatFarki2 = ChronoUnit.MINUTES.between(alican,velican);
        System.out.println(saatFarki2);


        /*

        5) Mark 23.02.2018 tarihinde saat 15:25'te GMT ' de doğmuştur.
        Mark'ın Japonya'daki tam doğum tarihi ve saati nedir?

        */
        LocalDateTime markTokyo = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime markGMT = LocalDateTime.now(ZoneId.of("GMT"));
        long fark = ChronoUnit.HOURS.between(markTokyo,markGMT);
        LocalDateTime markcan = LocalDateTime.of(2018,2,23,15,25,0).minusHours(fark);
        System.out.println("Tokyo'dan markcanın dogum tarihi: " +markcan);




    }


}
