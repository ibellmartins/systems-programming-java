package ex3;

public class CurrentAccount extends BankAccount{
	public CurrentAccount(double balance) {
		super(balance);
	}
	
	@Override
	public void deposit(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("insira um numero valido");
		} else {
			setBalance(getBalance() + amount);
		}
	}
	
	@Override
	public void withdraw(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("insira um numero valido");
		} else {
			setBalance(getBalance()- amount);
		}
	}
}
