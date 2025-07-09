public class Factorial {

    public static int whatRowAmIIn(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return whatRowAmIIn(n-1) + 1;
        }
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            System.out.println(n);
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
