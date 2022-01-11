package interfacetest2;

interface WithPrivate{
	default int getData() {
		print();
		return get() + 100;
	}
	
	private void print() { //private �޼ҵ�� �������̽� �ȿ����� ���� ������
		System.out.println(get());
	}
	
	private int get() {
		return 100;
	}
}

class Test3 implements WithPrivate{
	void test() {
		int x = getData();
		System.out.println("x : " + x);
	}
}

public class Private {

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.test();

	}

}
