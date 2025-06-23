public class CheckedVersusUncheckedExceptionExample2 {
    public static void main(String[] args) {
        printSubstring("Hello, world!", 0, 5);
    }

    private static void printSubstring(String str, int start, int end) {
        try {
        String result = str.substring(start, end);
        System.out.println("Substring: " + result);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds! " + e.getMessage());
        }
    }
}
