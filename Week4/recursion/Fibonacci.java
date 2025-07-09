public class Fibonacci {

    // recursive method
    public static int fibonacci_recursive(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n==1) {
            return 1;
        }
        else {
            return fibonacci_recursive(n-1) + fibonacci_recursive(n-2);
        }
    }

    // iterative method
    public static int fibonacci_iterative(int n) {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 20;

        // measure time for recursive method
        long startTime = System.nanoTime();
        int resultRecursive = Fibonacci.fibonacci_recursive(n);
        long endTime = System.nanoTime();
        long durationRecursive = endTime - startTime;
        System.out.println("Recursive Fibonacci of " + n + " is: " + resultRecursive);
        System.out.println("Time taken by recursive method: " + durationRecursive + " nanoseconds");

        // measure time for iterative method
        startTime = System.nanoTime();
        int resultIterative = Fibonacci.fibonacci_iterative(n);
        endTime = System.nanoTime();
        long durationIterative = endTime - startTime;
        System.out.println("Iterative Fibonacci of " + n + " is: " + resultIterative);
        System.out.println("Time taken by iterative method: " + durationIterative + " nanoseconds");
    }
}