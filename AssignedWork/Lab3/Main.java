public class Main {
    public static void main(String[] args) {
        Geometry geo = new Geometry();

        // test the area methods
        System.out.println("Area of rectangle (length 5, height 3): " + geo.area(5, 3));
        System.out.println("Area of square (side length 4): " + geo.area(4));
        System.out.println("Area of circle (radius 3): " + geo.area(3.0));
        System.out.println("Area of triangle (base 6, height 4): " + geo.area(6.0, 4.0));
    }
}
