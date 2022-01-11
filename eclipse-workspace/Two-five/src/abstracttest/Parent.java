package abstracttest;

public abstract class Parent { //추상 메소드가 하나라도 있으면 반드시 추상 클래스로,
	public void show() {
		System.out.println("parent show()");
	}
	public abstract void print() ; // 추상 메소드 부분은 {} 부분없이 세미콜론으로 끝낸다
	// 부모 클래스에 메소드 이름은 존재하지만 메소드 내용은 필요하지 않은 경우 추상 메소드로 선언
}
