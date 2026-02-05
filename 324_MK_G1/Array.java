import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        // Declaration + initialization
        int[] arr = {10,23,45,67};
        System.out.println(arr.length);

        int[] arr2 = new int[5];
        arr2[0] = 40;
        System.out.println(arr2[3]);

        // Make a array of length from user 
        // 1. 2nd largest element
        // 2. count even and odd
        // 3. Reverse the array
        // 2 - D array (Can take example of student marks (column -> subject) ad row (Student roll number))
        // question-> matrix diagonal sum

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        

    }
}
