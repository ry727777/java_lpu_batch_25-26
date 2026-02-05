import java.util.Scanner;

public class ArrayClass {
    public static void main(String[] args) {
        // Array Dclar + Initi
        // int[] marks = {20, 30, 40, 10, 30};
        // System.out.println(marks.length);
        // System.out.println(marks[3]);

        // take input at run time from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr length of array: ");
        int n;
        n = sc.nextInt();
        int[] marks = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter marks "+ (i+1) + " : ");
            marks[i] = sc.nextInt();
        }

        // Find avg marks of students;
        int sum = 0;
        for(int i=0; i<marks.length; i++){
            // accessing the marks using index 
            // sum += marks[i];
            if(marks[i] == 30){
                marks[i] = 50;
            }
        }

        // Using for each loop (Enhanced loop)
        // for(int ele:marks){
        //     if(ele == 30){
        //         ele = 50;
        //     }
        // }

        for(int ele:marks){
            System.out.print(ele + " ");
        }

        // double avg_marks = sum/n;
        // System.out.print("Average marks : "+ avg_marks);
    }
}
