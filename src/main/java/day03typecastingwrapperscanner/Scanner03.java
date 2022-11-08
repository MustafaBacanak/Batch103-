package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("uzun kenar nedir ?");

        int boy = input.nextInt();

        System.out.println("kısa kenar nedir ?");

        int en =input.nextInt();

        System.out.println("Alan"+ en*boy);

        System.out.println( "Çevre" + 2*(en+boy));


    }
}
