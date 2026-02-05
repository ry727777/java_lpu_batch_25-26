public class Epsilon {
    public static void main(String[] args) {
        double d = 0.1 + 0.2;
        double t = 0.3;
        double Epsilon =1e-9;
        // System.out.println(d-t);
        if(Math.abs(d-t) < Epsilon){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }
}
