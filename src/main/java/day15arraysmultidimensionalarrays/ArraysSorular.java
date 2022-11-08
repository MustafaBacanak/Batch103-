package day15arraysmultidimensionalarrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArraysSorular {

    public static void main(String[] args) {
        //Example 1: Bir String'deki sesli harflerin sayisini bulan kodu yaziniz
        //           a - e - i - o - u - A - E - I - O - U


        //Example 1: String bir Array olusturunuz ve "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz

        String arr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for (String w : arr) {
            System.out.print(w + " ");
            if (w.equals("Tom")) {
                break;

            }
        }
        System.out.println();

        //Example 2: String bir Array olusturunuz "Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz

        for (String w : arr) {
            if (w.equals("Tom") || w.equals("Jane")) {
                continue;
            }
            System.out.print(w + " ");
        }

        System.out.println();


        //Example 3: Bir ogretmenin sinfindaki ogrencilerin isimlerini application'a yuklemesini saglayan kodu yaziniz.
        //           ( Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz )



        // Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz
        //            [2, 3, 12, 0,  0,  0]


        //Example 2: Bir Array'in icinde herhangi bir elemanin olup olmadigini kontrol eden
        // ve kac kere tekrarlandigini gosteren kodu yaziniz
        //           [ 2, 1, 2, -3, 2] ==> Kullanici 2'yi sordu ==> 2 elemani var ve 3 kere tekrarlandi
        //                             ==> Kullanici 6'yi sordu ==> 6 array'de yok

        Scanner input = new Scanner(System.in);
//        System.out.println("Lütfen bi sayi giriniz");
//        int sayi = input.nextInt();
//
//        int brr[] = {2, 1, 2, -3, 2};
//        int sayac = 0;
//
//        for (int w : brr) {
//            if (w == sayi) {
//                sayac++;
//            }
//        }
//        if (sayac > 0) {
//            System.out.println(sayi + " elemani var ve " + sayac + " kere tekrarlandi");
//
//        }else System.out.println(sayi+" Array'de yok");



        //Example 3: Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz
        //           "Java kolaydir calisana, ne kolay ki calismayana." ==> calismayana

//        String cumle =  "Java kolaydir calisana, ne kolay ki calismayana.";
//
//        cumle=cumle.replaceAll("[\\p{Punct}]","");
//
//        String a[]=cumle.split(" ");
//
//        Arrays.sort(a,Comparator.comparingInt(String::length));
//        System.out.print(a[a.length-1]);



    }
}
