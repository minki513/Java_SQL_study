class Book{
	String title;
	int price;

	Book(){}
	Book(String title){
		this.title = title; //this�� ���� Ŭ������ �̿��ϴ� �ν��Ͻ��� ����Ű�� Ư���� Ű����
		//thisŰ����� ���� Ŭ������ �ִ� ���� �Ǵ� �޼ҵ带 ȣ���� �� �̿��� �� �ִ�.
	}
	Book(String title, int price){
		this(title);  //this�� �ٸ� �����ڸ� �ǹ���, �ϳ��� �Ű������� ���� �ι�° �����ڰ� ȣ���
		this.price = price;
	}
}
public class class5 {

	public static void main(String[] args) {
		Book b1 = new Book("Peter Pan", 10000);
		Book b2 = new Book("Aladdin", 9000);
		Book b3 = new Book("minki");
		
		System.out.println(b1.title + "," + b1.price);
		System.out.println(b2.title + "," + b2.price);
		System.out.println(b3.title + "," + b3.price);
		
	}

}
