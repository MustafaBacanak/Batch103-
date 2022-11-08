package day01variables;

public class Variables01 {

            //Variable nasil olusturulur ?

    // 1)Access Modifer    2)DAta Type   3) Variable ismi   4) =   5)Değer  6) ;

    // Java'da ";" ingilizcede ki "." gibidir.
    // Ingilizce'de cümle deriz. Java'da "statement" deriz.

    // "=" sembolü " Assigment Operator " olarak adlandırılır
    // " Assigment(Atama) Operator " sagdaki degeri alır soldaki variable'in icine koyar

    public int age = 13;
    public int height = 183;

                                //Java'da Data Type'lari
    /*
                                Primitive Date Types
        1)int: Integer'in kısaltmasıdır. Integer tam sayi demektir. 32 bit kullanir
               Matematik'de tam sayilarin basi ve sonu yoktur fakat Java'da tam sayilarin basi ve sonu vardir
               En kucuk int = -2,147,483,648
               En buyuk int =  2,147,483,647

        2)byte : Tamsayilar icin kullanilir. 8 bit kullanilir.
                 En kücük byte = -128
                 En buyuk byte =  127

        3)short: Tamsayilar icin. 16 bit kullanir
                 En kucuk short = -32768
                 En buyuk short =   32767

        4)long : Tamsayilar icin. 64 bit kullanir
                 En kucuk long = -9,223,372,036,854,755,888
                 En buyuk long =  9,223,372,036,854,755,887

        5)float : Ondalikli sayilar icindir. 32 bit kullanir
                  " float "  virgülden sonra 7 basamak icerebilir
                  " float " degerlerinde sona "f" veya "F" koymaniz gerekir

        6)double: Ondalikli sayilar icindir . 64 bit kullanir
                  " double " virgülden sonra 16 basamak icerebilir

        7)boolean: "true" veya "false" degerleri icin kullanilir. 1 bit kullanir

        8)char : Tek karakterler icin kullanilir. 16 bit kullanir
                 A, C, 2, ?, _, =
                 Note: "char" lara deger verirken,degeri tek tirnak icerisine almaniz gerekir. Yoksa hata verir

                 Note: Java buyuk ve kucuk harflere duyarlidir.
                       Java icin TRUE ile true tamamen farklidir

                 Note: Numeric Data Types: byte < short < int < long < float < double
                       Numeric Olmayan Data Types: booleon - char

                                Non-Primitive Data Types
      String: Isim, adres, kimlik numarasi gibi bir veya birden fazla karakter iceren degerlerle kullanilir.
              String degerleri mutlaka cift tirnak arasina konulmalidir
              String non-primitive dir. Yani bir String olusturdugunuzda Java size bir suru method verir.

              Primitive ile Non-Pimitivelerin farki nedir ?
              1) Non-Primitive data typle'larinda degerin yaninda methodlar vardir
                 Primitive data type'larinda ise sadece deger vardir,method yoktur.
              2) Primitive data typle'leri Java tarafindan olusturulur toplam 8 tanedir. Biz primitive data oluşturamayız
                 Non-Primitive data typle'ları Java tarafından oluşturulabilir,biz de oluşturabiliriz.
                 Non-Primiitive sayilamayacak kadar coktur,cunku her Developer non-primitive data olusturabilir.
              3) Primitive data typl isimleri kucuk harfle baslar. Non - Primitivler buyuk harfle baslar
              4) Primitive data type'lar memoryde farklı buyukluklerde yer kaplar.
                 Non-Primitiveler hepsi memoryde aynı buyuklukte yer kaplar.
     */
    public byte price = 12;
    public short populationOfVillage = 23000;

    public float priceOfShirt = 13.99f;
    public double weightOfSell = 0.00045;

    //Siz "long" demenize ragmen Java verilen sayiyi "int" kabul eder.
    //Bu yuzden long bir variable'a "int" araliginin disinda bir sayi verirseniz sonuna mutlaka "l" ya da "L" koyunuz
    public long populationOfWorld = 999939999999L;

    //Burada "L" koymadığımız halde problem yok cunku 1234 int araligina uyar.
    public long x = 1234;

    public boolean isOld = true;
    public boolean isRich = false;

    public char initial = 'M';

    public String name = "Tom Hanks";

    //Note: "main method" arabanin motoru gibidir.
    //      "main method" çalismadan hicbirsey calismaz
    public static void main(String[] args) {

    }



}