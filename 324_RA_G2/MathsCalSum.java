import pacakages.MathsArith.MathsArith;
import pacakages.MathsArith.MathsComp;

public class MathsCalSum {
    public static void main(String[] args) {
        MathsArith obj = new MathsArith();
        int result = obj.sum(2,3,4,5,6,7,8);
        int result2 = obj.multiply(10,20,30,40);
        System.out.println(result);
        System.out.println(result2);

        MathsComp obj2 = new MathsComp();
        System.out.println(obj2.isGreater(15, 10));
        System.out.println(obj2.min(10, 20));
        System.out.println(obj2.max(10, 20));
    }
}
