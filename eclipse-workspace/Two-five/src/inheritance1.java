package javacode;

class Person{
	private String name;
	private String phone;
	
	Person(){}
	Person(String name, String phone){
		this.name= name;
		this.phone = phone;
		}
	void printPerson() {
		System.out.println("name : "+name);
		System.out.println("phone : "+phone);
	}
}

class Student extends Person{  //클래스 student는 클래스 Person을 상속받음
	private int score;
	Student(){}
	Student(String name, String phone, int score){
		super(name, phone); //super는 부모 생성자를 호출하는 키워드이다.
		this.score = score;
	}
	void printStudent() {
		printPerson();
		System.out.println("score : " +score);
	}
}

public class inheritance1 {

	public static void main(String[] args) {
		Student s = new Student("Alice", "010-111-1111", 90);
		s.printStudent();

	}

}
