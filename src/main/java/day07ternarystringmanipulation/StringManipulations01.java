package day07ternarystringmanipulation;

public class StringManipulations01 {

    public static void main(String[] args) {

        /*
                                          String Class Metodlari

               1)equals(): i)Iki tane string metodun aynı olup olmadigini anlamamiza yarar.
                           ii)equals() methodu "boolean" return eder.

               2)equalsIgnoreCase(): i)Iki tane Stringin ayni olup olmadigini buyuk-kucuk harfe dikkat etmeden anlamamiza yarar
                                    ii)equalsIgnorCase() methodu "boolean" return eder.

               3)toLowerCase(): i)Bir String'deki tum harfleri kucuk harfe cevirmek icin kullanilir
                                ii)toLowerCase() methodu "String" return eder.

               4)toUpperCase(): i)Bir Stringdeki tum harfleri buyuk harfe cevirmek icin kullanilir
                                ii)toUpperCase() methodu "String" return eder.

               5)charAt(): i)Bir String'den belli bir indexdeki characteri almak icin kullanilir
                           ii)charAt() methodu "char" return eder.

               6)length(): i)Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir.
                           ii)leght() methodu "int" return eder.

               7)contains(): i)Bir String'de belli bir characterin ya da characterlerin var olup olmadigini anlamak icin kullanilir.
                             ii)contains() methodu "boolean" return eder.

               8)split(): i)Bir String'i istedigimiz yerden parcalamaya yarar.
                          ii)split() methodu "Array" return eder

        */

        /*
                Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                i)En Az 8 character icermeli
                ii)Space characteri icermemeli
                iii)Ilk harfi "M" veya "m" olmali
                iv)Son characteri "?" olmali

         */

        String pwd = "Manisa12?";

        //i)En Az 8 character icermeli
        boolean first = pwd.length()>7;

        //ii)Space characteri icermemeli
        boolean second = !pwd.contains("");

        //iii)Ilk harfi "M" veya "m" olmali
        boolean third = pwd.charAt(0)=='M' || pwd.charAt(0)=='m';

        //iv)Son characteri "?" olmali
        boolean fourth = pwd.charAt(pwd.length()-1)=='?';

        System.out.println(first && second && third && fourth);


    }
}
