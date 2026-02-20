public class UniqueChar {
    public static void main(String[] args) {
        String str = "abcdaabbdea";
        // output abcde
        // using 2 for loop
        StringBuilder ans = new StringBuilder();

        // char ch = 258;
        // System.out.println(ch);

        // int a = 'a';
        // System.out.println(a);

        boolean[] check = new boolean[257];

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(check[ch] == false){
                ans.append(ch);
                check[ch] = true;
            }
        }


        // for(int i=0; i<str.length(); i++){
        //     char ch = str.charAt(i);
        //     int check = 0;
        //     for(int j=i-1 ; j>=0; j--){
        //         // go back and check
        //         char ch2 = str.charAt(j);
        //         if(ch == ch2){
        //             check = 1;
        //             break;
        //         }
        //     }

        //     if(check == 0){
        //         ans.append(ch);
        //     }

        // }

        

        System.out.println(ans);
    }
}
