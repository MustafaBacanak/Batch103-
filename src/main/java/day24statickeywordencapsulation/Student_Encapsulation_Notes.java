package day24statickeywordencapsulation;

    //Encapsulation: "Date Hidding(Gizlemek)" demektir.

    //Data'yi neden gizlersiniz ? Data'yi dis etkenlerden korumak icin

    //Data'yi nasil gizlersin ? Access Modifier'ini "private" yaparak gizleriz.

    //Data'yi gizledikten sonra baska Class'lardan okumak istersen ne yaparsin?
    //"get method'lar (getter)" olusturarak gizledigimiz datalari okunur hale getirebiliriz.

    //Data'yi gizledikten sonra baska Class'lardan degistirmek istersen ne yaparsin?
    //"set method'lar (setter)" olusturarak gizledigimiz datalari degistirilir hale getirebiliriz.

    //Variable'in "data type"i ile get method()'un return type'i ayni olmalidir.

    //"get method"lar isimlendirilirken basa "get" yazilir sonra variable ismi yazilir.boolean'larda basa "is" yazilir.

public class Student_Encapsulation_Notes {

    public  String stdName = "Tom Hanks";
    private String stdId = "TH190706";
    private double gpa =3.8;
    private boolean retired = false;

    public  String getStdName() {
        return stdName;
    }


    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;
    }

    //===========================//

//    public void setStdId(String stdId) {
//        this.stdId = stdId;
//    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }

    public void setStdId(String mb123) {
    }
}
