package lambda_enumeration_annotation;

enum Cards2{
	HEART, CLUB, SPADE, DIAMOND	
}
public class Enumeration2 {

	public static void main(String[] args) {
		Cards2 cd;
		System.out.println("Print out all cards");
		System.out.println("--------------------");
		Cards2 all[] = Cards2.values(); //���� Ÿ���� ��ü���� �迭�� ����� ��ȯ
		for(Cards2 c : all)
			System.out.println(c);
		
		System.out.println("--------------------");
		cd = Cards2.valueOf("CLUB"); // ���������� ��ġ�ϴ� ������ ����� ����
		System.out.println("cd is " + cd);
		

	}

}
