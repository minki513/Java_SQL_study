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
		c.print(); //�θ� Ŭ���� print()�� �ƴ϶� �ڽ� Ŭ���� print()�� ȣ��� -������
		c.check();
		c.test();
		
		Parents x = new Child1(); //������-���̴� ���� �θ��������� ���� �ν��Ͻ��� �ڽ��� ����Ǿ� �ִ°�
		x.print();
		x.test();
		//x.check(); ����, Parents Ŭ������ check()�� ���� �޼ҵ� �̱� ���� 
		
	}
}

