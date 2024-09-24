package lab1;

public class Main {
	public static void main(String[] args) {
		BankAccount bk = new BankAccount(123456, 500, "isabella martins");
		
		try {
			bk.deposit(400);
			bk.shows();
			bk.withdraw(500);
			bk.shows();
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
			
		} catch (InsufficientFundsException i) {
			System.out.println(i.getMessage());
		}
	}
}
