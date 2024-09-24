package ex4;

public class Lion extends Animal{
	
	@Override
	public void eat() {
		System.out.println("Lions eat zebras and wildebeests.");
	}
	
	@Override
	public void sleep() {
		System.out.println("Lions spend up 21 hours each day resting and sleeping");
	}
}
