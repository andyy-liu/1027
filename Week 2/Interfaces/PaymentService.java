public class PaymentService {
	private PaymentProcessor paymentProcessor;
	private double profit;

	public PaymentService(PaymentProcessor processor) {
		this.paymentProcessor = processor;
	}

	public void changePaymentType(PaymentProcessor processor) {
		this.paymentProcessor = processor;
	}

	public void process(double amount) {
		paymentProcessor.processPayment(amount);
		this.profit += amount;
		System.out.println("Payment processed. Total accumulated profit: " + this.profit);
	}
}
