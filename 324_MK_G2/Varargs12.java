public class Varargs12{
    static int sum(int x,int... number){
        int sum = 0;
        for(int ele : number){
            sum += ele;
        }
        return sum;
    }
    public static void main(String[] args) {
        int ans = sum(2,3);
        System.out.println(ans);
        ans = sum(2,3,4);
        ans = sum(2,3,4,5);
    }
}