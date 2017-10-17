package Shapes;

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
}
