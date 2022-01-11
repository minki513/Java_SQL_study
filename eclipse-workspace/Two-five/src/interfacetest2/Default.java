package interfacetest2;


interface WithDefault {
	int get();
	default int getNext() { //����Ʈ �޼ҵ�� �տ� default Ű���带 �ٿ�����]
		//default �޼ҵ�� �߻� �޼ҵ尡 �ƴ϶� �ڽ� Ŭ�������� �������̵��� �ʿ䰡 ����
		int value = get() + 10; // �߻�޼ҵ带 ȣ��
		//����Ʈ �޼ҵ� ������ ���� �����Ŀ����� �ִ� �߻� �޼ҵ� ȣ���� �� ����
		return value;
	}
}

class Test1 implements WithDefault{
	public int get() { //�θ��� �߻�޼ҵ� �������̵�
		return 100;
	}

}

class Test2 implements WithDefault{
	public int get() { //�θ��� �߻�޼ҵ� �������̵�
		return 500;
		}
}
public class Default {

	public static void main(String[] args) {
		Test1 x = new Test1();
		System.out.println("x.getNext() : " + x.getNext());
		Test2 y = new Test2();
		System.out.println("y.getNext() : " + y.getNext());

	}

}
