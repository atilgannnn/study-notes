package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {

    public static void main(String[] args) {

        //Example 1: "Anlik tarihi"(Current Date) ekrana yazdiran kodu yaziniz.

        LocalDate currentDate = LocalDate.now();

        System.out.println(currentDate);//2022-10-21


        //Example 2: "Anlik Zamani"(Current Time) ekrana yazdiran kodu yaziniz.

        LocalTime currentTime = LocalTime.now();

        System.out.println(currentTime);//20:41:39.280297

        //Example 3: "Anlik tarihi"(Current Date) ve "Anlik Zamani"(Current Time) ekrana yazdiran kodu yaziniz.

        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println(currentDateTime);//2022-10-21T20:50:51.227240


        //Example 4: Japonya'daki "Anlik tarihi"(Current Date) ve "Anlik Zamani"(Current Time) ekrana yazdiran kodu yaziniz.

        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println(currentDateTimeInJapan);//2022-10-22T02:50:51.227465

        // Example 5: Istanbul'daki "Anlik tarihi"(Current Date) ve "Anlik Zamani"(Current Time) ekrana yazdiran kodu yaziniz.

        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));

        System.out.println(currentDateTimeInIstanbul);//2022-10-21T20:53:05.718778

        //Example 6: Bugünden 789 gun sonra emekli olacaginiza gore, emeklilik tarihini hesaplayan kodu yaziniz.

        LocalDate countDate = LocalDate.of(2022,10,21);
        LocalDate retireDate = countDate.plusDays(789);

        System.out.println(retireDate);//2024-12-18

        //Example 7: Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz.

        LocalDate dobAli = LocalDate.of(2005,5,17);
        LocalDate dobVeli = LocalDate.of(2013,2,8);

        //between(dobAli,dobVeli) methodu kullanildiginda daha eski olan tarih once yazilmalidir.
        Long difference = ChronoUnit.DAYS.between(dobAli,dobVeli);
        System.out.println(difference);//2824

        //Example 8: Istanbul'un Fethi ile Cumhuriyetin kurulmasi arasinda kac ay oldugunu gosteren kodu yaziniz.
        //          29 Mayis 1453 ==> Istanbul'un Fethi         29 Ekim 1923 ==> Cumhuriyetin Kurulusu

        LocalDate istanbulunFethi = LocalDate.of(1453,5,29);
        LocalDate cumhuriyetKurulus = LocalDate.of(1923,10,29);

        Long aySayisi = ChronoUnit.MONTHS.between(istanbulunFethi,cumhuriyetKurulus);
        System.out.println(aySayisi);//5645

        //Example 9: Verilen tarihin hangi burcta oldugunu gosteren kodu yaziniz.

        LocalDate myDate = LocalDate.of(1989,5,13);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        System.out.println(day+ "-" +month);

        // 1. Yol:

        if (day>=21 && month == 3){
            System.out.println("Koc Burcu");
        }else if(day<=20 && month == 4){
            System.out.println("Koc Burcu");
        }else if (day>=21 && month == 4){
            System.out.println("Boga Burcu");
        }else if (day<=20 && month == 5){
            System.out.println("Boga Burcu");
        }

        //2. Yol:

        if ((day>=21 && month == 3) || (day<=20 && month == 4)){
            System.out.println("Koc Burcu");
        } else if ((day>=21 && month == 4) || (day<=20 && month == 5)){
            System.out.println("Boga Burcu");
        }


    }

























}
