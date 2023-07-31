
public class SavingsAccount extends BankAccount{
	private double rate = .025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = super.getAccountNumber() + "-" + Integer.toString(savingsNumber);
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		savingsNumber = oldAccount.getSavingsNumber() + 1;
		accountNumber = super.getAccountNumber() + "-" + Integer.toString(savingsNumber);
	}
	
	public void postInterest() {
		double monthlyInterest = super.getBalance() * rate;
		super.deposit(monthlyInterest);
	}
	
	public int getSavingsNumber() {
		return savingsNumber;
	}
	
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
	
	
}
