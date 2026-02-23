class Person{
    int age;
    String name;
    {
        // initializer block
        age = 10;
        name = "abcd";
        System.out.println("Initializer block called");
    }
    static {
        // static initializer block
        System.out.println("Static Initiazer block called");
    }
    Person(){
        System.out.println("Constructor called");
    }
    Person(int age, String name){
        this.age = age;
        this.name = name;
        System.out.println("Paramet constructore called");
    }
    void setAge(int age){
        if(age <= 0) throw new RuntimeException("Age can't be Negative");
        this.age = age;
    }
    int getAge(){
        return this.age;
    }
}

public class Encapsu {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person(20, "namert");
        // System.out.println(p1.age + " " + p1.name);
        // Person obj = new Person();
        // System.out.println(obj.age+ " " + obj.name);
        // Person obj2 = new Person(27, "Rahul");
        // obj2 = new Person(23, "abcder");
        // System.out.println(obj2.age+ " " + obj2.name);
        // obj.age = -19;

        // Person obj = new Person();
        // obj.setAge(-19);
        // System.out.println(obj.getAge());

        // boolean ans = true;


        // while(ans){
           
        //     ans = false;
        // }
        // System.out.print("Hello");

    }   
}
