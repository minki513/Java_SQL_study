package interfacetest2;

interface Static{
	int get();
	static int getData() {
		return 100;
	}
}

public class WithStatic {
	public static void main(String[] args) {
		System.out.println("static.getData() : " + Static.getData());
		// static �޼ҵ�� Ŭ������.�޼ҵ�� ȣ���� �� ����.
	}
	
}
