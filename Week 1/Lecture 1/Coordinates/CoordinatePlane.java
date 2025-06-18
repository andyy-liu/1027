import java.util.ArrayList;
import java.util.Collections;

public class CoordinatePlane {
    private ArrayList<Coordinate> coordinates;

    public CoordinatePlane(ArrayList<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    public void addCoordinate(Coordinate coordinate) {
        coordinates.add(coordinate);
    }

    public void printAllCoordinates() {
        Collections.sort(coordinates);
        for (Coordinate coord : coordinates) {
            System.out.println(coord);
        }
    }
}