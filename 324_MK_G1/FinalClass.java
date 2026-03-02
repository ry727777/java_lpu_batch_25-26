class Person{
    int age;
    String name;
    Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    void display_info(){
        System.out.println("Name: "+ name + " Age: " +age);
    }
}

public class FinalClass {
    public static void main(String[] args) {
        final Person obj = new Person(27, "Rahul");
        obj = new Person(22, "XYZ");
        
        obj.display_info();
        obj.name = "ABCDE";
        obj.age =20;
        obj.display_info();

    }
}
