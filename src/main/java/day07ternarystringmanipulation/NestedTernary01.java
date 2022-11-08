package day07ternarystringmanipulation;

public class NestedTernary01 {

    public static void main(String[] args) {

        //   ****  Dikkat : Interwiew sorusu !!!!  ****

        /*
            Verilen yilin "Leap Year" olup olmadigini kontrol eden kodu yaziniz.
            i)Yil 100e bolunurse 400 e de bolunmelidir.  ==> 1600+   1800-
            ii)Yil 100e bolunmezse 4 e bolunmelidir. ==> 1996+   2001-
         */
        int year = 1600;
        String leap = year%100==0 ? (year%400==0 ? "Leap Year"  : "Leap Year Degil") : (year%4==0 ? "Leap year" : "Leap Year Degil");
        System.out.println(year);

        /*
            Asagidaki kurallara gore password'un dogru olup olmadigini kontrol eden kodu yaziniz
            i)Sekiz karakterden fazla veya sekiz karakter varsa ilk harfi 'i' olmalidir.
            ii)Sekiz karakterden az karakter varsa ilk harfi 'K' olmalidir.
        */

        //Note : length metodu kaç tane karakter oldugunu verir.

        String pwd ="K2a3";

        char ilkHarf = pwd.charAt(0);

       String gecerli= pwd.length()<8 ? (ilkHarf=='K' ? "Gecerli" : "Gecersiz")  : (ilkHarf=='i' ? "Gecerli" : "Gecersiz");
        System.out.println(gecerli);

    }
}
