package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {

        //Example 1: Bir Liste'deki elemanlarin birbirine en yakin olan ikisini bulunuz.
        //              {12,15,19,30,21} ==> 19 ve 21

        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(19);
        a.add(15);
        a.add(16);
        a.add(21);

        Collections.sort(a);//Listteki elemanlari kucukten buyuge dizmek icin "Collections" kullanilir.

        int minFark = Integer.MAX_VALUE;
        int x = 0;
        int y = 0;

        for (int i = 1; i < a.size(); i++) {
            minFark = Math.min(minFark, a.get(i) - a.get(i - 1));

            if (minFark == a.get(i) - a.get(i - 1)) {
                x = a.get(i);
                y = a.get(i - 1);

            }
        }
        System.out.println(x + " ve " + y);

    }
}
