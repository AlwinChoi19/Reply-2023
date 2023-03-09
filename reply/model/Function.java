package reply.model;
import java.util.ArrayList;

public class Function {


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
