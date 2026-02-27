package packages.mathsarith; 

public class MathsArithm {
    public int sum(int... arr){
        int sum = 0;
        for(int ele : arr){
            sum += ele;
        }
        return sum;
    }

     public int multiply(int... arr){
        int multi = 1;
        for(int ele : arr){
            multi *= ele;
        }
        return multi;
    }
}
