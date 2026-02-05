import java.util.Scanner;

class Scanner_class{
    public static void main(String[] args) {

        // make object of Scanner
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // double d = sc.nextDouble();
        // long l = sc.nextLong();
        // byte b = sc.nextByte();
        // char ch = sc.next().charAt(0);
        // System.out.println(a);
        // System.out.println(d);
        // System.out.println(l);
        // System.out.println(b);

        // String input
        // String str = sc.next();
        // System.out.println(str);

        // space read -> nextLine();
        // String str = sc.nextLine();
        // System.out.println(str);

        int a = sc.nextInt();
        sc.nextLine(); // catch the '\n'
        String b = sc.nextLine();
        System.out.print(a + b);

        
         
        
    }
}