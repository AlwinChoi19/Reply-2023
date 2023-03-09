package reply.model;
import java.util.ArrayList;

public class Function {


    private int euklidDist(int x1, int x2, int y1, int y2) {
        return (int) Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)) ;
    }
    public int getDistance(Coord x1,  ArrayList<Coord> Coords) {

        int distance = 0;
        for (Coord i : Coords) {
            int temp = euklidDist(x1.getX(), i.getX(), x1.getY(), i.getY());
            if (temp > distance)
                distance = temp;
        }

        return distance;
    }
}
