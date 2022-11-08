package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

    public static void main(String[] args) {

        /*
             Arraylistler aynı data tipine sahip birden fazla datayi depolamak icin kullanilir.

             **** Array ile ArrayList'in farki nedir ? ****  İNTERWİEW SORUSU

             1) Array olustururken Array'in icine kac tane eleman koymamiz gerektigini söylemeliyiz
                ve söylediğimizden fazla eleman koyamayiz.
                Arrayler eleman sayisinda "fixed" dirler.
                Arraylistleri olustururken eleman sayisi belirtmeye gerek yoktur.Cunku Arraylistler
                eleman sayisinda "flexible"(esnek) dirlar.

             2) Array'lerin icine "primitive" ve "reference (adres)" lar konabilir.
                ArrayListlerin icine ise sadece "non-primitive" ler konulur.

             3) Array'ler super fast,cok hizli.Array'ler memoryi cok az kullanilir.

             Note: Eleman sayisi kesin bell olan coklu datalari depolamak icin Array kullaniriz,ama
                   eleman sayisi degisken olan coklu dataalr icin Array kullanma riskini almayin.

         */


        //ArrayList nasil olusturulur ?

        //1.Yol:
        ArrayList<Integer>ages = new ArrayList<Integer>();
        //2.Yol:
        ArrayList<Integer> heights =new ArrayList<>();
        //3.Yol:
        List<Integer> nums =new ArrayList<>();  // Experiance !!!

        //ArrayList'ler nasil yazdirilir?
        System.out.println(nums);

        //ArrayList'lere nasil eleman eklenir?
        //add() her zaman elemani en sona ekler. (insertion order)
        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums);//[21, 18, 20]

        //add() methodu tek parametreli kullaniliyorsa "boolean" return eder.
        //      Cift parametre ile kullaniliyorsa hic bisey return etmez.(void)

        nums.add(1,50);
        System.out.println(nums); // [21, 50, 18, 20]

        List<Integer> prices=new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices);

        System.out.println(nums);// [21, 50, 18, 20, 23, 185]
        System.out.println(prices);//[23, 185]

        nums.addAll(2,prices);
        System.out.println(nums);// [21, 50, 23, 185, 18, 20, 23, 185]

        //ArrayList'lerin eleman sayisi nasil bulunur ?

        int elemanSayisi = nums.size();
        System.out.println(elemanSayisi);

        /*
            Arrayler hakkinda sayi belirtirken "length" denir.
            ArrayList'lerde sayi "size" ile söylenir
        */

        //ArrayList'lerde herhangi bir eleman nasil secilir ?
        //*** get() methodu istenen bir indexteki elemani verir. ( *** önemli! Cok kullanilacak *** )
        int el1= nums.get(3);
        System.out.println(el1);//185

        //Arraylistlerin bos olup olmadigini nasil anlariz ?
        boolean bos1 =nums.isEmpty();
        System.out.println(bos1); //false

        boolean bos2=nums.isEmpty();
        System.out.println(bos2); //true

        //ArrayList'de bir eleman nasil degistirilir //    *** ÖNEMLİ ÇOK KULLANILACAK ***
        nums.set(3,200);
        System.out.println(nums);// [21, 50, 23, 185, 18, 20, 23, 185] >> [21, 50, 23, 200, 18, 20, 23, 185]

        //Ex 1: nums ArrayList'indeki tum tek sayilari 11 artirdiktan sonra ekrana yazdirin

        for(int w :nums){
            if(w%2!=0){
                nums.set(nums.indexOf(w),w+11);
            }
        }
        System.out.println(nums);

        //remove() metodunun icine tamsayi koyarsanız Java onu index olarak kabul eder.   * * ÖNEMLİ * *


        //                  * * *  Ö N E M L İ * * *

        //Note 1: Tum tamsayilar aksi söylenmedikce Java icin "primitive" dir. Yani "int" dir.
        //Note 2: "primitive" ler ArrayListlerin elemani olamazlar.
        //Note 3: "primitive" i Wrapper Class'a cevirirseniz non-primitive olur.
        //         ve non-primitivler ArrayListlerin elemani olur,index olamaz.

        //Ex 2: ArrayList'den 200 elemaninin ilk gorunumunu  siliniz

        Integer sayi =200;
        nums.remove(sayi);
        System.out.println(nums);

    }
}
