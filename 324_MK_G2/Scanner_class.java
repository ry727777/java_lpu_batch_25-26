import java.util.Scanner;

class Scanner_class {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Take integer input " );
        int a = obj.nextInt();
        // Integer it = obj.nextInt();
        // System.out.println("Input value is : "+ it);
        System.out.print("Take long input " );
        long l = obj.nextLong();
        System.out.print("Take float input " );
        float f = obj.nextFloat();
        System.out.print("Take double input " );
        double d = obj.nextDouble();
        System.out.print("Take boolean input " );
        boolean b = obj.nextBoolean();

        // ***
        System.out.print("Take char input " );
        char ch = obj.next().charAt(0);

        System.out.println("Integer value is : " + a);
        System.out.println("Long value is : " + l);
        System.out.println("Float value is : " + f);
        System.out.println("Double value is : " + d);
        System.out.println("Boolean value is : " + b);
        System.out.println("Char value is : " + ch);



    }
}

