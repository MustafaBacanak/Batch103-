package day22inheritancepolimorfizm;

public class CatRunner {

    /*
        1)Javada object olustururken Consturactur'lar Parent'dan Child'a dogru olusturulur.
        2)Java en ust parents consturactur'a cıkabilmek icin "super()" kodunu kullanir.
        3)"super()" kodu her consturactur'un ilk satirinda gizli olarak bulunur.
        4)"super()" kodunu isterseniz gorunur sekildede yazabilirsiniz.
        5)"super()" kodunu gorunur sekilde yazarsaniz sakin haa ilk satir disinda bir satira koymayiniz, hata verir.
        6)"super()" kodu parent classdan consturactur cagirmaya yarar.
     */


    public static void main(String[] args) {

        Cat cat1=new Cat();
        System.out.println(cat1);
    }
}
