import java.util.Scanner;

public class Section_CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int section = 4;
        double[][] section_marks = new double[section][];
        // take number of student for each section
        for(int i=0; i<section; i++){
            System.out.print("Enter number of student for section: "+ (i+1) + " ");
            int num = sc.nextInt();
            // for ith row allocate num size memory
            section_marks[i] = new double[num];
        }
        // Enter CGPA
        for(int i=0; i<section_marks.length; i++){
            System.out.print("Enter CGPA for section: " + (i+1) + " ");
            for(int j=0; j<section_marks[i].length   ; j++){
                section_marks[i][j] = sc.nextDouble();
            }
        }

        // print avg cgpa
        for(int i=0; i<section_marks.length; i++){
            double total_cgpa = 0.0;
            for(int j=0; j<section_marks[i].length; j++){
                total_cgpa += section_marks[i][j];
            }
            double avg_cgpa = total_cgpa/section_marks[i].length;
            System.out.println("Avg CGPA of section: " + (i+1) +  " " + avg_cgpa);
        }
    }
    
}
