import java.util.Scanner;

class Student_Per{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subject  = 4; // represent colum
        System.out.print("Number of student: ");
        int student = sc.nextInt(); // represtn number of row

        // decalre a 2D matrix
        double[][] student_marks = new double[student][subject];

        // Take marks
        for(int row=0; row<student; row++){
            System.out.println("Enter marks for student: " + (row+1));
            for(int col=0; col <subject; col++){
                student_marks[row][col] = sc.nextDouble();
            }
        }

        // Print the percentage
        for(int row=0; row<student; row++){
            double sum = 0.0;
            for(int col=0; col<subject; col++){
                sum += student_marks[row][col];
            }
            double per = (sum * 100.0)/400.0;
            System.out.println("Student "+(row+1)+": " + per+"%");
        }

        // using for each loop

        // for(int[] arr : student_marks){
        //     double sum = 0.0;
        //     for(int ele : arr){
        //         sum+=ele;
        //     }
        //     double per = (sum * 100.0)/400.0;
        //     System.out.println("Student: " + per+"%");
        // }

    }
    
}