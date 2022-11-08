package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {

    public static void main(String[] args) {

        //Example 1: Japonya ile Almanya arasindaki zaman farkini saat olarak hesaplayan kodu yaziniz
        LocalDateTime japan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime germany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        Long fark = ChronoUnit.HOURS.between(germany, japan);
        System.out.println(fark);// 6

        //Example 2: Sabit bir tarih oluşturunuz.
        LocalDate myDate = LocalDate.of(2011, Month.APRIL, 13);
        System.out.println(myDate);

        /*
            Java'da sabit dataları(Gün isimleri, Ay isimleri, Amerika'daki eyalet isimleri etc...) depolamak ve gerektiğinde kullanmak için depolar
              oluştururuz. Bu depolara "Enum" denir.
         */
        //Example 3: "USA" için "Woow" yazın, "UK" için "Big" yazın, "CANADA" için "Cold", "TURKEY" için "Vatan", "GERMANY" için "Araba", "RWANDA" için "Çay"
        Countries country = Countries.UK;

        switch (country) {

            case USA:
                System.out.println("Woow");
                break;
            case UK:
                System.out.println("Big");
                break;
            case CANADA:
                System.out.println("Cold");
                break;
            case TURKEY:
                System.out.println("Vatan");
                break;
            case GERMANY:
                System.out.println("Araba");
                break;
            case RWANDA:
                System.out.println("Çay");
                break;
            default:
                System.out.println("Tanımlanmamış ülke...");

        }
    }
}