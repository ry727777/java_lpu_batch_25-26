class Methods23{
   
   
   
   


    // static double sum1(int... arr1, int... arr2){

    // }
   
   
    // static int sum(int a, int b, int... numbers, int c ){
    //     System.out.println("Sum all element: ");
    //    int sum = 0;
    //    for(int ele : numbers){
    //     sum += ele;
    //    }
    //     return sum;
    // }

    // Method overloading
    // static int sum(int a, int b, int c){
    //     return a+ b+ c;
    // }
    // static int sum(int a, int b,int c, int d){
    //     return a+b+c+d;
    // }
}


public class Methods1{
    int age;
    String name;

    void show(int a){
        System.out.println("Hello, Wotld!" + age + name);
    }
    void show(String str){
        System.out.println("Hello, Wotld!" + age + name);
    }

    Methods1(){

    }

    void Greeting2(){
        System.out.println("Welcome!");
    }

    public static void main(String[] args) {
        Methods1 obj = new Methods1();
        obj.show(null);
        // Integer.min(10,20);
        // this.Greeting2();
        // obj.Greeting();
        // Greeting2();
        // Methods23 obj2 = new Methods23();
        // int ans = Methods23.sum(10,20, 30, 40 ,60, 50);
        // System.out.println(ans);

    }
}