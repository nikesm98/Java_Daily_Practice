package ObjectAndClasses;

class CircleParAndArea{
	public double radius;

	public double area(){
		return Math.PI*radius*radius;
	}

}

public class Circle {
	public static void main(String[] args) {
		CircleParAndArea c1 = new CircleParAndArea();
		CircleParAndArea c2 = new CircleParAndArea();
		c1.radius = 8.332;
		c2.radius = 3.4454;

		System.out.println(c1.area());
		System.out.println(c2.area());

	}
}


