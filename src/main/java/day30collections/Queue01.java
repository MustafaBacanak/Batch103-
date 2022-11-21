package day30collections;

import java.util.LinkedList;
import java.util.Queue;

public class    Queue01 {

    /*
        Ilk giren elemani ilk kullanmaniz(First in - First Out ==> FIFO) gerektiginde "Queue" en iyi secenektir.
        Queue da elemanlar "insertion order" a gore dizilirler.
        Queue da peek(),poll(),elements() gibi ilk elemanani ilgilendiren bir cok method vardir.
        offfer() methodu kapasite metodu kontrolü yapildiktan sonra eleman ekleme durumlarinda kullanilir.
     */

    public static void main(String[] args) {

        Queue<String> wareHouse =new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");

        System.out.println(wareHouse);//[Milk, Meat, Bread, Honey, Tomatoes]

        /*
            Kapasiteye bakar kapasite müsaitse ekleme yapar.Değilse Exception atar.
            Boolean döndürür > False - True
            -> ClassCastException - NullPointerException - IllegalArgumentException
         */

        wareHouse.offer("Potatoes");
        System.out.println(wareHouse);//[Milk, Meat, Bread, Honey, Tomatoes, Potatoes]



    }
}
