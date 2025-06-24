public class Main {
    public static void main(String[] args) {
        // uses the method from the appropriate class with the interface PaymentProcessor
        PaymentProcessor creditCardProcessor = new CreditCardProcessor(); 
        PaymentProcessor payPalProcessor = new PayPalProcessor();
        PaymentProcessor bankTransferProcessor = new BankTransferProcessor();

        // PaymentService class uses the PaymentProcessor interface which allows it to work with any payment method that implements the interface
        PaymentService service = new PaymentService(creditCardProcessor);
        service.process(100.0); // calls the .process method of PaymentService which in turn calls the .processPayment method of CreditCardProcessor

        service.changePaymentType(payPalProcessor);
        service.process(150.0);
        
        service.changePaymentType(bankTransferProcessor);
        service.process(200.0);
    }    
}
