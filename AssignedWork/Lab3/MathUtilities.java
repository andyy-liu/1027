public class MathUtilities {
    static final double PI = 3.14159;

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static double power(double base, int exponent) {
        if (exponent < 0) {
            System.out.println("Negative exponent not allowed");
            return -1; // Meaningful value indicating invalid input
        }
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Value must be non-negative");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}