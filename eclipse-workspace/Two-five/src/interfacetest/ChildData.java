package interfacetest;

public class ChildData implements Data{ //클래스가 인터페이스를 상속받을 때는 implement 키워드 사용
	public void print() { //오버라이딩할 때 부모보다 엄격한 접근제어를 가질 수 없음
		// 부모 인터페이스에 있는 메소드를 오버라이딩할 때, 반드시 public 접근제어를 붙여야함
		System.out.println("I am child print");
	}

}
