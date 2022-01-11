package interfacetest2;


interface WithDefault {
	int get();
	default int getNext() { //디폴트 메소드는 앞에 default 키워드를 붙여야함]
		//default 메소드는 추상 메소드가 아니라서 자식 클래스에서 오버라이딩할 필요가 없다
		int value = get() + 10; // 추상메소드를 호출
		//디폴트 메소드 내에서 같은 인터파에스에 있는 추상 메소드 호출할 수 있음
		return value;
	}
}

class Test1 implements WithDefault{
	public int get() { //부모의 추상메소드 오버라이딩
		return 100;
	}

}

class Test2 implements WithDefault{
	public int get() { //부모의 추상메소드 오버라이딩
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
