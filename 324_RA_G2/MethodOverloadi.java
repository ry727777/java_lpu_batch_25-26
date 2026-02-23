public class MethodOverloadi {
    static void fun(int a){
        System.out.println("Hello");
    }
    static void fun(double a){
        System.out.println("World");
    }
public static void main(String[] args) {
    fun(10);
    // fun(10.0);
}
}
