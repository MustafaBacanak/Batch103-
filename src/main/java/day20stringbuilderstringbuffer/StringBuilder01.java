package day20stringbuilderstringbuffer;

public class StringBuilder01 {

    /*
        1)StringBuilder Java'da bir Class'dir.

        2)StringBuilder String olusturmaya yarar.

        3)"String" Class varken neden StringBuilder'a ihtiyac duyariz?
          Cunku "String" Class "Immutable Class"dir,ama biz bazen "Mutable" String'lere itiyac duyariz.
          StrinBuilder bize "Mutable" String verir.

        4)"Immutable Class"larda var olan bir deger degistirilemez. Siz var olan bir degeri degistirmek istediginizde
          i)Memory'de yeni bir variable yeni bir degerle olusturulur.
          ii)Eski variable'in pointer'i yeni variable'a dondurulur.
          iii)Bir variable'i hicbir pointer gostermiyorsa o variable silinir.(Garbage Collector)

          "Mutable Class" larda var olan deger degistirilebilir. Orjinal deger korunmaz.

        5) "String Class"larin "immutable" yapisi security icin onemlidir.
           Ayni degere sahip birden fazla String oldugunda,Java bir tane container olusturur ve ayni degere sahip
           Stringlerin bu container'i kullanmasini temin eder. Bu memoryi korumak icin iyidir ancak
           container'daki bir variable'in icini degistirdigimizde tum variable'larin etkilenme, tehlikesi vardir.
           Bu tehlikeden kurtulmak icin Java Stringleri "Immutable(degismez)" yapmistir.Fakat herhangi bir variable'in
           degerini degistirmek icin Java bir yol bulmustur.Degistirmek istediginiz variable icin yeni bir container olusturur
           ve variable'in pointer'ini bu yeni variable'a yönlendirir. Boylelikle hem degisim saglanmis hemde digerleri etkilenmemis olur.
     */

    public static void main(String[] args) {

        String str ="Java";
        str="Super Java";
        System.out.println(str);// Java => Stringler atama yapılmadigi icin degismez.

        //StringBuilder nasil olusturulur ?

        //1.Yol:
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1);

        //2.Yol:
        StringBuilder strb2 = new StringBuilder();
            //Yol a:
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append("!!!");
        System.out.println(strb2);
            //Yol b:
        strb2.append(" learn").append(" Java earn").append(" MONEY");
        System.out.println(strb2);

        //Stringbuilder'larda character sayisi nasil bulunur?

        StringBuilder strb3=new StringBuilder();
        strb3.append("Cat");
        strb3.append("xxxxxxxxxxxxxxx");
        int numOfChar=strb3.length();
        System.out.println(numOfChar);//18

        //capacity asimlarinda capacity var olanin iki katinin iki fazasina cikar. ==>2x+2
        int capacity=strb3.capacity();

        System.out.println(capacity);//18+16 => 34

        //set.charAt(2,'r') > Index 2 deki characteri 'r' ye cevirir.
        strb3.setCharAt(2,'r'); //Carxxxxxxxxxxxxxxx
        System.out.println(strb3);

        //delete(3,18) index 3 dahil,index 18 haric uzere arada ki tum characterleri siler. (subString gibi seçer)
        strb3.delete(3,18);
        System.out.println(strb3);//Car

        //delete.charAt(2) index 2 deki characteri siler.
        strb3.deleteCharAt(2);
        System.out.println(strb3);//Ca ==>2.index'deki r silindi.

        //reverse() methodu StringBuilder'i ters cevirir. > Ali --> ilA
        //"mutable" larda sadece method kullanmak orjinal degeri degistirmek icin yeterlidir.
        strb3.reverse();
        System.out.println(strb3);//aC ==> terse cevirdik.

        //"Immutable"larda orjinal degeri degistrmek icin methodu kullanmak yeterli olmaz. Birde atama yapmalisiniz.
        String abc= "Java";
        abc.replace("a","i");
        System.out.println(abc);//Java ==> atama yapilmazsa degismez,eski deger gorulur.

        abc= abc.replace("a","i");
        System.out.println(abc);//Jivi ==> atama yapilirsa yeni deger gorulur.


        // ** Datanizi degisime kapatmak icin Stringe gecebilirsiniz.
        // ** Stringde var olup StringBuilder'da olmayan methodlari kullanmak icin String'e gecebilirsiniz.

        //toString() methodu StringBuilder'lari Stringe cevirir.
        String stringstrb3=strb3.toString();
        System.out.println(stringstrb3);//aC ama String olarak.

        //Stringden de StringBuilder'a asagidaki gibi donebilirsiniz.
        StringBuilder strb4=new StringBuilder(stringstrb3);
        System.out.println(strb4);

        //insert(2,"XXXX"); 2.characterden sonra "XXXX"leri koyar
        strb4.insert(2,"XXXX");
        System.out.println(strb4);//aCXXXX

        //insert(2,"KLMNOPQR",5,8); ==> 2.characterden sonra,"KLMOPQRS" String'inin 5,6,7 deki characterleri yerlestirir
        strb4.insert(2,"KLMOPQRS",5,8);
        System.out.println(strb4);//aCQRSXXXX

        StringBuilder a = new StringBuilder("Java");
        StringBuilder b = new StringBuilder("Java");

        //compareTo() methodu i) Iki StringBuilderi karsilastirir ve sonucu "int" verir. Cunku alfabetik siraya koyar ve
        //                       aralarindaki farki size "int" olarak verir.
        //                   ii) StringBuilder'lar tamamiyla ayni ise 0 verir.
        //                  iii) "a" alfabetik sirada "b" den sonra gelirse pozitif olarak aradaki alfabetik siralama farkini verir.
        //                   iv) "a" alfabetik sirada "b" den once gelirse negatif olarak aradaki alfabetik siralama farkini verir.

        int sonuc = a.compareTo(b);
        System.out.println(sonuc);//0

        StringBuilder a1 = new StringBuilder("Java");
        StringBuilder b1 = new StringBuilder("Mava");

        int sonuc1 = a1.compareTo(b1);
        System.out.println(sonuc1);//-3=> J'den sayar(K-L-M)olarak J'dendaha sonra yer aldigi icin "-" deger verir.

    }
}
