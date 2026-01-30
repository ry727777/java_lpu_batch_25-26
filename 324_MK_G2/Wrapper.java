
class Wrapper {
    public static void main(String[] args){
        int a = 20;
        // Primitive type
        // a is not object and int is not a class
        // store in stack memory

        Integer b = Integer.valueOf(30);
        // b is object here
        // store in heap
        // Integer is a claa type
        // b have some methods

        System.out.println(a);
        System.out.println(b);

        // Mininum value of integer
        System.out.println(Integer.MIN_VALUE);

        // Compare 2 int
        System.out.println(Integer.min(10,20));

        // sum 2 int
        System.out.println(Integer.sum(20,40));


        // Autoboxing (primitive to Wrapper)
        int at =1000;
        Integer it = at; // Integer.valueOf(at)
        Integer it1 = Integer.valueOf(at);
        System.out.println(it + it1);


        // Unboxing (Wrapper to primitive)
        int unbox = it.intValue(); // it.intValue()

        System.out.print(unbox);
    }
}
