public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello, World!");
        System.out.println(System.identityHashCode(str));
        str.append(" Welcome");
        System.out.println(System.identityHashCode(str));
        str.append('A');
        char[] ch = {'A', 'B','C'};
        str.append(ch);
        str.append(290);
        System.out.println(str);
        str.append("abcde", 2,4);

        str.charAt(2);
         // work on both string class and builder

    }
}
