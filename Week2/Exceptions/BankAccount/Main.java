public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.00); // Create an account with $100 balance
        
        try {
            account.withdraw(150.00);  // Try to withdraw more than the balance
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());  // Handling the exception
        }
    }
}