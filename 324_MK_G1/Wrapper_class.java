

class Wrapper_class {
    public static void main(String[] args) {
        int a = 20;
        Integer b = 30;
        System.out.println(a + b);
        

        // // autoboxing
        Integer cd = Integer.valueOf(a);
        // System.out.println(cd);

        // System.out.println(Integer.sum(20, 50));

        // // min int value
        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.MAX_VALUE);

        // System.out.println(Integer.min(30,23));

        // unboxing
        // Integer cd = 456; // also write cd = Integer.valueOf(456)
        // int  ab = cd.intValue();  // also write ab = cd;
        // System.out.print(ab);

        // Integer df = 30;
        // int fr = df.intValue();

        int min_value_int = Integer.MAX_VALUE;
        System.out.println(Integer.min(20,30));

        float f = Float.MIN_VALUE;
    }
}
