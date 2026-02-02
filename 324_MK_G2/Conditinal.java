import java.util.Scanner;

class Conditinal{
    public static void main(String[] args) {
        // int marks;
        // Scanner obj = new Scanner(System.in);
        // marks = obj.nextInt();

        // // write logic for grade
        // if(marks >= 90){
        //     System.out.println("Grade A");
        // }else if(marks >= 80){
        //     System.out.print("Grade B");
        // }else if(marks >=65){
        //     System.out.println("Grade C");
        // }else{
        //     System.out.println("Fail");
        // }

        // // Ternary operator
        // String str = false ? "It's true" : "It's False";
        // System.out.println(str);

        Scanner sc = new Scanner(System.in);
        String device_name = sc.next();
        String status = sc.nextLine();
        sc.nextLine();
        int model_numb = sc.nextInt();
        System.out.println("Device Name: " + device_name);
        System.out.println("Status: " + status);
        System.out.println("Model Number: "+ model_numb);

    }
}