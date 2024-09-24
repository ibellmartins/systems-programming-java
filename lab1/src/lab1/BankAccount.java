package lab1;

public class BankAccount {
	private int accountNumber;
	private double balance;
	private String accountHolderName;
	
	public BankAccount(int accountNumber, double balance, String accountHolderName) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountHolderName = accountHolderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public void deposit(double depositValue) {
		if (depositValue <= 0) {
			throw new IllegalArgumentException("you cannot deposit an inexistent amount");
		} else {
			balance += depositValue;
			System.out.println("you've deposited $" + depositValue);
		}
	}
	
	public void withdraw(double withdrawValue) throws InsufficientFundsException{
		if (withdrawValue <= 0) {
			throw new IllegalArgumentException("you cannot withdraw an inexistent amount");
		} else if (withdrawValue > balance) {
			throw new InsufficientFundsException("you don't have this value on balance"); 
		} else {
			balance -= withdrawValue;
			System.out.println("\nyou've withdrawn $" + withdrawValue);
		}
	}
	
	public void shows() {
		System.out.printf("\nhey, %s. you have $%.2f balance.\n", accountHolderName, balance);
	}
}