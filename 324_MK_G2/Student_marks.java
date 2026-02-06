import java.util.Scanner;;

public class Student_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Students: ");
        int stud = sc.nextInt();

        // declare 2D array;
        int[][] student_marks = new int[5][stud];

        // Take marks of each student from user course code wise
        for(int i=0; i<student_marks.length; i++){
            for(int j=0; j<student_marks[0].length; j++){
                // take input of each student course wise
                int marks = sc.nextInt();
                student_marks[i][j] = marks;
            }
        }
        

        // calculate % of each student
        for(int col = 0; col < student_marks[0].length; col++){
            int total_marks = 0;
            for(int row = 0; row < student_marks.length; row++){
                total_marks += student_marks[row][col];
            }
            double perc = (double)((total_marks/500)*100);
            System.out.println("Percentage of student " + (col + 1) + " "+ perc);
        }

    }
}
