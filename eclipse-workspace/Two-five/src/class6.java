class Person{
	static int count;
	String name;
	
	Person(){
		count++;
	}
	
	static void printCount() { //static �޼ҵ忡���� static����� ����� �� �ִ�.
		// non-static �޼ҵ忡���� not-static��� �Ǵ� static ��� ��� ����� �� �ִ�. 
		System.out.println("count : "+ count);
	}
}
public class class6 {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person.printCount();  //Ŭ����.�޼ҵ��()
		p1.printCount(); //�ν��ͽ���.�޼ҵ�()
		p2.printCount();

	}
}
