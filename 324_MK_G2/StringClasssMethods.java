public class StringClasssMethods {
    public static void main(String[] args) {
        // Replace methods
        String str = "I love java Programming. java is also used for backend";
        String ans = str.replace("java", "python");
        System.out.println(ans);
        String ans2 = str.replaceFirst("java", "python");
        System.out.println(ans2);

        // Split string on space
        String[] strAryya = str.split(" ");
        System.out.println("No of words "  + strAryya.length);

        // substring methods
        String str2 = "ABCDEFGH";
        String ans3 = str2.substring(3);
        System.out.println(ans3); // DEFGH
        String ans4 = str2.substring(2,6);
        System.out.println(ans4); // CDEF

        int index = str.indexOf("java");
        System.out.println(index);

        // question is check if "also" is present in str or not 
        int intge = str.indexOf("also");
        if(intge < 0){
            System.out.println("also is not present");
        }else{
            System.out.println("String present");
        }

    }
}
