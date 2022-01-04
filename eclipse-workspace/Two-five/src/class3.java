class Students{
	int no;
	String name;
	double score; //인스터스 변수들. 디폴트 값으로 초기화됨
	
	Students(int n){  //생성자가 하나라도 있으면 디폴트 생성자를 추가하지 않음
		no=n;
	}
	
	void printStudent() {
		System.out.println("no : " + no + ", name : " + name + ", score : " +score);
	}
}
public class class3 {

	public static void main(String[] args) {
		//Students s1 = new Students(); 에러가 발생함 이유는 디폴트 생성자가 자동으로 추가 되지 않기 때문이다.
		Students s2 = new Students(10);
		//s1.printStudent();
		s2.printStudent();

	}

}
