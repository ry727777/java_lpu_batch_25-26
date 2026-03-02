class Base{
    protected int age = 20;
    Base(){
        System.out.println("Base class constructor called.");
    }
    Base(int a, int b){
        System.out.println("Param constructor called.");
    }

    void greeting(){
        System.out.println("Hello world");
    }
}

class child extends Base{
    child(){
        super.greeting();
        System.out.println(super.age);
        System.out.println("Child class constructor called.");
    }
}

public class Inheritence {
 public static void main(String[] args) {
    child obj = new child();
 }   
}
