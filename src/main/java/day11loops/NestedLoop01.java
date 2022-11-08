package day11loops;

public class NestedLoop01 {

    public static void main(String[] args) {

        /*
            Example 1:Asagidaki ciktiyi verecek kodu yaziniz

                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
         */

        for ( int a = 1; a<5  ; a++ ){
            System.out.println("Week :" + a);
            for ( int b = 1; b<8  ; b++ ){
                System.out.println("Day :" + b);
            }

        }
    }
}
