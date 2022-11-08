package day26exceptions;

public class Exceptions01 {

    public static void main(String[] args) {
        String str="123"; // String 1 - 2 - 3 >> 123 degil
        convertStringToInteger(str);

        int result=convertStringToInteger(str);
        System.out.println(result+5); //Sayi olduysa 123+5=128 görürüz ve anlariz ki method calismis ve Integer'a cevirmis.

        String st="1a2b";
        Integer r=convertStringToInteger(st);//NumberFormatException : Eger icinde rakamdan farkli character barindiriran bir Stringi
                                             //                        valueof() kullanarak Integer'a cevirmek isterseniz NumberFormatException alirsiniz.

        System.out.println(r+10);//"st" icerisinde rakam ve rakam olmayan karakterler birlikte verildigi icin excepion atar.

    }

    public static int convertStringToInteger(String str){

        int i=0;

        try{
            //Herhangi bir satirda "Exception" atilirsa Java direk "catch" kismina gecer try icindeki diger kodlari calistirmaz.
            i= Integer.valueOf(str);
            System.out.println("Burasi try bolumu");

        }catch (NumberFormatException e){

            System.out.println("Rakam olmayan karakter iceren String'ler Integer'a cevirilemez");

        }
        return i;

    }

}
