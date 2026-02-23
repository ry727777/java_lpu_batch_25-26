import java.util.Arrays;;

public class StringClass {
    public static void main(String[] args) {

        String a = "ABCDEF";
        String b = "ABCDE";
        String c = "   ABCD   ";

        // lenghth
        if(a.length() != 0){
            System.out.println("String is not empty");
        }
        if(a.isEmpty()){
            System.out.println("String length is 0.");
        }
        if(a.isBlank()){
            System.out.println("String is blank");
        }

        // Modifiaction
        System.out.println(b.toLowerCase());
        System.out.println(b);
        System.out.println(c);
        System.out.println(c.trim());
        System.out.println(a.substring(2));
        System.out.println(a.substring(2, 5));

        // convert word a to char array now u can use for each loop
        char[] ch = a.toCharArray();

        for(char ele : ch){
            System.out.print(ele + " ");
        }

        String pr = "I,love,Java,Programmin.,Java,is,also,used,for,backend";
        if(pr.contains("Java")){
            System.out.println("Present");
        }else{
            System.out.println("Not present");
        }

       String[] strarr =  pr.split(",");
       System.out.println(Arrays.toString(strarr));
        



        // String str = "ABCD";
        // System.out.println(System.identityHashCode(str));
        //     str = "ABCDEF";
        // System.out.println(System.identityHashCode(str));

        // String str1 = "";
        // for(int i=0; i<5; i++){
        //     str1 += i;
        //     // It will create new object every time
        //     System.out.println(System.identityHashCode(str1));
        // }

        String name = "BACDERF";
        // name[0] will give error [] -> reserved for array only
        // System.out.println(name.charAt(1));

        // for(char ch : name){

        // }

        // for(int i=0; i<name.length(); i++){
        //     System.out.println(name.charAt(i));
        // }



        // String str2 = "ABCD";
        // System.out.println(System.identityHashCode(str));
        // System.out.println(System.identityHashCode(str2));
        // if(str == str2){
        //     System.out.println("Object equal");
        // }
        // if(str.equals(str2)){
        //     System.out.println("Valurs are equal");
        // }


        String st1 = "ABCDE";
        String st2 = new String("ABCDE");
        String st4 = new String("ABCDE");
        String st3 = "ABCDE";
        if(st1 == st3){
            System.out.println("Objects are equal st1 and st3");
        }
        if(st2 == st4){
             System.out.println("Objects are equal st2 and st4");
        }
    }
}
