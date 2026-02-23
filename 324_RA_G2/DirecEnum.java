enum Directions{
    EAST(10), WEST(15), NORTH(5),SOUTH(1);

    int dist;
    Directions(int dist){
        this.dist = dist;
    }


    int getDist(){
        return dist;
    }

}

public class DirecEnum {
    public static void main(String[] args) {
        Directions dir = Directions.EAST;
        
        switch (dir) {
            case EAST:
                System.out.println("Travel: " + dir.EAST.getDist());
                break;
            case WEST:
                System.out.println("Travel: " + dir.WEST.getDist());
                break;
            case NORTH:
                System.out.println("Travel: " + dir.NORTH.getDist());
                break; 
            case SOUTH:
                System.out.println("Travel: " + dir.SOUTH.getDist());
                break;
        
            default:
                System.out.println("Invalid Direction");
        }
    }
}
