package day13loopsarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arrays01 {

        /*
            1)Ayni data tipinde, coklu data'i depolmaka icin Java'nin olusturdugu yapilar vardir.
              Bu yapilardan birisi de "Array" lerdir.
         */

    public static void main(String[] args) {

        //Array nasil olusturulur?
        int stdAges[] = new int[7];// [ 0, 0, 0, 0, 0, 0, 0 ]

        //Array nasil yazdirilir?
        System.out.println(Arrays.toString(stdAges));

        //Array'lere elemanlar nasil eklenir?
        stdAges[1] = 11;
        stdAges[0] = 12;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;
        System.out.println(Arrays.toString(stdAges));// [12, 11, 13, 14, 10, 12, 12]

        //Array'deki herhangi bir elemani nasil yazdirabiliriz?

        System.out.println(stdAges[4]);//10

        //Example 1: Array'deki en kucuk ve en buyuk elemanin toplamini ekrana yazdiriniz
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));//[10, 11, 12, 12, 12, 13, 14]

        int ilk = stdAges[0];

        //Note: "length()" String'lerde kullanilir, "length" Array'lerde kullanilir
        int son = stdAges[stdAges.length-1];

        System.out.println(ilk + son);//24

        //Example 2: stdAges Array'i icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz.

        //1.Yol: for-loop

        int sum = 0;

        for(int i=0; i<stdAges.length; i++){
            sum = sum + stdAges[i];
        }
        System.out.println(sum);

        //2.Yol: while-loop
        int i=0;
        int toplam = 0;

        while(i<stdAges.length){
            toplam = toplam + stdAges[i];
            i++;
        }
        System.out.println(toplam);

        //3.Yol: do-while-loop

        int k=0;
        int su = 0;

        do{
            su = su + stdAges[k];
            k++;
        }while(k<stdAges.length);
        System.out.println(su);

        //4.Yol: for each loop Array'lerde ve Collections'larda kullanilir

        int t = 0;

        for(int w : stdAges){
            t = t + w;
        }

        System.out.println(t);

        //Example 3: String bir array olusturunuz
        //           Bu Array'e 5 tane isim yerlestiriniz
        //           Bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz
        String stdNames[] = new String[5];//{0,0,0,0,0}
        stdNames[0] = "Ali";
        stdNames[1] = "Tom";
        stdNames[2] = "Veli";
        stdNames[3] = "Kemal";
        stdNames[4] = "Cem";

        int karakterSayilariToplami = 0;// length() = uzunluk  length()-1 son index

        for(String w : stdNames){
            karakterSayilariToplami = karakterSayilariToplami + w.length();//3+3+4+5+3
        }
        System.out.println(karakterSayilariToplami);//18

        //Example 4: Char bir array olusturunuz
        //           Bu array'e 7 eleman ekleyiniz
        //           Bu array'deki sadece buyk harfleri ekrana yazdiriniz

        char ch[] = { 'M', 'c', 'D', 'k', 'A','P','u' };


        for(char w : ch){
            if(w>='A' && w<='Z'){
                System.out.print(w);
            }
        }

        System.out.println();
        //Kullanıcıdan girdi olarak bir Dize alan ve bu dizide meydana gelen maksimum karakteri
        //bulan bir Java programı yazın. (Büyük/küçük harf duyarlılığını göz ardı edin).

        String str= "Learning, java is easy.";

//        str=str.replaceAll("\\p{Punct}","");
//        str=str.replaceAll("\\s+","");
//        String arr[]=str.split("");
//        List<String> list1 = new ArrayList<>(List.of(arr));
//        System.out.println(list1);

        for (int j = 0; j < str.length() ; j++) {
            char x=str.charAt(i);
            if(str.indexOf(x)!=(str.lastIndexOf(x))){
                System.out.println(str);
            }

        }


    }
}
