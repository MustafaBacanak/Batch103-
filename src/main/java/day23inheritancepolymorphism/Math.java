package day23inheritancepolymorphism;

public class Math extends Courses {

    public void practice() {
        System.out.println("Solve questions");
    }
    public Math(){
        super("Second");
        System.out.println("Consturactor 1");
    }
    public Math(int a){
        this(); //Ayni class icinde diger Consturactor'i kullan.
        System.out.println("Consturactor 2");
    }
}

