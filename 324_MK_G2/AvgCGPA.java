import java.util.Scanner;

public class AvgCGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // row-> section name and column will represent total student in each section
        // 0 row -> sectiom MK
        // 1 row -> section RA
        double[][] sections = new double[4][];  // decal 2D to rep section
        sections[0] = new double[5];
        sections[1] = new double[6];
        sections[2] = new double[3];
        sections[3] = new double[4];

        // enter CGPA
        for(int i=0; i<4; i++){
            for(int j=0; j<sections[i].length; j++){
                double cgpa = sc.nextDouble();
                sections[i][j] = cgpa;
            }
        }

        // take average and print it
        for(int i=0; i<4; i++){
            double total_cpga = 0.0;
            for(int j=0; j<sections[i].length; j++){
                // adding cgpa section wise;
                total_cpga += sections[i][j];
            }
            // Avg CPGA section wise
            System.out.println("section " + (i+1) + ": " + (double)(total_cpga/sections[i].length));
            // sections[i].length -> no of student in each section(row)
        }


    }
}
