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
		// static 메소드는 클래스명.메소드로 호출할 수 있음.
	}
	
}
