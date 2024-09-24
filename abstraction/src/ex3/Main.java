package ex3;

public class Main {
	public static void main(String[] args) {
		BankAccount sa = new SavingsAccount(4000);
		
		BankAccount ca = new CurrentAccount(3000);
		
		sa.deposit(400);
		ca.deposit(230);
	}
}
