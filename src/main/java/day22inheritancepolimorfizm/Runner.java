package day22inheritancepolimorfizm;

public class Runner {

    public static void main(String[] args) {

        //Inheritance'da variable'lar secilirken java objenin data tipine bakar.
        //Oncelikle istediginiz variable'i objenin data tipi olan classda arar.
        //O classda bulamazsa parent classlara bakar.
        //Hicbir parent classda bulamazsa hata verir.


        Cat cat1=new Cat();
        System.out.println(cat1.a);//14
        System.out.println(cat1.b);//34
        System.out.println(cat1.c);//45

        System.out.println();

        Mammal cat2=new Cat();
        System.out.println(cat2.a);//13

        System.out.println();

        Animal cat3=new Cat();
        System.out.println(cat3.a);//12

        System.out.println();

        //Object olusturulurken objectin data tipi child classlardan secilemezz.

        //Inheritance'da method'lar secilirken java costructor'a bakar.
        //Oncelikle istedginiz methodu Constructori kullanilan Classdan alir.
        //O classda bulamazsa parents classlara bakar.
        //Hicbir yerde o methodu bulamazsa hata verir.

        Cat cat4=new Cat();
        cat4.eat();//Cat eat
        cat4.drink();//Mammal drink > Kendi classında bulamadigi icin parent class'ından alir.

        System.out.println();

        Mammal cat5=new Mammal();
        cat5.eat();//Mammal eat

        System.out.println();

        Animal cat6=new Animal();
        cat6.eat();//Animal eat


    }
}
