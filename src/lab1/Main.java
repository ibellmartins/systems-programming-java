//exercise statement link: https://joaquim.craft.me/JC9ADlw56DPUFx

package lab1;

public class Main {
	public static void main(String[] args) {
		BankAccount bk = new BankAccount(500, 900.00, "isabella");
		
		try {
			  bk.deposit(9.00);
			  bk.showAccount();
			  bk.withdrow(80.00);
			  bk.showAccount();
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
			
		} catch (InsufficientFundsException i) {
			System.out.println(i.getMessage());
		}
	}
}
