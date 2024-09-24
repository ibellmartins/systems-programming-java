package ex4;

public class Deer extends Animal{
	
	@Override
	public void eat() {
		System.out.println("deers eat fruits and protein");
	}
	@Override
	public void sleep(){
		System.out.println("deers sleep around 4.5 hours a day");
	}
}
