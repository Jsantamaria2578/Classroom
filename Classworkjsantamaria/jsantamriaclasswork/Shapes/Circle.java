package Shapes;

public class Circle implements Shapes{
	private double radius;
	private static double pi = 3.1415926535979;
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double calculateArea() {
		return this.radius * this.radius * pi;
	}
	
	public double calculatePerimeter() {
		return 2 * this.radius * pi;
	}
}
