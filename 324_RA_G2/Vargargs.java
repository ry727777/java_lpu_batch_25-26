class SumOfAll {
    static int sum(int x, int y, int... abcd){
        int total_sum = 0;
        for(int ele : abcd){
            total_sum += ele;
        }
        return total_sum;
    }

    static void fun(int a, int b){
        a = 100;
        b = 200;
    }

    static void update_arra(int[] arr){
        arr[0] = 100;
        arr[1] = 200;
    }
}

public class Vargargs {
     public static void main(String[] args) {
        int result = SumOfAll.sum(10,20);
        int result2 = SumOfAll.sum(10,20,30);
        int result3 = SumOfAll.sum(10,20,30,60,70);
        // System.out.println(result);
        // System.out.println(result2);
        // System.out.println(result3);
        // int a = 20, b = 30;
        // System.out.println(a+ " " +b);
        // SumOfAll.fun(a,b);
        // System.out.println(a+ " " +b);
        int[] abcd = {10,20,30,40};
        System.out.println(abcd[0] + " " + abcd[1]);
        SumOfAll.update_arra(abcd);
        System.out.println(abcd[0] + " " + abcd[1]);

    }

}
