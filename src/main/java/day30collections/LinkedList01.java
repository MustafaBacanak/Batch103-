package day30collections;

import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        System.out.println(names);

        /*
            Retrieves, but does not remove, first element of this list.
            Returns: the head of this list, or null if this list is empt
         */
        names.peek();
        String firstEl=names.peek();
        System.out.println(firstEl);//Chris

        System.out.println(names);//[Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        LinkedList<String> myList = new LinkedList<>();
        String first=myList.peek();
        System.out.println(first);//null

        /*
            Retrieves and removes first element of this list.
            Returns: the head of this list, or null if this list is empty
         */

        String firstElement = names.poll();
        System.out.println(firstElement); //Chris

        System.out.println(names);//[Alexandre, Mark, Tom, Jeremy, Hans]

        /*
            Retrieves, but does not remove,first element of this list.
            Throws:NoSuchElementException – if this list is empty
         */

        String f=names.element();//Alexandre
        System.out.println(f);//[Alexandre, Mark, Tom, Jeremy, Hans]

        //Example 1 : "A" ile baslayan tum isimleri "*****" e cevirin.

        LinkedList<String> students = new LinkedList<>();
        students.add("Chris");
        students.add("Alexandre");
        students.add("Mark");
        students.add("Tom");
        students.add("Jeremy");
        students.add("Hans");

        System.out.println(students); //[Chris, Alexandre, Mark, Tom, Jeremy, Hans]

        for(String w:students){
            if (w.startsWith("A")){
                students.set(students.indexOf(w),"*****");
            }
        }
        System.out.println(students);//[Chris, *****, Mark, Tom, Jeremy, Hans]


        //            * * *  Interview Sorusu * * *

        //Example 2: List'deki 4 harften çok harf içeren isimleri siliniz.
        //Eleman sayısını azaltacağımız için i'ye ihtiyacımız var, o yüzden for-each loop değil for loop kullanırız.

        for (int i = 0; i<students.size(); i++) { //[Mark, Tom, Hans]

            if (students.get(i).length()>4){   //[Chris, Alexandre, Mark, Tom, Jeremy, Hans]
                students.remove(students.get(i));
                i--;
            }
        }
        System.out.println(students);

        //2.Yol
        LinkedList<String> students1 = new LinkedList<>();
        for (String w:students){  //[Chris, Alexandre, Mark, Tom, Jeremy, Hans]
            if (w.length()>4){
                students1.add(w);
            }
        }
        students.removeAll(students1);
        System.out.println(students);







    }
}
