public class Main {
    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new CreditCardProcessor();
        PaymentProcessor payPalProcessor = new PayPalProcessor();
        PaymentProcessor bankTransferProcessor = new BankTransferProcessor();

        PaymentService service = new PaymentService(creditCardProcessor);
        service.process(100.0);

        service.changePaymentType(payPalProcessor);
        service.process(150.0);
        
        service.changePaymentType(bankTransferProcessor);
        service.process(200.0);
    }    
}
