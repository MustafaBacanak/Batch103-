package day30collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {

    /*
        LinkedHashSet'ler elemanlari ekleme sirasina (Insertion Order) gore yerlestirilir.

        LinkedHashSet siralama yaptigi icin HashSet'lere gore yavas calisir.
     */
    public static void main(String[] args) {


    LinkedHashSet<String > emails=new LinkedHashSet<>();
    emails.add("b@gmail.com");
    emails.add("a@gmail.com");
    emails.add("m@gmail.com");
    emails.add("c@gmail.com");
    emails.add("n@gmail.com");

    System.out.println(emails);//[a@gmail.com, c@gmail.com, b@gmail.com, m@gmail.com, n@gmail.com]






    }
}
