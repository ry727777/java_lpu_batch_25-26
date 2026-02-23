import java.util.Scanner;

public class CheckINTDOUBLE {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // if(sc.hasNextInt()){
        //     int n = sc.nextInt();
        // }
        // if(sc.hasNextDouble()){
        //     double d = sc.nextDouble();
        // }

        // Convert to int from String 
        Integer a =  Integer.valueOf("1234");
        Integer b = Integer.parseInt("1234");

        System.out.println(a + b);

        // Convert to String from int
        String c = String.valueOf(123456);
        
        // capacity
        StringBuilder tmp =new  StringBuilder();
        System.out.println(tmp.capacity());
        
    }
}
