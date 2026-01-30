import java.util.Scanner;;

public class string_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        // System.out.print("Input string value : ");
        // next will not read spaces.
        // String st = sc.next();
        // System.out.print("Name : " + st);

        // can use nextLine to read space
        int a = sc.nextInt();
        sc.nextLine(); // catch the buffer (enter/ return)
        String st = sc.nextLine();
        System.out.print("Name : " + st + a);

        
    }
}
