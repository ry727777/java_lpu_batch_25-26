public class Person {
    private String name;
    private int age;
    Person() {}
     Person(String name, int age){
        this.name = name;
        this.age = age;
        // name = t;
        // age = a;
    }

    int getAge(){
        return age;
    }

    void stAge(int age){
        if(age <= 0){
            throw new RuntimeException("Age can't be negative");
        }
        this.age = age;
    }

    String getName(){
        return this.name;
    }

    void setName(){
        this.name = name;
    }
}
