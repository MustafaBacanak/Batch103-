package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {

    public static void main(String[] args) {

        //Note: Switchde sadece int,byte,short,char ve String data typeleri kullanilabilir.
        //Note: Eger 3 den fazla durum varsa switch() tercih ederim (- Süleyman Hoca)

        //Kullanicidan işlem ve iki tane sayi alarak işlemşn sonucunu ekrana yazdiran basit bir hesap makinası yapınız

        Scanner input = new Scanner(System.in);
        System.out.println("Islemi giriniz..");
        char islem = input.next().charAt(0);

        System.out.print("ilk sayiyi giriniz : ");
        double ilk = input.nextDouble();

        System.out.print("ikinci sayiyi giriniz : ");
        double ikinci = input.nextDouble();

        switch (islem){

            case '+':
                System.out.println((ilk + ikinci));
                break;
            case '-':
                System.out.println((ilk - ikinci));
                break;
            case '*':
                System.out.println((ilk * ikinci));
                break;
            case '/':
                System.out.println((ilk / ikinci));
                break;
            case '%':
                System.out.println((ilk * ikinci)/100);
                break;
            default:
                System.out.println("tanımsız işlem başka kapıya");

        }

    }
}
