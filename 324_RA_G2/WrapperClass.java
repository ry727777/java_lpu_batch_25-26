

class WrapperClass {
    public static void main(String[] args) {


        // Autoboxing -> primitive to wrapper class
        int a = 20;
        Integer it = Integer.valueOf(a);
        System.out.println(it);

        // Unboxing -> Wrapper class to primitive
        Integer cd = 40;
        int d = cd.intValue();
        System.out.println(d);

        // int a = 20;
        // System.out.println(a);
        // // a is not an object
        // // store in stack memory


        // Integer b = 30;
        // // Internally -> Integer.valueOf(30);
        // System.out.println(b);
        // // b is an object
        // // store in heap memory

        // System.out.println(Integer.min(20,30));
        // System.out.println(Integer.max(20,30));
        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.MAX_VALUE);
        
    }
}
