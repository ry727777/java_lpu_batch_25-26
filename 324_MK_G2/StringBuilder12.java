public class StringBuilder12 {
    public static void main(String[] args) {

        StringBuilder st1 = new StringBuilder("ABCDE");
        st1.insert(2, "XY");
        System.out.println(st1);
        st1.insert(2, 123);
        System.out.println(st1);

        // traverse stringbuildr using for loop
        for(int i=0; i<st1.length(); i++){
            System.out.print(st1.charAt(i));
        }
        System.out.println();
        // to delete
        st1.delete(2, 4);
        System.out.println(st1);

        // StringBuilder str = new StringBuilder("ABCDER");
        // System.out.println(str);
        // System.out.println("Object code  " + str.hashCode());
        // str.append("xyz");
        // str.append(123);
        // str.append(234.0);
        // str.append('A');
        // System.out.println("can append int float char "+ str);
        // System.out.println("Object code  " + str.hashCode());

        // StringBuilder str2 = new StringBuilder("ABCDE");
        // StringBuilder str3 = new StringBuilder("ABCDE");

        // String str4 = new String("ABCDER");
        // String str5 = new String("ABCDER");
        // // to compare the value of StringBuilder change it to first String class then use equals() method
        // String s1 = str2.toString();
        // String s2 = str3.toString();
        // if(str2 == str3){
        //     System.out.println("Same Object");
        // }else{
        //     System.out.println("Differe object");
        // }
       

        // if(s1.equals(s2)){
        //     System.out.println("Having same values");
        // }else{
        //     System.out.println("Differ values");
        // }

    }
}
