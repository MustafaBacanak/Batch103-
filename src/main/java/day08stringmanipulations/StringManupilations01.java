package day08stringmanipulations;

import java.util.Scanner;

public class StringManupilations01 {
    public static void main(String[] args) {

        //Ex 1: Kullanicidan aldiginiz ismin ilk ve son harfini yazdiriniz

        Scanner input = new Scanner(System.in);
//        System.out.println("Adınng Nee ? ");
        String isim = input.next();

//        char ilkHarf = isim.charAt(0);
//        char sonHarf = isim.charAt(isim.length()-1);
//
//        System.out.println("" + ilkHarf + sonHarf);

        //2.yol
//        String ilk = isim.substring(0,1);
//        String son = isim.substring(isim.length()-1);
//
//        System.out.println(ilk + son);

        //Ex 2: Verilen Stringdki sadece hayvan isimlerini ekrana yazdiriniz
        //      "Ben kedi, esim tavuk, oglum sever inek"

//        String str = "Ben kedi, esim tavuk, oglum sever inek";

        //substring() in iki kullanimi vardir
        //1)substring(baslangic indexi,bitis indexi) Stringin ortasinndan bir parca almaya yarar
        //2)substring(baslangic indexi) Stringin verilen index'ten sonuna kadar almaya yarar.

//        String kedi = str.substring(4, 8);
//        String tavuk = str.substring(15, 20);
//        String inek = str.substring(34);
//
//        System.out.println(kedi + tavuk + inek);

        //Ex 3: Ilk isim ve soy isimi iceren isimlerden ilk ve soy isimlerin bas harflerini ekrana yazdiriniz
        //              Ali Can ==> AC          Tahsin Yurdakul  ==> TY

//        System.out.println("Ilk ve Soy ismini gir moruk");
//        String tamIsim = input.nextLine();
//
//        String a = tamIsim.substring(0, 1);
//        String b = tamIsim.split("")[1].substring(0, 1);
//
//        System.out.println(a+b);




    }
}



