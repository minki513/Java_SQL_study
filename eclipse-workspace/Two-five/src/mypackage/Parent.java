package parentpkg;

public class Parent {
	private int id;
	public Parent(int id) {
		this.id = id;
	}
	public int getId() { //public를 사용하지 않으면 다른 패키지에서 접근 제어됨.
  //protected int getId	 -> 서로다른 패키지에 있는 자식 객체가 부모 클래스 멤버에 접근 할 수 있음.	
		return id;
	}
	public void show() {
		System.out.println("id : " + id);
	}
}
