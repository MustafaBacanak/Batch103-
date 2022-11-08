package day23inheritancepolymorphism;

public class Courses {

    public void liveSessions(){

        System.out.println("Courses are live");
    }
    public Courses(){
        System.out.println("Consturactor A");
    }
    public Courses(String s){
        System.out.println("Consturactor B");
    }

}
