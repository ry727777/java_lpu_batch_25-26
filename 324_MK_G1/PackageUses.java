import packages.MathsArth.MathsArith;
import packages.MathsArth.MathsComp;

public class PackageUses {
 public static void main(String[] args) {
    MathsArith obj = new MathsArith();
    int result = obj.sum(10,20,30,40);
    System.out.println(result);
    int result2 = obj.multiply(10,20,30,40);

    MathsComp obj2 = new MathsComp();
    int min_value = obj2.min(10,20);
    System.out.println(min_value);
    int ans = obj2.max(10,20);
    System.out.println(ans);
 }   
}
