package interfacetest;

class ChildrenBook implements Book{ //Ŭ������ �������̽��� ��ӹ��� ��
	private String title;
	private String author;
	
	ChildrenBook(){}
	ChildrenBook(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public void printinfo() { //�ݵ�� �������̵� �ؾ���
		System.out.println("** Info for books **");
	}
	
	public void showTitle() { // �ݵ�� �������̵� �ؾ���
		System.out.println("title : " + title);
		System.out.println("author : " + author);
	}
}
