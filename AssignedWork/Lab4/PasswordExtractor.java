import java.io.*;
import java.util.Scanner;

public class PasswordExtractor {
    public static void main(String[] args) {
        try {
            File file = new File("ToP_SecREt_PassWorD.txt");
            Scanner scanner = new Scanner(file);
            StringBuilder password = new StringBuilder();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (char c : line.toCharArray()) {
                    if (Character.isLetter(c)) {
                        password.append(c);
                    }
                }
            }
            scanner.close();

            System.out.println("The password is: " + password.toString());

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}