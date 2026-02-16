class IniBlock{
    int age;
    String name;
    static String section;
    {
        age = 20;
        name = "abcde";
        System.out.println("Innitializer called");
    }
    static {
        System.out.println("Static initial block called");
        section = "324 RA";
    }
    // IniBlock(){
    //     System.out.println("Constructor called");
    //     age = 27;
    //     name = "bhgtd";
    // }
}

public class InitializerBlock {
    public static void main(String[] args) {
         IniBlock obj1 = new IniBlock();
         IniBlock obj2 = new IniBlock();
         IniBlock obj3 = new IniBlock();
        // System.out.println(obj1.age);
        // System.out.println(obj1.name);
    }
}
