package lambda_enumeration_annotation;

enum Cards2{
	HEART, CLUB, SPADE, DIAMOND	
}
public class Enumeration2 {

	public static void main(String[] args) {
		Cards2 cd;
		System.out.println("Print out all cards");
		System.out.println("--------------------");
		Cards2 all[] = Cards2.values(); //열거 타입의 객체들을 배열로 만들어 반환
		for(Cards2 c : all)
			System.out.println(c);
		
		System.out.println("--------------------");
		cd = Cards2.valueOf("CLUB"); // 열거형에서 일치하는 열거형 상수를 리턴
		System.out.println("cd is " + cd);
		

	}

}
