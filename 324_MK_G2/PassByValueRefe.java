class Number{
    int a;
    int b;
}

class PassBy{
    public static void updateValue(int a, int b){
        a = 100;
        b = 200;
    }

    public static void updateObject(Number obj){
            obj.a = 100;
            obj.b = 200;
    }
}

public class PassByValueRefe {
    public static void main(String[] args) {
        // int a = 20, b = 40;
        // PassBy.updateValue(a, b);
        // System.out.println(a + " " + b);
        Number p = new Number();
        p.a = 20;
        p.b = 30;
        PassBy.updateObject(p);
        System.out.print(p.a + " " + p.b);
    }

}
