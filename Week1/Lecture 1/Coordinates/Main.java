import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Coordinate p1 = new Coordinate(2, 3);
        Coordinate p2 = new Coordinate(3, 4);
        Coordinate p3 = p1.add(p2);

        ArrayList<Coordinate> points = new ArrayList<>();

        points.add(p1);
        points.add(p2);
        points.add(p3);

        CoordinatePlane coordPlane = new CoordinatePlane(points);

        coordPlane.addCoordinate(p3);

        coordPlane.printAllCoordinates();
    }
}