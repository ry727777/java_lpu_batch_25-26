enum Difficulty{
    EASY(1,10,5), MEDIUIM(2,20,15), HARD(3,30,20);

    int level;
    int enemy;
    int time;

    Difficulty(int level, int enemy, int time){
        this.level = level;
        this.enemy = enemy;
        this.time = time;
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

public class EnumJava {
    public static void main(String[] args) {
        Difficulty var = Difficulty.EASY;
        System.out.println(var);
        System.out.println(var.EASY.ordinal());
        // can not create object outside because construct in enum is private
        // Difficulty name = new Difficulty();

    }
}
