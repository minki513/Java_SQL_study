package parentpkg;

public class Parent {
	private int id;
	public Parent(int id) {
		this.id = id;
	}
	public int getId() { //public�� ������� ������ �ٸ� ��Ű������ ���� �����.
  //protected int getId	 -> ���δٸ� ��Ű���� �ִ� �ڽ� ��ü�� �θ� Ŭ���� ����� ���� �� �� ����.	
		return id;
	}
	public void show() {
		System.out.println("id : " + id);
	}
}
