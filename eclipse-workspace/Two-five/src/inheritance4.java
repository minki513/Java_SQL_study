package javacode;

class Circle{
	static final double PI = 3.141592; //final 인스턴스 변수는 초기화 되면 바꿀수 없음.
	//final 인스턴스 변수를static으로 해서 모든 인스턴스간에 공유를 하면 좋다.
	private double radius;

	Circle(){}
	Circle(double radius){
		this.radius = radius;
	}
	
	double getRadius() { return radius;}
	void setRadius(double radius) {
		this.radius = radius;
	}
}
public class inheritance4 {

	public static void main(String[] args) {
		Circle c1 = new Circle(1.5);
		Circle c2 = new Circle(2.2);
		
		double c1Area = Circle.PI * c1.getRadius() * c1.getRadius();
		double c2Area = Circle.PI * c2.getRadius() * c2.getRadius();
		
		System.out.println("c1 area : " + c1Area);
		System.out.println("c2 area : " + c2Area);
	}
}
