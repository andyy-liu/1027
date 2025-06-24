public class SimpleDivision {
    public static int divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Division operation is complete");
            return result;

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
            System.out.println("Division operation is complete");
            return 0;
        }
    }

    public static void main(String[] args) {
        int result1 = SimpleDivision.divide(10, 2);
        System.out.println("Result: " + result1);

        int result2 = SimpleDivision.divide(10, 0); // This should trigger an ArithmeticException
        System.out.println("Result: " + result2);

        int result3 = SimpleDivision.divide(10, 5);
        System.out.println("Result: " + result3);
    }
}