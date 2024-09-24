package ex2;

public class Circle extends Shape{
	private double raius;
	
	public Circle(double raius) {
		this.raius = raius;
	}
	
	public double getRaius() {
		return raius;
	}
	
	public void setRaius(double raius) {
		this.raius = raius;
	}
	
	@Override 
	public double calculateArea() {
		return 3.14 * raius * raius;
	}
	
	@Override
	public double calculatePerimeter() {
		return 2 * 3.14 * raius;
	}
}
