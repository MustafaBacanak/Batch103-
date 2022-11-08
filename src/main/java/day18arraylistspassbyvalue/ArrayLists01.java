package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        //Ex 1 : Bir Integer Arraylistteki 7 hariç tum elemanlari 2 artiriniz.

        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(22);
        ages.add(7);
        ages.add(17);
        ages.add(78);

        for (Integer w : ages) {
            if (w == 7) {
                continue;
            }
            ages.set(ages.indexOf(w), w + 2);
        }
        System.out.println(ages);

        //Ex 2 : Size verilen ArrayList'te 8 ve 8 den önceki tüm elemanlari 2 katina cikariniz.

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(22);
        nums.add(7);
        nums.add(8);
        nums.add(78);

        for (Integer w : nums) {
            nums.set(nums.indexOf(w), w * 2);
            if (w == 8) {
                break;
            }
        }
        System.out.println(nums);


    }
}
