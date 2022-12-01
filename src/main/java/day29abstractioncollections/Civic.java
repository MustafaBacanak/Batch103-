package day29abstractioncollections;

public class Civic implements Engine,Ac{

    /*
        * "abstract method"lar sadece ne yapilacagini soyler.(What to do)
        * "concrete method"lar ne yapilacagi ile birlikte nasil yapilacagini de soyler.(How to do)
        * "interface"ler yapilacak isler listesidir. (To do list)

        * "multiple parent interface" kullandiginizda ayni method ismi ile birden fazla method olusturursaniz
           bu methodlarin return typle'lari ayni olmalidir aksi takdirde hata verir.
        * (void run(); methodu ikisinde de aynı olmali)

        * "interface" lerde constructor olmadigi icin interface'lerden object olusturulamaz.
        * "abstract class" larda class olduklari icin constructor vardir.
           Ama constructorlar abstract classlarda object olusturamazlar.

     *** Soru : "Abstract Class" ile "Interface"in farklari nelerdir ?

             1)Method
                  "Abstract Class" hem abstract hem de concrete methodlar vardir.
                  "Interface"ler ise sadece abstract method'lar icerir.
                  Ama istersek interface'ler icinde de "default" ve "static" keyword kullanarak
                  concrete methodlar olusturabiliriz.

              2)Variable
                   "Abstract Class"larda normal Class'lardaki gibi her turlu variable olusturulabilir.
                   "Interface"lerde ise variable'lar public static ve final olmak zorundadir.

              3)Inheritance
                   "Abstract Class"lar class olduklari icin multiple inheritance'a musade etmez
                   "Interface"ler ise multiple inheritance'i desteklerler.

              4)Object Creation
                   "Abstract Class" larda constructor vardir ama object olusturmada kullanilmazlar.
                   "Interface" lerde ise constructor olmadigindan object olusturulamaz.


     *** Soru : Object Oriented Programming Language prensipleri nelerdir?
                 * Inheritance  * Polymorfizm  * Encapsulation  * Abstraction
     */

    @Override
    public void run() {
        System.out.println("Civic runs well");
    }

    @Override
    public void eco() {

    }

    @Override
    public void ges() {

    }

    @Override
    public void tsi() {

    }
}
