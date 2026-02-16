class Person{
    private int age;
    private String name;
    Person(){}
    Person(int age, String name){
        this.age = age;
        this.name = name;
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
        // Person obj = new Person();
        // System.out.println(obj.age+ " " + obj.name);
        // Person obj2 = new Person(27, "Rahul");
        // System.out.println(obj2.age+ " " + obj2.name);
        // obj.age = -19;

        Person obj = new Person();
        obj.setAge(-19);
        System.out.println(obj.getAge());
    }   
}
