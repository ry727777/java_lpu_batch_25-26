class Type_Conversion {
    public static void main(String[] args) {
        // implicit con
        // int a = 20;
        // double d = a;
        // System.out.println(d);

        // explicit
         double dt = 34.56;
         int st = (int)dt;
         System.out.println(st);

         // implicit 
         byte b = 20;
         short s = b;
         int i = s;
         long l = i;
         float f = l;
         double d = f;

         System.out.println(b);
         System.out.println(s);
         System.out.println(i);
         System.out.println(l);
         System.out.println(f);
         System.out.println(d);


        // explict conversion
         double dr = 34.45;
         float fr = (float)dr;
         long  lr = (long)fr;
         int ir = (int)lr;
         short sr = (short)ir;
         byte br = (byte)sr;

         System.out.println(dr);
         System.out.println(fr);
         System.out.println(lr);
         System.out.println(ir);
         System.out.println(sr);
         System.out.println(br);




   
}
}
