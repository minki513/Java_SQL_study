package abstracttest2;

public class Main {

	public static void main(String[] args) {
		Person t1 = new Teacher(112, "Alice", "Math");
		Person t2 = new Teacher(115, "Paul", "English");
		Person s1 = new Student(5, "Dvid", 2);
		Person s2 = new Student(7, "Cindy", 1);
		
		t1.show();
		System.out.println();
		t2.show();
		System.out.println();
		s1.show();
		System.out.println();
		s2.show();
	}

}
