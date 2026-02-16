public class StringBUilderCalss {
    public static void main(String[] args) {
        String str = "abcder";
        str = str + "drwed";  // create new object again
        System.out.println(str);

        String t = "";
        for(int i=0; i<10; i++){
            t += i;
            System.out.println(System.identityHashCode(t));
        }

        StringBuilder strbr = new StringBuilder("abcde");
        strbr.append("gtrf");
        strbr.append('R');
        System.out.println(strbr.length());
        strbr.delete(1, 3);
        System.out.println(strbr);

        strbr.insert(0, 0);
        strbr.deleteCharAt(3);
        strbr.reverse();
        strbr.replace(0, 0, str);
        strbr.charAt(3);
        strbr.substring(3);
    
    }
}
