public class StringClass23 {
    public static void main(String[] args) {

        // Conversion
        // Integer a = 20;
        // String sta = a.toString();
        // int b = 20;

        // System.out.println(a+10);
        // // String s = String.valueOf(a);
        // System.out.println(a+10);

        // // string to int
        // String str = "1234";
        // int d = Integer.valueOf(str);
        // System.out.println(d+10);
        // int init = Integer.parseInt(str);
        // System.out.println(init +20);


        StringBuilder sb = new StringBuilder("ABCD");
        StringBuilder st = new StringBuilder("ABCD");
        if(sb.equals(st)){
            System.out.println("Equal value");
        }else{
            System.out.println("not equal values");
        }

        // convert to string class
        String new_sb = sb.toString();
        String new_st = st.toString();
        if(new_st.equals(new_sb)){
            System.out.println("Equal value");
        }else{
            System.out.println("not equal values");
        }

        // StringBuilder str1  =new StringBuilder("ABCDEAAAAAAAAAAA");
        // System.out.println(str1);
        // System.out.println(str1.capacity());

        // // append
        // StringBuilder str2  = new StringBuilder("ABCD");
        // System.out.println(str2.hashCode());
        // str2.append("XYZ");
        // System.out.println(str2);
        // System.out.println(str2.hashCode());
        // str2.append(123);
        // str2.append(34.45);

        //insert function
        // StringBuilder str3 = new StringBuilder("ABCDE");
        // str3.insert(2, "Z");
        // System.out.println(str3);
        // char[] ch = {'a','b','c'};
        // str3.insert(3, ch);
        // System.out.println(str3);

        // int idx = str3.indexOf("abczy");
        // System.out.println(idx);
        

        // String s = "ABCD";
        // String t = "ABCD";
        // String n = new String("ABCD");
        // String a = new String("ABCD");
        // System.out.println(System.identityHashCode(s));
        // System.out.println(System.identityHashCode(t));
        // System.out.println(System.identityHashCode(n));
        // System.out.println(System.identityHashCode(a));
        // if(s == t){
        //     System.out.println("Same object");
        // }
        // if(n == a){
        //     System.out.println("same value");
        // }




    }
}
