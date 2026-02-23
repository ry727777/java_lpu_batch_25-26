enum Difficulty{
    EASY(2,5,10),MEDIUM(5,10,15),HARD(10,20,20), 
    Expert();
   
    int level;
    int enemy;
    int time;
    Difficulty(){
        this.level = 20;
        this.enemy = 100;
        this.time = 60;
    }
    Difficulty(int level, int enemy, int time){
        this.level = level;
        this.enemy = enemy;
        this.time = time;
    }

    // getter function
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

public class Enumra {
    public static void main(String[] args) {
        Difficulty status = Difficulty.EASY;
        // System.out.println(status.ordinal());
        System.out.println(status.level);

    }
}
