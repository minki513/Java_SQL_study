class Studentss{
	static int numberOFStudent; //Ŭ���� ���� = �������� : ��� �ν��Ͻ��� �����ϴ� Ŭ������ �� ���� �����Ǵ� ����
	String name; //�ν��Ͻ� ����
	double score; //�ν��Ͻ� ����
	
	Studentss(){
		numberOFStudent ++;
	}
	
	Studentss(String n, double s){
		numberOFStudent ++;
		name = n;
		score =s;
	}
	
	void print() {
		System.out.println("name : " + name);
		System.out.println("score : " + score);
		System.out.println("numberOFStudent : " + numberOFStudent);
		
	}
}
public class class4 {

	public static void main(String[] args) {
		Studentss s1 = new Studentss("Alice", 90.5);
		Studentss s2 = new Studentss("David", 88.3);
		Studentss s3 = new Studentss("Cindy", 77.1);

		s1.print();
		s2.print();
		s3.print();	
		
		Studentss s4 = new Studentss("aa", 90.5);
		s4.print();
		Studentss s5 = new Studentss("bb", 88.3);
		s5.print();
		Studentss s6 = new Studentss("cc", 77.1);
		s6.print();	
	}

}
