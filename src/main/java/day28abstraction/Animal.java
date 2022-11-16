package day28abstraction;

public abstract class Animal {

    //body'si olmayan methodlar "abstract method" olarak adlandirilir.
    //Bir methodu abstract yapmak icin 1)Metodu body'i sil  2)"abstract" keyword kullan
    //"abstract method" lar "abstract class" icinde olmalidir.
    public abstract void eat();

    //"abstract class"larda hem "abstract" method hem de "concrete"(abstract olmayan) method kullanilabilir.
    //"abstract" soyut , "concrete" somut.

    public void drink(){
        System.out.println("Animal drink...");
    }

    //abstract "move" method olusturunuz
    public abstract void move();


}
