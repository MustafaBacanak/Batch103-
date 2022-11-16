package day25exception;

public class E01 {

    /*
    1)"Exception" (istisnai hata) Java'da kodlarımızı çalıştırırken meydana gelen beklenmedik durumlardır.
    2)"Exception"lar ile çalışmanın iki yolu vardır
        a) try-catch block kullanma ve exception oluşsa bile çalışmayı devam ettirme
        b) throw exception kullanarak çalışmayı durdurma (mesela yazdığımız kod gereği bir dosya üzerinden okuma yapmamız
        gerekiyor ise bu dosyamız eğer silinmiş ise Java dosyayı bulamaz ve uygulamanın devam etmesi gerekmez)
    3)Eğer Exception'ı handle etmez isek (sorunu halletmezsek) Java çalışmayı durdurur.
    4)try-catch kullanırken try kodunu bir yada birden fazla catch ile birlikte kullanabiliriz
    5)try catch olmaksızın yanlız kullanılamaz.
    6)Eğer yazmış olduğunuz herhangi bir kod satırında problem olabileceğini düşünüyorsanız try-catch block içine koymalısınız.
    7) catch block parantezi içerisine olması muhtemel exception class ismi yazılır.
    8)e.getmessage(), methodunu kullanarak teknik mesajlar elde edebiliriz.
      System.out.println(); burada yazmış olduğum mesajlar benim teknik olmayan açıklamalarımdır
      e.printStackTrace(); methodu Exception ile ilgili detaylıca teknik mesaj verir. kod çalışmaya devam eder
      System.err.ptinln(); hata mesajını renkli olarak verir bu sayede console'da diğer mesajlardan ayırmak için kullanabiliriz.
    9)Eğer try body içindeki kod sorunsuz çalışırsa catch block devreye girmez

 */

    //Bir kod yazilirken olasi exeptionlar ongorulup ona gore careler uretilmelidir.
    //1-)Eger exeption olustugunda kodun calismaya devam etmesini istemiyorsak method
    // isminin yanina bunu=olusabilecek exeptionu deklare edebiliriz.
    //2-)Eger kodun calismaya devam etmesini istiyorsak sorun olusturabilecek kodu try chatch blogunun icine alir
    // try bloguna sorun cikabilecek kodu catch bloguna olusabilecek exeption'i ve olasi exeption durumunda
    // Javanin ne yapmasini istedigimizi yazabiliriz.

    public static void main(String[] args) {
        divide(6, 2);//3
        divide(0, 2);//0
        divide(6, 0);// Matematiksel olarak mumkun olmadigi icin,Java hata fırlatır.(Exception)

        divide2(5, 0);

    }

    // 1.Yol ==> Exception bünyesinde tavsiye edilmez.

    public static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Bir sayi 0 ile bolunemez");
        } else
            System.out.println(a / b);
    }

    //2.Yol Try-catch kullanaran exception'ı handle etmek tavsiye edilir.
    //Java mat ile ilgili muhtemel tum istisnalari hatalari "Arithmetic Exception " class'ina koymustur.
    //Matematikteki tüm istisnalari ve detaylari bilmek zorunda degiliz.Bunu "Exception" ile halledip geçeriz.

    public static void divide2(int a, int b) {

        try {
            System.out.println(a / b);
            System.out.println("hi exception");
            System.out.println("bye exception");

        } catch (ArithmeticException e) {
            System.out.println("Bolme isleminde bir problem olustuuuu==>"+e.getMessage() );
            e.printStackTrace();
            System.err.println("Bolme isleminde bir problem olustu knk"); // terminale notu kırmızı yazar

        }
    }

}
