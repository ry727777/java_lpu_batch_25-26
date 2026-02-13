
public class Tester {
     
    public static void main(String[] args) {
        Person p = new Person(27, "abcde");
        p = new Person(18, "ttttt");
        
        // System.out.print(p.age + " " + p.name);

        Person obj = new Person();
        obj.setAge(-19);
        System.out.println(obj.getAge());
    }
}
