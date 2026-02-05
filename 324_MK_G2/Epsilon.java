public class Epsilon {
    public static void main(String[] args) {
        // Integer a = 200;
        // Integer b = 200;

        // if(a.equals(b)){
        //     System.out.println("Equal");
        // }else{
        //     System.out.println("Not Equal");
        // }
 
        double d = 0.1 + 0.2;
        double t = 0.3;

        // if d and t are same it then d-t will be zero
        System.out.println(d-t);
        double Epsilon = 1e-9;

        // if diff is less than 10^-9 then say equal
        if(Math.abs(d-t) < Epsilon){
            System.out.println("Floating value equal");
        }else{
            System.out.println("Floating vlaue not equal");
        }
    }
}
