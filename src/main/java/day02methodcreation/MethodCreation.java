package day02methodcreation;

public class MethodCreation {


    //Main method icerisinde kullanacaginiz her sey statik olmalidir.

    public static void main(String[] args) {

        System.out.println(toplamaYap(1.2,5));
        System.out.println(ucSayiyiCarp(2,1.5,6));
        System.out.println(aIleByiToplaCIleCarp(5,4,8));
        

    }

    //Example 1 : Toplama islemi yapan bir method olusturunuz.


    public static double toplamaYap(double a , double b){

        return a+b;
    }
    //Example 1 : Toplama islemi yapan bir method olusturunuz.

    public static double ucSayiyiCarp(double a, double b , double c) { return a*b*c;

    }

    //Example 3 : 3 sayida ilk ikisini toplayıp 3. ile carpan

    public static double aIleByiToplaCIleCarp(double a, double b, double c) {

        return (a+b) * c;


    }
}
