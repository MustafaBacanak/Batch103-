package day24statickeywordencapsulation;

public class CarRunner {

    public static void main(String[] args) {


        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();


        //           * * * INTERWIEW SORUSU * * *

        /*
            "static" keyword nedir?

       ***  static keyword classa baglanmıs class elemanlaridir.
       ***  static class elemanlari butun objelerin ortak elemanidir(Gokteki ay gibi)
       ***  staticler uzerinde yapilan her degisiklik butun obeleri etkiler, butun objeler tarafindan gorulur.

       ***  static class elemanlarina class uzerinden ulasilir. Objeler staticlere ulasmak icin kullanilmaz,
            - kullanimda hata vermez ama tavsiye edilmez.
         */


        System.out.println(car1.counter);//1  >> Obje uzerinden ulaşım tavsiye edilmez
        System.out.println(Car.counter);//1   >> Tavsiye edilen Class ismiyle kullanimidir.
        System.out.println(car1.price);//1

        System.out.println(Car.counter);//2
        System.out.println(car2.price);//1

        System.out.println(Car.counter);//3
        System.out.println(car3.price);//1

        System.out.println(Car.counter);//4
        System.out.println(car4.price);//1

    }
}
