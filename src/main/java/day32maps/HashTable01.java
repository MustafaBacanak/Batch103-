package day32maps;

import java.util.Hashtable;

public class HashTable01 {

    /*
            1)HashTable bir map'dir.
            2)HashTable entrySet'leri herhangi bir sirlamaya tabi tutmaz.
            3)HasTable,HashMap'lerden daha yavaştır çünkü HasTable lar thread-safe (aynı andan birden fazla iş yapabilme becerisi)
              ve synhronize'dir(çoklu işlerin zaman kazandıracak şekilde sıralanabilmesidir.)
            4)HashTable'larda key null olamaz. Key'i null yaparsaniz NullPointerException atar.
            5)HashTable'larda value null olamaz. Value'yu null yaparsaniz NullPointerException atar.

            Note:toString() methodu objeleri consol'da detaylari ile gorebilmek icin class'larin icinde olusturulur.
                 toString() method'unu oluşturmadan object'i console'a yazdırırsanız Java o object'in adresini yazdırır.

            * Eğer thread - safe ve synchronized (aynı anda birdn fazla iş ve planlama) önemliyse HashTable,
            * Naturel order (Sıralama) önemliyse TreeMap ya da
            * Hız önemliyse HashMap kullanmalisiniz bunlar tek opsiyonunuzdur.
     */

    /*
                    INTERWIEW QUESTIONS
                  MAP'LER ARASINDAKI FARKLAR

    1) HashMap, TreeMap ve LinkedHashMap  synchronized ve thread-safe degildir.
    HashTable synchronized ve thread-safe dir.

    2) Treemap'ler natürel order yapar.
     LinkedHashMap giriş sırasına göre listeler.
     HashMap ve Hashtable sıralama yapmaz,rastgele sıralar.

    3) HashMap ve LinkedHashMap'lerde hem key hemde value için null değeri kullanılabilir.
     TreeMap'lerde key'ler icin "null" kullanılmaz.
     HashTable larda ikisi içinde null kullanılmaz.
     */

    public static void main(String[] args) {

        Hashtable<String, Integer> countryPopulations = new Hashtable<>();

        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 83000000);
        countryPopulations.put("Turkey", 90000000);
        System.out.println(countryPopulations);// {USA=400000000, Germany=83000000, Turkey=90000000}

//        countryPopulations.put(null, 90000000);// HashTable'larda key null olamaz. NullPointerException
//        countryPopulations.put("France", null);// HashTable'larda value null olamaz. NullPointerException

        Hashtable<String,Students> myStudents=new Hashtable<>();
        myStudents.put("Math",new Students("Mustafa","bacanak117@gmail.com",30,true));
        myStudents.put("Science",new Students("Bugra",30,false));
        System.out.println(myStudents);

        String name =myStudents.get("Math").name;
        System.out.println(name); // Mustafa

        int age =myStudents.get("Math").age;
        System.out.println(age); // 30
    }

}