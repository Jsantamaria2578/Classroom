package Shapes;
import java.util.Random;


public class shapesUtil {
	public static double sumPerim(Shapes[] shapeArr) {
		double tempsum =0;
		for(int i = 0; i < shapeArr.length; i++) {
			tempsum += shapeArr[i].calculatePerimeter();
		}
		return tempsum;
	}
	
	public static double totalArea(Shapes[] shapeArr) {
		double tempsum =0;
		for(int i = 0; i < shapeArr.length; i++) {
			tempsum += shapeArr[i].calculateArea();
		}
		return tempsum;
	}
	
	public static Shapes getRandomShape() {
		Random r = new Random();
		int x =  r.nextInt(100);
		switch(x) {
		case 0 :
			return Circle(((double) r.nextInt(100) + 1));
		case 1:
			return Rectangle( ((double) r.nextInt(100) + 1),(double) r.nextInt(100) + 1);
		default:
			return Square(10);
		} 
	}
}
