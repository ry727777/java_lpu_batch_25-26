class InitBlock{
    int age;
    String name;
    static String uni_name;
    {  // non static initialize block
        age = 20;
        name = "abcde";
        System.out.println("Initializer block executed first " + name + " " + age);
    } 
    static {
        // static initialzer block
        uni_name = "LPU";
        System.out.println("Static initializer blok called " + uni_name );
    }
    InitBlock() {}
    InitBlock(int age, String name){
        System.out.println("Constructor called");
        this.age = age;
        this.name = name;
    }
}

public class InitializeBlock {
    public static void main(String[] args) {
        // InitBlock obj = new InitBlock(45, "rtyu");
        // System.out.println(obj.age + " " + obj.name);

        InitBlock obj1 = new InitBlock();
        InitBlock obj2 = new InitBlock();
    }
}
