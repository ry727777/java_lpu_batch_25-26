public class StringClass {
    public static void main(String[] args) {

        String st = "ABCD";
        String st2 = "abcd";
        if(st.equals(st2)){
          System.out.println("String values are equal");
        }else{
          System.out.println("String values are not equal");
        }

        if(st.equalsIgnoreCase(st2)){
          System.out.println("String values are equal");
        }else{
          System.out.println("String values are not equal");
        }
        // String str1 = "ABCDEFGH";
        // String str2 = "ABCD";

        // String str3 = new String("ABCD");
        // String str4 = new String("ABCD");

        // // can't use [] to access the char .
        // System.out.println(str4.charAt(3));

        // // convert word to Array
        // char[] word_cahr = str1.toCharArray();
        // for(int i=0; i<word_cahr.length; i++){
        //   System.out.print(word_cahr[i]); 
        // }


        // System.out.println(System.identityHashCode(str3));
        // System.out.println(System.identityHashCode(str4));


        // if(str1.equals(str3)){
        //   System.out.println("Equal value");
        //   // System.out.println("Equal Object s1 and s2");
        // }else{
        //   System.out.println("Object or not equal");
        // }

        //  if(str2.equals((str4))){
        //    System.out.println("Equal value");
        //   // System.out.println("Equal Object s3 and s4");
        // }else{
        //   System.out.println("Object or not equal");
        // }

        // // String is immutable
        // String c = "ABCDE";
        // System.out.println(System.identityHashCode(c));
        // c= "AB";
        // System.out.println(System.identityHashCode(c));
        // System.out.println(c);

        // String name = "ABCDE";
        // System.out.println(name.hashCode());
        // name += "xyz";
        // System.out.println(name.hashCode());

        // // Some methods on String Class
        // String methods = new String("ABCDEFGH");
        // // length
        // System.out.println(methods.length());
        // System.out.println(methods.isEmpty());
        // System.out.println(methods.isBlank());

        // //Modify String
        // String str5 = methods.toLowerCase();
        // System.out.println(str5);

    }
}
