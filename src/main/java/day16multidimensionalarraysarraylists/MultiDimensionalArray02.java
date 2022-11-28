package day16multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultiDimensionalArray02 {

    public static void main(String[] args) {

        //Bir multidimensional array deki en buyuk ve en kucuk elemanin toplamini veren kodu yaziniz
        int arr[][] = {{2, 5, 1}, {83, 75}};
        int maxElement = arr[0][0];
        int minElement = arr[0][0];

        for (int[] w : arr) {

            for (int k : w) {
                maxElement = Math.max(maxElement, k);
                minElement = Math.min(minElement, k);
            }

        }
        System.out.println(maxElement);//83
        System.out.println(minElement);//1

        System.out.println(maxElement + minElement);//84


        //Kaldirilacak elemanlar : Sigara,Alkol

        String arr1[] = {"Ali", "Kemal", "Turkmen", "Mustafa", "Fatma", "Ayşe", "Sigara", "Alkol", "Keyif"};
        String arr2 []=new String[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i].equals("Sigara") || arr1[i].equals("Alkol")){
                arr1[i] =arr1[i].replaceAll(arr1[i],"");
        }

    }


}
}