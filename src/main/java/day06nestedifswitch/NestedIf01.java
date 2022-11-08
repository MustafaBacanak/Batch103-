package day06nestedifswitch;

public class NestedIf01 {

    public static void main(String[] args) {

        /*
        Password'un ilk harfi buyuk harf ise
            'A' olursa gecerli password aksi halde gecersiz password.
        Password'un ilk harfi kucuk harf ise
            'z' olursa gecerli password aksi halde gecersiz password

            Note: Java "nested" kodlari calistirirken con zaman harcar,buna "Time Complexity" denir
                  Bu yuzden mumkunse "nested" kod yazmamaya calisiriz
         */

        //Nested (kırmızı if ici mavi if) : Ic ice gecmis demektir (zigon sehpa misali)

        String pwd = "Axy12!";

        char ilkHarf= pwd.charAt(0);

        if (ilkHarf>='A' && ilkHarf<='Z') {

            if (ilkHarf == 'A') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password");
            }

        } else if (ilkHarf>='a' && ilkHarf <='z'){

            if (ilkHarf == 'z') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password");
            }
        }else{
            System.out.println("Harf Alayim :)");

        }

    }

}

