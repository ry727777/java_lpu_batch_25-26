class Student2123{
    Student2123(){
        // this(20,20);
        this(10);
        System.out.println("Default constructor is called");
    }

    Student2123(int a){
        this(); 
        System.out.println("parameter constructor called with 1 arg.");
    }

    Student2123(int a, int b){
        // this(10);
         System.out.println("parameter constructor called with 2 arg.");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Student2123 obj = new Student2123();
    }
}
