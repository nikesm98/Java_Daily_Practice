package ObjectAndClasses;

class RectangleNew{
	private int length;
	private int breadth;

	public RectangleNew(){
		length = 2;
		breadth = 2;
	}

	public RectangleNew(int l, int b){
		length = l;
		breadth = b;

	}

	public int getBreadth() {
		return breadth;
	}

	public int getLength() {
		return length;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int Area(){
		return breadth * length;
	}
}



public class ConstructorPractice {
	public static void main(String[] args) {
		RectangleNew r1 = new RectangleNew(10,20);

//		r1.setBreadth(40);
//		r1.setLength(50);
		System.out.println(r1.Area());
	}

}
