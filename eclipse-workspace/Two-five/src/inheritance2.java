package javacode;

class Person{
	private String name;
	private String email;
	
	Person(){}
	Person(String name){
		this.name = name;
	}
	Person(String name, String email){
		this(name);
		this.email = email;
	}

}

class Student extends Person{ //this와 super 둘중에 하나만 한번 이용해야함
	private int score;
	private int year;
	
	Student(){}
	Student(String name, String email){
		super(name, email);
	}
	Student(String name, String email, int score){
		this(name, email);
		this.score = score;
	}
	Student(String name, String email, int score, int year){
		this(name, email);    //super(name, email);  //super(name, email, score);
		this.score = score;   						//this.year = year;
		this.year = year;
	}
}

public class inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
