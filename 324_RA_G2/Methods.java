class Method2{
    static public void printHello(){
        System.out.println("Hello World");
    }

    static public int sum(int a, int b){
        return a + b;
    }

    static int sum_of_array(int[] arr){
        int total = 0;
        for(int ele : arr){
            total += ele;
        }
        return total;
    }
}

public class Methods {
    static void Greeting(){
        System.out.println("Welcome");
    }
    public static void main(String[] args) {
        // Methods m = new Methods();
        Greeting();
        // make object of Method2
        // Method2 p = new Method2();
        Method2.printHello();
        int result = Method2.sum(20,30);
        System.out.println(result);

        int[] arr = {20, 30, 40, 50};
        int sum_result = Method2.sum_of_array(arr);
        System.out.println("Sum of all element : " + sum_result);
    }
}
