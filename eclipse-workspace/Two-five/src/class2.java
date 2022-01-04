class Student{
	int no; //학번
	String name; //이름
	double score; //성적
	
	void printStudent() {
		System.out.println("no : "+ no);
		System.out.println("name : "+ name);
		System.out.println("score : "+ score);
	}
	void updateScore(double change) {
		score +=change;
	}
}

public class class2 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.no=10;
		s1.name="Alice";
		s1.score=92.5;
		
		Student s2 = new Student();
		s2.no=20;
		s2.name="David";
		s2.score=88.2;
		
		s1.printStudent();
		s2.printStudent();
		s1.updateScore(+2.3);
		s2.updateScore(-1.5);
		System.out.println("--------------");
		s1.printStudent();
		s2.printStudent();
		

	}

}
