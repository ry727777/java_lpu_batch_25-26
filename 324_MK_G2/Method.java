class Methods2{
    public int sum(int a, int b){
        return a + b;
    }

    private int multiply(int a, int b){
        return a*b;
    }

    public static void printArray(int[] arr){
        // for(int ele : arr){
        //     System.out.print(ele + " ");
        // }
        // System.out.println();

        // update the array
        arr[0] = 100;
        arr[1] = 102;
    }
}


public class Method {

    public static void Greeting(){
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        // Method p  = new Method();
        Greeting();
        // create object of Methods
        Methods2 p1 = new Methods2();
        int result = p1.sum(20,30 );
        System.out.println("Sum : " + result);

        int[] arr = {23,45,66,78,89};
        // Can call using class name because printArray() -> static

        // call the function and update the ele there
        Methods2.printArray(arr);

        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
}
