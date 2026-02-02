import java.util.Scanner;

class Scanner_class{
    public static void main(String[] args) {
        // make an onbject of Scanner class
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // Double d = sc.nextDouble();
        // float f = sc.nextFloat();
        // char ch = sc.next().charAt(0);
        

        // System.out.println(a + d + f + ch); // 20 + 20.0 +20.0 + 65 (ASCII value of A);
        // String str = sc.next(); // skip the space 

        // String str = sc.nextLine();
        // System.out.print(str);

        int a = sc.nextInt();
        sc.nextLine();  // store the \n i.e in buffer
        String str = sc.nextLine();

        System.out.print(a + str);
    }
}