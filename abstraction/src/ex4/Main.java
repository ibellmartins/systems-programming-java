package ex4;

public class Main {
	public static void main(String[]args) {
		Animal lion = new Lion();
		lion.eat();
		lion.sleep();
		
		Animal tiger = new Tiger();
		tiger.eat();
		tiger.sleep();
		
		Animal deer = new Deer();
		deer.eat();
		deer.sleep();
	}
}
