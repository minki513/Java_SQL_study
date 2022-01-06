package javacode;

class Parent2{
	void print() {
		System.out.println("Parent : print()");
	}
	void show() {
		System.out.println("Parent : show()");
	}
}

class ChildA extends Parent2{
	void print() {
		System.out.println("child-A : print()");
	}
	void showA() {
		System.out.println("child-A : show()");
	}
}
class ChildB extends Parent2{
	void print() {
		System.out.println("child-b : print()");
	}
	void showB() {
		System.out.println("child-b : show()");
	}
}
public class inheritance7 {
	static void dowork(Parent2 p) {
		if(p instanceof ChildA)
		{
			ChildA ca = (ChildA) p;
			ca.print();
			ca.show();
			ca.showA();
		}
		else if(p instanceof ChildB)
		{
			ChildB cb = (ChildB) p;
			cb.print();
			cb.show();
			cb.showB();
		}
		else {
			p.print();
			p.show();
		}
	}
	public static void main(String[] args) {
		Parent2 p = new Parent2();
		ChildA a = new ChildA();
		ChildB b = new ChildB();
		dowork(p);
		dowork(a);
		dowork(b);
		System.out.println("---------");
		Parent2 p2 = new ChildA();
		((ChildA)p2).showA();  //p2�� parent2���̱� ������ parent2 Ŭ������ �޼ҵ常 ȣ�Ⱑ����
		//�� ��ȯ�� ��� childA Ŭ���� �޼ҵ� ȣ�� ������.
	}
}
