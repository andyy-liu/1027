import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PalindromeCounter {

    public static boolean isPalindrome(String s) {
        // Base case: empty string or single character is a palindrome
        if (s.length() <= 1) {
            return true;
        }

        // Compare first and last characters
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        // Recursive step: check substring excluding first and last characters
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        String fileName = "potentialPalindromes.txt";
        int palindromeCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // check if the word is a palindrome
                if (isPalindrome(line)) {
                    palindromeCount++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number of palindromes found: " + palindromeCount);
    }
}