class TypeCasting {
    public static void main(String[] args){
        // int num = 10;
        // double d = num;
        // System.out.println(d);

        // double dt = 40.56;
        // int tmp = (int)dt;
        // System.out.println(tmp);
        
       
        double d = 10.56;
         float f = (float)d;
         long l = (long)f;
         int i = (int)l;
         short s = (short)i;
         byte b = (byte)s;

        System.out.println(b);
         System.out.println(s);
          System.out.println(i);
           System.out.println(l);
            System.out.println(f);
             System.out.println(d);
    }
}
