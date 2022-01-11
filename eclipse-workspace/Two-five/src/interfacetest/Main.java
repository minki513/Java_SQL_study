package interfacetest;

public class Main {

	public static void main(String[] args) {
		Data x = new ChildData();
		x.print();
		System.out.println("count : " +Data.count);

	}

}
