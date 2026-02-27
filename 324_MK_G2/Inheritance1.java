class Base{
    String name;
    int age;
    Base(){
        System.out.println("Parent construct called");
        // this("ABCDE", 23);
    }
    Base(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Parent paramete const called");
    }
}

class Child extends Base{
    String name = "XYZ";
    Child(){
        // super();
        super("ABCD", 23);
        System.out.println("Child class called");
    }

    void display(){
        System.out.println("Name: " +  name + " Age: " + age);
    }
}


public class Inheritance1 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
