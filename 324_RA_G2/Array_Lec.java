import java.util.Scanner;

public class Array_Lec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        // make array
        int[] marks = new int[n];
        for(int i=0; i<n; i++){
            marks[i] = sc.nextInt();
        }

        // int sum=0;
        // for(int i=0; i<marks.length; i++){
        //     if(marks[i] == 30){
        //         marks[i] = 45; 
        //     }
        //     // sum += marks[i];
        // }

        // for(int ele:marks){
        //     System.out.print(ele + " ");
        // }
 
        // double avg_marks = (double)sum/n;
        // System.out.println("Avg marks : " + avg_ma);

        int eve_sum = 0;
        int odd_sum = 0;
        for(int ele:marks){
            if(ele % 2 == 0){
                eve_sum += ele;
            }else{
                odd_sum += ele;
            }
        }

        System.out.println("Even Sum : " + eve_sum);
        System.out.println("Odd Sum : " + odd_sum);

    }
}
