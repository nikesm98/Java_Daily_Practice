package ObjectAndClasses;

import java.awt.geom.Area;
import java.security.KeyStore;

//class RectangleArAndPr{
//	public double breadth;
//	public double length;
//
//	public double Area(){
//		return length * breadth;
//	}
//
//	public double Parameter() {
//		return 2*(breadth + length);
//	}
//
//	public boolean Square(){
//		if (length == breadth)
//			return true ;
//		else
//			return false ;
//	}
//}
//
//public class Rectangle {
//	public static void main(String[] args) {
//
//		RectangleArAndPr r1 = new RectangleArAndPr();
//
//		r1.length = 20;
//		r1.breadth = 20;
//
//		System.out.println(r1.Area());
//		System.out.println(r1.Parameter());
//		System.out.println(r1.Square());
//
//
//	}
//}
class RectangleUsingPrivate{
	private double breadth ;
	private double length;

	public double getBreadth() {
		return breadth;
	}

	public double getLength() {
		return length;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double Area(){
		return length * breadth;
	}
}


public class Rectangle {

	public static void main(String[] args) {
		RectangleUsingPrivate r1 = new RectangleUsingPrivate();

		r1.setBreadth(20);
		r1.setLength(10);

		System.out.println(r1.Area());
		System.out.println(r1.getBreadth());
	}
}