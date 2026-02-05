import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // make array of size n;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int evenSum = 0;
        int oddSum = 0;

        for(int ele:arr){
            if(ele %2 == 0){
                evenSum += ele;
            }else{
                oddSum += ele;
            }
        }

        System.out.println("Even Sum : " + evenSum);
        System.out.println("Odd Sum : "+ oddSum);
    }
}
