import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stud;
        System.out.print("Total student: ");
        stud = sc.nextInt();
        // deca 2D array
        double[][] student_marks;
        // allocate memory
        student_marks = new double[4][stud];

        // take marks
        for(int col=0; col<student_marks[0].length; col++){
            for(int row = 0; row<4; row++){
                student_marks[row][col] = sc.nextDouble();
            }
        }

        //print per %
        for(int col = 0; col<student_marks[0].length; col++){
            double total_marks= 0.0;
            for(int row = 0; row<4; row++){
                total_marks += student_marks[row][col];
            }
            double result = (total_marks*100.0)/400.0;
            System.out.println("S"+(col+1) +" % " + result);
        }

    }
}
