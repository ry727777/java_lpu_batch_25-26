
public class Tester {
    public static void main(String[] args) {
        // Person p = new Person("abcde", 30);

        // // p can refer to other object as well
        // p = new Person("rter", 45);
        // System.out.println(p.name + " " + p.age);

        Person p = new Person();
        p.stAge(19);
        System.out.println(p.getAge());

    }
}
