public class Epsilon {
    public static void main(String[] args) {
        double d = 0.1 + 0.2;
        double c = 0.3;
        double Epsilon = 1e-9;  // Epsilon, if floating is bt this tange then u can say its equal
        if(Math.abs(d-c) < Epsilon){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }

    //    System.out.println("Diff " + (d-c));

    // Primitive
    int a = 200;
    int b = 200;
    if(a == b){
        System.out.println("Equal Integer");
    }else{
        System.out.println("Not Equal Integer");
    }

    // Wrapper classes
    Integer at = Integer.valueOf(200);
    Integer bt = 200;
    
     if(at.equals(bt)){
        System.out.println("Equal Integer");
    }else{
        System.out.println("Not Equal Integer");
    }

    }
}
