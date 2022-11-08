package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        //Example 1 = Kullanicidan bir sayi aliniz sayi 100 den kucuk ise ekrana kazandin yazdiriniz.
        //            Aksi halde ekrana kaybettin yazdiriniz.
        //            Kullanici kazandikca oyun devam etmeli.

        Scanner input = new Scanner(System.in);

        int sayi =0;

        do{
            System.out.println("Bir sayi giriniz");
            sayi = input.nextInt();

            if(sayi<100){
                System.out.println("Şanslı pic :D ");
            }
        }while (sayi<100);

        System.out.println("Hadi Köyüneee ");

        //Example 2: Kullanicidan isimler aliniz ilk harfinin buyuk olup olmadigini kontrol ediniz.

        do {
            System.out.println("Isim giriniz");
            char ilkHarf = input.next().charAt(0);

            if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
                System.out.println("Aferin adam ol. ");
            }else {
                System.out.println("Yanlis isim");
                break;
            }
        }while (true);

        //Infinite Loop : Sonsuz Döngü

        //Artirma azaltma kisminda hata yaparsaniz "infinite loop sorunsalı" olusur.

////        for(int i=1; i<4; i--){
////            System.out.println("Hi!");
//        }


        //Artirma azaltma kismini yazmassaniz "infinite loop sorunsali olusur"

//        for(int i =1 ; i<4 ;){
//            System.out.println("Hi!");
//        }

//        int i =12;
//
//        while (i<15){
//            System.out.println("Hi!");
//        }

    }
}
