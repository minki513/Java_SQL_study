package javacode;
class Person2{
	private String name;
	Person2(){}
	Person2(String name){
		this.name = name;
	}
	String getName() {
		return name;
	}
	void print() {
		System.out.println("I am " + name);
	}
}

class Teacher extends Person2{
	private String subject;
	Teacher(){}
	Teacher(String name, String subject){
		super(name);
		this.subject = subject;
	}
	void print() {
		System.out.println("I am " + getName()+ "and I teach " + subject +".");
	}
}

class student2 extends Person2{
	private String year;
	student2(){}
	student2(String name, String year){
		super(name);
		this.year = year;
	}
	void print() {
		System.out.println("I am " + getName()+ "and I teach " + year +".");
	}
}

public class inheritance6 {

	public static void main(String[] args) {
		Person2 p1 = new Teacher("Alice", "Math");
		Person2 p2 = new student2("David", "Sophomore");
		p1.print();
		p2.print();
	}
}
