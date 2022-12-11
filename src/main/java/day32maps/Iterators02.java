package day32maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {

    public static void main(String[] args) {


        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //Ex1 : Iterators kullanarak list elemanlarini tersten console'a yazdirin

        ListIterator<String> itr =myList.listIterator();

        //hasNext() methodu pointer'dan SONRA eleman varsa "true" yoksa "false" return eder.
        //next() methodu pointeri bir SONRAKİ elemanın onune koyar ve ustunden atladigi elemani return eder.
        while (itr.hasNext()){
            String abc =itr.next();
            System.out.print(abc);
        }

        System.out.println();

        //hasPrevious() methodu pointer'dan ÖNCE eleman varsa "true" yoksa "false" return eder.
        //previous() methodu pointeri bir ÖNCEKİ elemanın sonuna koyar ve ustunden atladigi elemani return eder.

        while (itr.hasPrevious()){
            String el = itr.previous();
            System.out.print(el + " ");
        }

        System.out.println();

        //Ex2 : List'deki tum elemanlari siliniz.

        while (itr.hasNext()) {
            itr.next();
            itr.remove();
        }
        System.out.println(myList);


     /*
        ListIterator : 1)hasNext(), 2)next(), 3)set() , 4)hasPrevios(), 5)previous, 6)remove()

        Iterator : 1)hasNext(), 2)next(), 3)remove()

     */

        //Eger iki tarafli haraket etmek istemiyorsan > Iterator
        //Eger list elemanlarinin degistirilmesini istemiyorsak > Iterator
        //Eger sadece silmek istemiyorsaniz > Iterator

        List<String> yourList = new ArrayList<>();
        yourList.add("Z");
        yourList.add("K");
        yourList.add("A");
        yourList.add("J");
        yourList.add("M");

        Iterator<String> itr1=yourList.iterator();

        while (itr1.hasNext()){
            String el = itr1.next();
            System.out.print(el);
        }
    }
}