public class PayPalProcessor implements PaymentProcessor{
    public double processPayment(double amount) {
        System.out.println("Processing PayPal payment for " + amount);
        return amount;
    }
}
