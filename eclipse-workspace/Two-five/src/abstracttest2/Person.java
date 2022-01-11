package abstracttest2;

public abstract class Person {
	private int no;
	private String name;
	
	Person(){}
	Person(int no, String name){
		this.name =name;
		this.no= no;
	}
	
	int getNo() {
		return no;
	}
	String getName() {
		return name;
	}
	
	abstract void show();
	
}
