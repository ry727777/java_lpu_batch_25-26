
public class Person {
    
    private int age;
    private String name;
    Person(){}
    Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    void setAge(int age){
        if(this.age <= 0){
            throw new RuntimeException("Age can't be Neagtive");
        }
        this.age = age;
    }

    int getAge(){
        return age;
    }
}
