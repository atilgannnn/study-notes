package DateTimeClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Sayfa16 {

    public static void main(String[] args) {

        /*

        1) Eğer saat
        i) 24:00 ile 05:00 arasında ise konsola 'Uyku zamanı' yazdırınız.
        ii) 08:00 ile 16:00 arasında ise konsola 'Çalışma zamanı' yazdırınız.
        iii) 19:00 ile 22:00 arasında ise konsola 'Aile zamanı' yazdırınız.
        iv) Diğerleri için konsolda 'Kişisel zaman' yazdırınız.

        */

        LocalTime jetzt = LocalTime.now();
        int uhr = jetzt.getHour();

        if (uhr > 0 && uhr < 5){

            System.out.println("Uyku Zamanı");
            
        } else if (uhr > 8 && uhr < 16) {

            System.out.println("Çalışma Zamanı");
            
        } else if (uhr > 19 && uhr < 22) {

            System.out.println("Aile Zamanı");

        }else{

            System.out.println("Kişisel Zaman");
        }

        /*

        2) Japonya saat dilimi ile Almanya saat dilimi arasındaki saat farkını bulmak için kodu yazınız.

        */

        LocalDateTime Japan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime Germany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        long difference = ChronoUnit.HOURS.between(Japan,Germany);
        System.out.println(difference);


    }


}
