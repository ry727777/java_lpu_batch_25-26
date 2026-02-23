import java.util.logging.Level;

enum Difficulty{
    EASY(3, 15, 10), MEDIUM(5, 20, 15), HARD(10, 50, 30),
    Expert();
    // Difficulty EASY  = new Difficulty();
    // public Difficulty(){

    // }
    private int level;
    private int enemy;
    private int time;
    Difficulty(int level, int enemy, int time){
        this.level = level;
        this.enemy = enemy;
        this.time = time;
    }
    Difficulty(){
        this.level = 20;
        this.enemy = 100;
        this.time = 60;
    }

    int getEnemy(){
        return this.enemy;
    }
    int getLevel(){
        return this.level;
    }
    int getTime(){
        return this.time;
    } 

}

public class EnumClass {
    public static void main(String[] args) {
        Difficulty st = Difficulty.EASY;
        System.out.println("Game : "+ st + " Level: " +st.getLevel() + " Enemy: "+st.getEnemy() + " Time: "+st.getTime());
        // System.out.println(st.getEnemy());
        // System.out.println(st.ordinal());
        // System.out.println(st);
    }    
}
