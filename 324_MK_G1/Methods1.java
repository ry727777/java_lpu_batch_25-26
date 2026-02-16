class Methods23{
   
   
   
   


    static double sum1(int... arr1, int... arr2){

    }
   
   
    static int sum(int a, int b, int... numbers, int c ){
        System.out.println("Sum all element: ");
       int sum = 0;
       for(int ele : numbers){
        sum += ele;
       }
        return sum;
    }

    // Method overloading
    // static int sum(int a, int b, int c){
    //     return a+ b+ c;
    // }
    // static int sum(int a, int b,int c, int d){
    //     return a+b+c+d;
    // }
}


public class Methods1{

    void Greeting(){
        System.out.println("Hello, Wotld!");
    }

    static void Greeting2(){
        System.out.println("Welcome!");
    }

    public static void main(String[] args) {
        Methods1 obj = new Methods1();
        // Integer.min(10,20);
        obj.Greeting();
        Greeting2();
        // Methods23 obj2 = new Methods23();
        int ans = Methods23.sum(10,20, 30, 40 ,60, 50);
        System.out.println(ans);

    }
}