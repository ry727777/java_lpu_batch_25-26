enum Direction{
    EAST(20), WEST(30) , NORTH(10), SOUTH(15);

    private int dist;
    Direction(int dist){
        this.dist = dist;
    }

    int getDistance(){
        return this.dist;
    }

}

public class Direction12 {
    public static void main(String[] args) {
        Direction dir = Direction.NORTH;
        // System.out.println("Direction: "+east +" Travel distance "+east.getDistance());
        switch (dir) {
            case EAST:
                System.out.println("Direction: "+dir +" Travel distance "+dir.getDistance());
                break;
            case WEST:
                System.out.println("Direction: "+dir +" Travel distance "+dir.getDistance());
                break;
            case NORTH:
                System.out.println("Direction: "+dir +" Travel distance "+dir.getDistance());
                break;
            case SOUTH:
                System.out.println("Direction: "+dir +" Travel distance "+dir.getDistance());
                break;
        
            default:
                System.out.println("Invalid Direction");
        }
    }
}
