package ex2;

public class Main {
	public static void main(String[]args) {
		Shape t = new Triangle(10, 10, 10, 10);
		System.out.println("triangle's area is: " + t.calculateArea());
		System.out.println("triangle's perimeter is: " + t.calculatePerimeter());
		
		Shape c = new Circle(1);
		System.out.println("circle's area is: " + c.calculateArea());
		System.out.println("circle's perimeter is: " + c.calculatePerimeter());
	}
}
