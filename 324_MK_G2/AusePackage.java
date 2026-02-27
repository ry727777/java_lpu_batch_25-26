import packages.mathsarith.*;

public class AusePackage {
    public static void main(String[] args) {
        MathsArithm obj = new MathsArithm();
        int value = obj.sum(2,3,4,5,6,7);
        int value2 = obj.sum(2,3,4,5);
        System.out.println(value);
        System.out.println(value2);

        int value3 = obj.multiply(2,3,4);
        System.out.println(value3);

        CompareClass obj2 = new CompareClass();
    }
}
