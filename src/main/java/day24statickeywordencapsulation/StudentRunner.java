package day24statickeywordencapsulation;

public class StudentRunner {

    public static void main(String[] args) {

        Student_Encapsulation_Notes std1 =new Student_Encapsulation_Notes();

        System.out.println(std1.getStdId());//TH190706
        System.out.println(std1.getGpa()); //3.8
        System.out.println(std1.isRetired()); //false

        std1.setStdId("MB123");
        System.out.println(std1.getStdId());// MB123

        std1.setGpa(4.0);
        System.out.println(std1.getGpa()); //4.0

        std1.setRetired(true);
        System.out.println(std1.isRetired()); //true



    }
}
