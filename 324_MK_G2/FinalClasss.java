class StudentInfo{
    final String name;
    final double age;
    final int reg_no;
    StudentInfo(String name, double age, int reg_no){
        this.name = name;
        this.age = age;
        this.reg_no = reg_no;
    }

    void display_info(){
        System.out.println("Name " + this.name + " age "+ this.age +" reg no "+ this.reg_no);
    }
}

public class FinalClasss {
    public static void main(String[] args) {

       final StudentInfo obj = new StudentInfo("ABCDE", 22, 18765);
        //obj = new StudentInfo(); // can't change the object refe 


        obj.display_info();
        obj.name = "XYZ";
        obj.age = 24;
        obj.reg_no = 187762;
        obj.display_info();

        // StudentInfo obj2 = new StudentInfo();


        // final int x = 20;
        // System.out.println(x);
        // x++;
        // System.out.println(x);
    }
}
