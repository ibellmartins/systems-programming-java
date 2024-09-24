package ex4;

public class Tiger extends Animal{
	
	@Override
	public void eat() {
		System.out.println("tigers eat fishs, rabbits and small rodents");
	}
	
	@Override
	public void sleep() {
		System.out.println("tigers sleep between 18 to 20 hours everyday");
	}
}
