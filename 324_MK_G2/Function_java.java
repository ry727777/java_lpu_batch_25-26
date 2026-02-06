class Test{
    static int multipl_num(int a, int b){
        return a*b;
    }
}

public class Function_java {
    static void greet(){
        System.out.println("Hello World");
    }

    static void sum_num(int a, int b){
        System.out.println("Sum : " + (a + b));
    }
    public static void main(String args[]){
        // greet();
        int a = 90,b=100;
        sum_num(a, b);
        // make object of class Test
        // Test obj = new Test();
        // // call multpl_num using object
        // int result = obj.multipl_num(a,b);
        int result  = Test.multipl_num(a, b);
        System.out.println("Multiply of 2 num : " + result);

    }
}
