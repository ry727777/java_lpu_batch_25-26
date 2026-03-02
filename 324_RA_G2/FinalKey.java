class FinalClass{
    final String name;
    final int age;
    FinalClass(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display_info(){
        System.out.println("Name: "+ name +" age "+age);
    }
}

public class FinalKey {

   public static void main(String[] args) {
    FinalClass obj = new FinalClass("ABCD", 27);
    obj = new FinalClass("XYZ", 30);
     obj.display_info();
    obj.name = "XYZ";
    obj.age = 22;
    obj.display_info();

    //  final int x = 20;
    //   x++;
    //   System.out.println(x);
   }
}
