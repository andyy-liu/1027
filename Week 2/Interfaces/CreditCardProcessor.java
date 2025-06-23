public class CreditCardProcessor implements PaymentProcessor{
    public double processPayment(double amount) {
        System.out.println("Processing credit card payment for " + amount);
        return amount;
    }
}
