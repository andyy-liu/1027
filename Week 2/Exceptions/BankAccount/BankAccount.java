public class BankAccount {
	private double balance;
	
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount > balance) {
			throw new InsufficientFundsException("Attempted to withdraw " + amount + " with " + balance + " available.");
		}
		balance -= amount;
		System.out.println("Withdrawl successful.");
	}
}
