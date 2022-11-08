package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //Kullanicidan alinan sayinin tek mi çift mi oldugunu ekrana yazan bir kod yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi giriniz.. ");

        int s = input.nextInt();

        //1.yol
        if (s%2==0){
            System.out.println("çift sayi");
        }
            if(s%2!=0){
                System.out.println("tek sayi");
        }

            //2.yol
        if (s%2==0){
            System.out.println("çift sayi");

        }else{
            System.out.println("tek sayi");
        }

        //Example 2: Bir sayinin negatif pozitif veya nötr oldugunu syleyen kodu yaziniz.
        System.out.println("bir sayi giriniz");
        double d = input.nextDouble();

        if(d>0) {
            System.out.println("pozitif");
        }else if(d==0) {
            System.out.println("Nötr");
        }else{
            System.out.println("Negatif");
            }

        }

    }

