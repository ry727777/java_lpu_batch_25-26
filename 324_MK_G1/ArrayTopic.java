import java.util.Scanner;

public class ArrayTopic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array ");
        int n = sc.nextInt();
        int[] arr; // Array declaration
        arr = new int[n]; // memory allocation
        
        // Take input in array
        System.out.println("take input in array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // to print array
        // System.out.println("Print array");
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        //     if(arr[i] == 40){
        //         arr[i] = 50;
        //     }
        // }

       
        // for each loop -> only read the array u can't update array using for each 
        // for(int ele : arr){
        //     System.out.print(ele + " ");
        //     if(ele == 40){
        //         ele = 50;
        //     }
        // }

        //  System.out.println();

        //  for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }

        // 2nd largest elemen in the array 
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int ele : arr){
            if(ele > max1){
                max2 = max1;
                max1 = ele;
            }else if(ele > max2 && ele  != max1){
                max2 = ele;
            }
        }
        System.out.println("2nd Largest : " + max2);

        // reverse the array 
        System.out.println("Reverse the array: ");
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
}
