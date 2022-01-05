class Person{
	static int count;
	String name;
	
	Person(){
		count++;
	}
	
	static void printCount() { //static 메소드에서는 static멤버만 사용할 수 있다.
		// non-static 메소드에서는 not-static멤버 또는 static 멤버 모두 사용할 수 있다. 
		System.out.println("count : "+ count);
	}
}
public class class6 {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person.printCount();  //클래스.메소드명()
		p1.printCount(); //인스터스명.메소드()
		p2.printCount();

	}
}
