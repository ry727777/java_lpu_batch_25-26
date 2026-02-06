import java.util.Scanner;;

public class Menu_Calcu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu Calculator");
        int choice;
        do{
            System.out.println("Enter 1 for Addition.");
            System.out.println("Enter 2 for Subtraction.");
            System.out.println("Enter 3 for Multiplication.");
            System.out.println("Enter 4 for Divide.");
            System.out.println("Enter 5 to EXIT.");

            System.out.print("Choice : ");
            choice = sc.nextInt();
            System.out.print("Enter 2 Number ");
            int a=0,b=0;
            if(choice != 5){
                a = sc.nextInt();
                b = sc.nextInt();
            }
            
            switch (choice) {
                case 1:
                    System.out.println("Addition: " + (a + b));
                    break;
                case 2:
                    System.out.println("Substraction: " + (a-b));
                    break;
                case 3:
                    System.out.println("Multiplication: " + (a*b));
                    break;
                case 4:
                    System.out.println("Division: " + (a/b));
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            
        }while(choice != 5);
    }
}
