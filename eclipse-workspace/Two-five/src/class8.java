class Books{
	private String title;
	private int price;
	
	Books(){}
	Books(String title, int price){
		this.title = title;
		this.price = price;
	}
	
	String getTitle() { //������ : �ν��Ͻ� ������ ���� �������� ���� �޼ҵ�/ title������
		return title;
	}
	
	int getPrice() { //price ������
		return price;
	}
	
	void setTitle(String title) { //������ : �ν��Ͻ� ������ ���� �����ϱ� ���� �޼ҵ�/ title������
		this.title = title;
	}
	void setPrice(int price) { //price ������
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
		bk.setPrice(27000); //������ ȣ��
		bk.setTitle("java programming 2"); //������ ȣ��
		System.out.println("title :" + bk.getTitle()); //������ ȣ��
		System.out.println("price :" + bk.getPrice()); //������ ȣ��

	}

}
