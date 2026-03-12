class ConstrChai{
    ConstrChai(){
        System.out.println("Default constr called");
    }
    ConstrChai(int n){
        this();
        System.out.println("Param constr called");
       
    }
    ConstrChai(int a, int b){
        this(10);
        System.out.println("2nd param construc called");
    }
}

public class ConstructorChain {
    public static void main(String[] args) {
        ConstrChai obj = new ConstrChai(20,30);
    }
}
