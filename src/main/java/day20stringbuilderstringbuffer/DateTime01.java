package day20stringbuilderstringbuffer;

import java.time.LocalDate;

public class DateTime01 {


    public static void main(String[] args) {

        //Ex 8 :Tom,Ali'den 3 yil 8 ay 13 gün sonra dogdu. Ali ise Veli'den 1 yil 15 gun once dogdu.
        //  Tom'undogum tarihi 18 Kasim 2011 ise Veli ve Ali'nin dogum tarilerini bulunuz.

        LocalDate dobTom= LocalDate.of(2011,11,18);

        LocalDate dobOfAli = dobTom.minusYears(3).minusMonths(8).minusDays(13);//Method Chain

        LocalDate dobOfVeli =dobOfAli.plusYears(1).plusDays(15);

        System.out.println("Ali : "+dobOfAli+ " ve " + "Veli" + dobOfVeli);


    }
}
