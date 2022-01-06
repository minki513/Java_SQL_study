package childpkg;
import parentpkg.Parent;

public class Child extends Parent{
	private int data;
	public Child(int id, int data) {
		super(id);
		this.data = data;
	}
	public void show() {
		System.out.println("id : " + getId());
		System.out.println("data : " + data);
	}
}
