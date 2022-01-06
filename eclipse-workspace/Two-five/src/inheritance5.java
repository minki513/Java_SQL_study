package javacode;

class Parents{
	void print() {
		System.out.println("parent - print method");
	}void test() {
		System.out.println("parent - test method");
	}
}
class Child1 extends Parents{
	void print() {
		System.out.println("child - print method");
	}void check() {
		System.out.println("child - check method");
	}
}

public class inheritance5 {

	public static void main(String[] args) {
		
		Parents p = new Parents();
		p.print();
		p.test();
		
		Child1 c = new Child1();
		c.print(); //부모 클래스 print()가 아니라 자식 클래스 print()가 호출됨 -다형성
		c.check();
		c.test();
		
		Parents x = new Child1(); //다형성-보이는 것은 부모형태지만 실제 인스턴스는 자식이 저장되어 있는것
		x.print();
		x.test();
		//x.check(); 에러, Parents 클래스에 check()는 없는 메소드 이기 때문 
		
	}
}

