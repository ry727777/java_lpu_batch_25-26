import java.util.Scanner;

class Base{
    Base(){
        this(2);
        // this(2,3);
        System.out.println("Calling Default const.");
    }

    Base(int a){
        this();
        System.out.println("Calling para with one para");
    }

    Base(int a, int b){
        // this(30);
        System.out.println("Calling para with two para");
    }
}

public class ConstruChain {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        Base obj = new Base();
    }
}
