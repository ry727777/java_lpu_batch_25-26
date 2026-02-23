public class StringClass12 {
    public static void main(String[] args) {
        String str = "I love java programming. java is also used for backend";
        String new_str = str.replace("java", "python");
        System.out.println(new_str);

        // count of words
        String[] strarr = str.split(" ");
        System.out.println("No of words " + strarr.length);

        // index of java
        System.out.println(str.indexOf("java"));


        String st34 = "abcbadeffa";
        // abcdef
        boolean[] isvisited = new boolean[257];
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<st34.length(); i++){
            char ch = st34.charAt(i);
            if(isvisited[ch] == false){
                isvisited[ch] = true;
                ans.append(ch);
            }
        }
        System.out.println(ans);
    }
}
