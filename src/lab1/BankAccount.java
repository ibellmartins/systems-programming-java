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
	
	public void serBalance(double balance) {
		this.balance = balance;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public void deposit(double deposit) {
		if (deposit <= 0) {
			throw new IllegalArgumentException("voce deve inserir um valor para depositar");
		}
		else {
		   this.balance += deposit;
		   System.out.println("vc depositou R$" + deposit);
		}
	}
	
	public void withdrow(double withdrow) throws InsufficientFundsException {
		if (withdrow > this.balance) {
			throw new InsufficientFundsException("seu saldo é insuficiente p realizar o saque.");
		} else if (withdrow <= 0) {
			throw new IllegalArgumentException("voce deve inserir um valor para sacar");
		} else {
			this.balance -= withdrow;
			System.out.println("vc retirou R$" + withdrow);
		}
	}
	
	public void showAccount() {
		System.out.println("O saldo da sua conta é de: R$" + balance);
	}
}
