package javacode;

class Parent{
	void show() {
		System.out.println("I am parent show");
	}
	
	void show(int data) {
		System.out.println("I am parent show - data : " +data);
		}
	void show(String msg) {
		System.out.println("I am parent : " + msg);
	}
}

class Child extends Parent{
	void show(int data) {
		System.out.println("I am child show - data : " +data);
	}
}

public class inheritance3 {

	public static void main(String[] args) {
		Child c = new Child();
		c.show();
		c.show(100); //오버라이딩된 경우, child 인스턴스는 자기의 메소드를 호출함
		c.show("Hello");
		

	}

}
