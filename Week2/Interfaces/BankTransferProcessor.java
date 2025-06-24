public class BankTransferProcessor implements PaymentProcessor{
    public double processPayment(double amount) {
        System.out.println("Processing bank transfer payment for " + amount);
        return amount;
    }
}
