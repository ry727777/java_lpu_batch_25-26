class VarA{
    // this vargArgs will be from right side
    public static int sum(int x, int y, int... arr){
        int to = 0;
        for(int ele : arr){
            to += ele;
        }
        return to;
    }
}

public class VarArgs {
    public static void main(String[] args) {
        int result = VarA.sum(2,3);
        int result2 = VarA.sum(2,3,4);
        int result3 = VarA.sum(2,3,4,5,6);
        int result4 = VarA.sum(2,3,4,5,6,8,9,10);
        System.out.println("Result1 : " + result);
        System.out.println("Result2 : " + result2);
        System.out.println("Result3 : " + result3);
        System.out.println("Result4 : " + result4);
    }
}
