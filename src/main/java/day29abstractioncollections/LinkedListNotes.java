package day29abstractioncollections;

public class LinkedListNotes {

    /*
        Collection: birden fazla datanın depolanması.
        Array ilkel bu yüzden collectionlara dahil değil.
        List'ler collection'lara dahil.

        Collection diyince bunlar aklınıza gelmeli:
        1)List  i)ArrayList ii)LinkedList
        2)Set
        3)Queue

    >List'lere çoklu ve tekrarlı data depolamak istediğimizde ihtiyaç duyarız, Ör:bir okuldaki öğrenci isimleri.
    >>Set'lere çoklu ama tekrarsız data depolamak istersek ihtiyaç duyarız, Ör: bir okuldaki öğrenci ID'leri.
    --Set ve List'i amacına göre kullanın.
    >>>Queue'lara FIFO(first in first out) veya LIFO(last in firts out) gerektiğinde Queue kullanılır, Ör: bankadaki günlük müşteriler.
 */

    /*
- Arraylist ler index kullanir. Ancak index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybetirir.
- Cunku bir cok elemanin re-index edilmesi gerekir. Java bu problemi LinkedList olusturarak cozmustur.
- LinkedListte ki her eleman iki bolumden olusur. Bu elemanlarin ilk bolumunde deger(data) olur, ikinci bolumunde ise pointer vardir.
- Iki bolumden olusan farkli bir yapi oldugu icin buna "Node" denilmektedir. Dolayisiyla LinkedList ler hakkinda konusurken List kelimesi
  yerine "Node" kelimesini kullanmak yerinde olacaktir.
- Bu yapinin en son elemaninin pointer kismi, kendisinden sonra eleman olmadigi icin "null" gosterir. Son elemana ise "Tail" denilmektedir.
- Her pointer bir elemani gostermeketdir. Ilk bastaki elemani gosteren yapiya "Head" denilir.
- LinkedList eleman ekleme ve eleman silmede cok basarilidir.
  Bu yuzden eleman ekleme ve eleman silme islemlerini cokca yapacaginiz durumlarda LinkedList kullanmalisiniz.

 */

    /*Class oluştururken ismine Sadece LİnkedList yazarsak java hata verir çünkü bu java'nın Class'ıdır.
 Arraylist:
 >index kullanır
    i)dezavantajı:
       bir elemanı silmek istediğinizde silinen elemandan sonraki tüm elemanlar için Reındex yapmanız gerekir.
       bir eleman eklemek istediğinizde eklenen elemandan sonraki tüm elemanlar için Reındex yapmanız gerekir.
    ii)avantajı:ındex kullanmak adres gibidir java direk adrese gider.
       --Search(Eleman bulma) işlemlerinde çok başarılıdır,
        Ör:sözlük yapacaksak ArrayList kullanmalıyız
 >>Bu dezavantajları gidermek için Java LinkedList oluşturmuş.
      LinkedList eleman ekleme ve çıkarma işlemlerinde başarılı.
      linked listte her Node iki bölümden oluşur:
      ilk bölüme data konulduğu için bunlara data bölümü derler.
      ikinci bölümler ise pointer bölümleri, tüm pointerler bir sonraki bölümü gösterir.
      vagon gibi bir yapı oluştu hepsi bir sonrakine(linked) bağlı.
      iki bölümden oluşan bu yapının ismi: Node.
      bu yapının en son Node'un pointer kısmı null gösterir.
      en son Node'un özel ismi: Tail.
      ilk Node'un ismi: Head, içinde sadece pointer kısmı var data kısmı yok.
      --Biz LinkedListte bir elemanı silince(elemanı silmek için elemanın sağ ve solundaki okları sileriz)
        Javanın çöp toplayıcısı garbage collector pointer ile işaret edilmeyen Node'u imha eder.
        Sonra Java silinen Node'un iki tarafını birbirine bağlamak için yeni bir pointer oluşturur.
      --Eleman ekleme: iki node arasındaki pointer'ı silip, eklemek istediğimiz Null'u diğer iki
        Node'a bağlayan iki yeni pointer oluştururuz.
      +Ne zaman çokça ekleme ve çıkarma yaparız Ör: müzeye giren çıkan insanlar.
      +Arraylist kullanınca çokça ekleme ve çıkarma yaptığımız zaman application donar,
       bu yüzden az gelişmemiş ülkelerin applicationları donar detayları düşünmeden application yazarlar.
    i) dezavantajı: ındex olmadığı için adres yok.Bir elemanı bulurken sırayla o elemana kadar olan tüm elemanlara
       senden sonrakı şu mu? diye sorar ve o elmanı bulana kadar eleman eleman ilerler.
       --Search(Eleman bulma) işlemlerinde başarısızdır.
        Ör:
 */
}



