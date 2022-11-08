package day10stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        String a = "Java kolaydir";

        //startsWith("kola", 5) kodu ilk 5 karakter'den sonraki String'e bakar ve o String'in "kola" ile baslayip baslamadigini kontrol eder.
        //"kola" ile basliyorsa "true", baslamiyorsa "false" return eder.
        boolean b = a.startsWith("kola", 5);
        System.out.println(b);

        //replaceFirst("a", "*"); kod String deki ilk "a" yi "*" e cevirir.
        //replace("a", "*"); kod String deki tum "a" lari "*" e cevirir.
        String c = a.replaceFirst("a", "*");
        System.out.println(c);//J*va kolaydir.

        //concat() methodu iki tane Stringi birbirine yapistirmaya yarar.
        String d = a.concat(" Anladin mi?");
        System.out.println(d);

        String e = "   Tom Hanks   ";
        System.out.println(e); // "    Tom Hanks    "

        //trimm() methodu bir Stringin bas ve sonundaki "space" characterlerini siler,arada ki "space " characterlerine dokunmaz
        String f = a.trim();
        System.out.println(f);//"Tom Hanks "


        String h = "Java";
        String i = "Java";

        //compareTo () methodu iki tane Stringi albatetik(lexicographic) olarak karsilastirir
        //Buyuk harf kucuk harfe duyarlidir
        //Buyuk harf kucuk harfe duyarli olmasini istemezseniz compareToIgnorCase kullanabilirsnz
        //Bu kodda "h" nin alfabetik sırasindan i nin alfabetik sırasi çıkarılır
        int k = h.compareTo(i);
        System.out.println(k);

        //a.repeat(5) kodu a Stringini yan yana 5 kere tekrar etmeye yarar
        //repeat(0) empty String return eder
        //Java doch. ulasmak icin Windows kullanicilari ctrl e basili tut  mac için command e basili tutunuz

        String n = a.repeat(3);
        System.out.println(n);


    }
}
