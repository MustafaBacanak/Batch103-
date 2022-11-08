package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {

        //Ex 1: "Anlik tarihi"(Current Date) ekrana yazdiran kodu yaziniz.
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        //Ex 2 : "Anlik zamanı"(Current Time) ekrana yazdiran kodu yaziniz.
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        //Ex 3 : "Anlik tarihi"(Current Date) ve "Anlik zamanı"(Current Time) ekrana yazdiran kodu yaziniz.
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        //Ex 4 : Japonya'daki "Anlik tarihi"(Current Date) ve "Anlik zamanı"(Current Time) ekrana yazdiran kodu yaziniz.
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);

        //Ex 5 : Istanbul'daki "Anlik tarihi"(Current Date) ve "Anlik zamanı"(Current Time) ekrana yazdiran kodu yaziniz.
        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europa/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);

        //Ex 6 : Bugunden 789 gun sonra emekli olacaginiza gore, emeklilik tarihini hesaplayan kodu yaziniz.
        LocalDate countDate = LocalDate.of(2022, 10, 21);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate); //24-12-18

        //Ex 7 : Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayanız.
        LocalDate dobdAli = LocalDate.of(2005, 5, 17);
        LocalDate dobVeli = LocalDate.of(2013, 2, 8);
        //between(dobAli , dobVeli) methodu kullanildiginda daha eski tarih once yazilmalidir.
        Long diff = ChronoUnit.DAYS.between(dobdAli, dobVeli);
        System.out.println(diff);//2824

        //Ex 8 : Istanbulun fethi ile Cumhuriyetin kurulması arasında kaç ay olduğunu gösteren kodu yazınız
        LocalDate istanbul = LocalDate.of(1453, 5, 29);
        LocalDate cumhuriyet = LocalDate.of(1923, 10, 29);

        Long aySayisi = ChronoUnit.MONTHS.between(istanbul, cumhuriyet);
        System.out.println(aySayisi);//5645

        //Ex 9 : Verilen tarihin hangi burcta oldugunu gosteren kodu yaziniz.
        LocalDate myDate = LocalDate.of(1992, 2, 19);

        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        //1.Yol:
        if (day >= 21 && month == 3) {
            System.out.println("Koc");
        } else if (day <= 20 && month == 4) {
            System.out.println("Koc");
        } else if (day <= 21 && month == 4) {
            System.out.println("Koc");
        } else if (day <= 20 && month == 5) {
            System.out.println("Koc");

            //2.Yol:
            if ((day >= 21 && month == 3) || (day <= 20 && month == 4)) {
                System.out.println("Koc");
            } else if ((day >= 21 && month == 4) || (day <= 20 && month == 5)) {
                System.out.println("Boga");
            }
        }
    }
}
