public class Geometry {
    // rectangle
    public int area(int length, int width) {
        return length * width;
    }

    // square
    public int area(int length) {
        return length * length;
    }

    // circle
    public double area(double radius) {
        return Math.PI * radius * radius; // Using Math.PI for better precision
    }

    // triangle
    public double area(double base, double height) {
        return 0.5 * base * height;
    }
}
