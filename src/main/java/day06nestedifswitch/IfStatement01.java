package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        //Kullanicidan yas degerini alan kodu yaziniz ve yasin hangi evre oldugunu asagıdaki tabloya göre ekrana yazdiriniz.
        //0 - 4 => baby
        //5 - 12 => child
        //13 - 20 => teenager
        //21 - 30 => adult
        //else (not expected age)
        //Tanimlanmamis evre

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");
        int yas = input.nextInt();

        if (yas<0){
            System.out.println("Gecerli yas giriniz");
        } else if (yas<5) {
            System.out.println("Bebek");
        } else if (yas<13) {
            System.out.println("Cocuk");
        } else if (yas<21) {
            System.out.println("Genc");
        } else if (yas<31) {
            System.out.println("Yetiskin");
        }else{
            System.out.println("Tanimlanmamis evre..");
        }
        // Boundary Valve Analyze Test (BVA): Sınır değeri analiz testidir.
        // Kritik değerleri,öncesini ve sonrasını test etme yönteminin ismidir.
    }
}


