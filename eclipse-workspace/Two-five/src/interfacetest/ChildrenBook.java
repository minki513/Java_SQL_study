package interfacetest;

class ChildrenBook implements Book{ //클래스가 인터페이스를 상속받을 때
	private String title;
	private String author;
	
	ChildrenBook(){}
	ChildrenBook(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public void printinfo() { //반드시 오버라이딩 해야함
		System.out.println("** Info for books **");
	}
	
	public void showTitle() { // 반드시 오버라이딩 해야함
		System.out.println("title : " + title);
		System.out.println("author : " + author);
	}
}
