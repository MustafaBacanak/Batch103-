package day22inheritancepolimorfizm;

public class HondaAccord extends Honda{

    /*
         1)Siz Class oluşturduğunuzda Java otomatik olarak size görünmez bir Constructor verir, çünkü
           Java Class'ın bir kalıp olduğunu ve Object oluşturmak için yaratıldığını ve Object oluşturmak için
           Constructor'ın şart olduğunu bilir.
         2)Java'nın otomatik olarak oluşturduğu bu görünmez Constructor'a "default constructor" denir.
         3)Siz kendiniz herhangi bir Constructor oluşturduğunuzda Java "default constructor" ı siler.
         4)Bir Class'da birden fazla Constructor olabilir.Fakat bu consturacturlarin parametreleri farkli olmalidir.
         5)"this" keyword "Bu Class" anlamindadir. "this.price" demek bu Class'daki "price" isimli variable demektir.
           "this.price" syntac'i constructor'larin icinde kullanilir.
         6)Constructor kullanarak variable'lar uzerinde yaptiginiz degisimler sadece Obect uzerindeki variable'larin
         degerlerini degistirir. Classdaki variable degerlerini degistiremez.
    */
    public int price;
    public int year;
    public String make;
    public String model;

    public HondaAccord(){

    }

    public HondaAccord(int price){
        this.price=price;
    }

    public HondaAccord(int price,int year){
        this.price=price;
        this.year=year;
        System.out.println("Honda Accord Constructor");

    }
    public HondaAccord(int price,int year,String make,String model){
        this.price=price;
        this.year=year;
        this.make=make;
        this.model=model;

    }

}
