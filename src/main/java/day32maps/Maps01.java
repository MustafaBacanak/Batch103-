package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps01 {

    public static void main(String[] args) {

        //Size verilen bir cumledeki her kelimenin kac kere kullanildigini gosteren kodu yaziniz.
        //"I like to move it, move it."  {move=2, like=1, I=1, to=1, it=2} > Map kullanıcaz

        String str = "I like to move it, move it.";
        str=str.replaceAll("\\p{Punct}","");
        System.out.println(str);
        String [] arr =str.split(" ");
        System.out.println(Arrays.toString(arr));

        HashMap<String,Integer> gorunum=new HashMap<>();

        for (String w : arr){
            Integer gorunumSayisi=gorunum.get(w);

            if (gorunumSayisi==null){
                gorunum.put(w,1);
            }else {
                gorunum.put(w,gorunumSayisi+1);
            }
        }
        System.out.println(gorunum);





    }
}
