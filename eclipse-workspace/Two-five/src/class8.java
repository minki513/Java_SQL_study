class Books{
	private String title;
	private int price;
	
	Books(){}
	Books(String title, int price){
		this.title = title;
		this.price = price;
	}
	
	String getTitle() { //접근자 : 인스턴스 변수의 값을 가져오기 위한 메소드/ title접근자
		return title;
	}
	
	int getPrice() { //price 접근자
		return price;
	}
	
	void setTitle(String title) { //변경자 : 인스턴스 변수의 값을 수정하기 위한 메소드/ title변경자
		this.title = title;
	}
	void setPrice(int price) { //price 변경자
		this.price = price;
	}
	
	void printBook() {
		System.out.println("title :" + title);
		System.out.println("price :" + price);
	}
}
public class class8 {

	public static void main(String[] args) {
		Books bk = new Books("java programming", 25000);
		bk.printBook();
		bk.setPrice(27000); //변경자 호출
		bk.setTitle("java programming 2"); //변경자 호출
		System.out.println("title :" + bk.getTitle()); //접근자 호출
		System.out.println("price :" + bk.getPrice()); //접근자 호출

	}

}
