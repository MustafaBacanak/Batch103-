package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

         /*
            Kullaniciya ay ismi sorunuz ve kullaniciden son aya kadar ekrana yazdiriniz.
        */

        //Note1 : toLowerCase() metodu bir String'deki tum characterleri kucuk harf yapar.
        //Note2 : toUpperCase() metodu bir String'deki tum characterleri buyuk harf yapar.

        //Note3 : Switch içerisine hangi tip data koyulduysa "case" lerde o tip olmalıdır.

        Scanner input = new Scanner(System.in);
        System.out.println("Ay ismini giriniz..");
        String ayIsmi = input.next().toLowerCase();

        switch (ayIsmi){

            case "ocak":
                System.out.println("Ocak");
            case "subat":
                System.out.println("Şubat");
            case "mart":
                System.out.println("Mart");
            case "nisan":
                System.out.println("Nisan");
            case "mayis":
                System.out.println("Mayıs");
            case "haziran":
                System.out.println("Haziran");
            case "temmuz":
                System.out.println("Temmuz");
            case "agustos":
                System.out.println("Ağustos");
            case "eylül":
                System.out.println("Eylül");
            case "ekim":
                System.out.println("Ekim");
            case "kasim":
                System.out.println("Kasım");
            case "aralik":
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Bu yaşından sonra sana yazmayı mı öğretelim");



        }
    }
}
