class Students{
	int no;
	String name;
	double score; //�ν��ͽ� ������. ����Ʈ ������ �ʱ�ȭ��
	
	Students(int n){  //�����ڰ� �ϳ��� ������ ����Ʈ �����ڸ� �߰����� ����
		no=n;
	}
	
	void printStudent() {
		System.out.println("no : " + no + ", name : " + name + ", score : " +score);
	}
}
public class class3 {

	public static void main(String[] args) {
		//Students s1 = new Students(); ������ �߻��� ������ ����Ʈ �����ڰ� �ڵ����� �߰� ���� �ʱ� �����̴�.
		Students s2 = new Students(10);
		//s1.printStudent();
		s2.printStudent();

	}

}
