import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        double age = scanner.nextDouble();
        System.out.println("Hello, your age is: " + age + "!");
        scanner.close();
        // System.out.print("Enter your age: ");
        // age = scanner.nextDouble();
        // System.out.println("Hello, your age is: " + age + "!");
    }
}