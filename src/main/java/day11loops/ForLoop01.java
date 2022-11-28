package day11loops;

public class ForLoop01 {

    public static void main(String[] args) {

        //Example 1:  3 den 6 a kadar tamsayilarin toplamini bulan kodu yaziniz

        int sum = 0;
        for(int i=3;  i<7; i++){
            sum = sum + i;
        }
        //Note:  System.out.println(sum); loop'un disina yazilirsa "sum"in sadece son degerini ekrana yazdirir.
        //       System.out.println(sum); loop'un icine yazilirsa her bir loop icin "sum"in hangi degerleri aldigini yazdirir.
        System.out.println(sum);


        //Example 2: 6 den 3 a kadar tamsayilarin carpimini bulan kodu yaziniz

        int multiply = 1;

        for(int i=6; i>2; i--){
            multiply = multiply * i;
        }
        System.out.println(multiply);

        //Example 3: Size verilen bir tamsayinin rakamlari toplamini bulunuz

        int num = -385;

        num = Math.abs(num);

        int sum1 = 0;
        for(int i=num; i>0; i=i/10){

            sum1 = sum1 + i%10;
        }
        System.out.println(sum1);


        //Example 4: Size verilen bir String'i ters ceviren kodu yaziniz.
        //           "Kaba" ==> "abaK"

        String aa= "Kaba";

        //Concatenation yapacaksaniz "" kullanin

        String ters = "";

        for(int i=aa.length()-1; i>=0; i--){

            char ch = aa.charAt(i);

            ters = ters + ch;
        }

        System.out.println(ters);

        ///////

        String a ="mustafa";
        String b="";
        for ( int x = a.length()-1; x>=0 ; x--){
            char y = a.charAt(x);
            b=b+y;
        }
        System.out.println(b);

        //

        String f = " America ";

        for ( int x = 0  ;  x< f.length () ; x++) {
            char y = f.charAt(x);
            if (y == 'c' || y=='a'){
            continue;
            }
            System.out.print(y);
        }

        }

}