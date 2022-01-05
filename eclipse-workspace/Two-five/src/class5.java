class Book{
	String title;
	int price;

	Book(){}
	Book(String title){
		this.title = title; //this는 현재 클래스를 이용하는 인스턴스를 가리키는 특별한 키워드
		//this키워드는 같은 클래스에 있는 변수 또는 메소드를 호출할 때 이용할 수 있다.
	}
	Book(String title, int price){
		this(title);  //this는 다른 생성자를 의미함, 하나의 매개변수를 갖는 두번째 생성자가 호출됨
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
