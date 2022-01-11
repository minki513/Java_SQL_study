package abstracttest2;

public class Student extends Person{
	private int year;
	
	Student(){}
	Student(int no, String name, int year){
		super(no, name);
		this.year = year;
	}
	
	void show() {
		System.out.println("student information");
		System.out.println("--------------------");
		System.out.println("number : " + getNo());
		System.out.println("name : " + getName());
		System.out.println("year : " + this.year);
	}
}
