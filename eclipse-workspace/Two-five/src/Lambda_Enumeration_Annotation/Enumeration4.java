package lambda_enumeration_annotation;

enum Cards4{
	HEART, CLUB, SPADE, DIAMOND	
}
public class Enumeration4 {

	public static void main(String[] args) {
		Cards cd1, cd2, cd3;
		
		for(Cards4 c : Cards4.values())
			System.out.println(c + " : " + c.ordinal());
		//ordinal() 열거형 상수가 정의된 순서를 반환(0부터시작)
		
		cd1 = Cards.HEART;
		cd2 = Cards.SPADE;
		cd3 = Cards.HEART;
		
		if(cd1.compareTo(cd2) <0)
			System.out.println("cd1 < cd2");
		else
			System.out.println("cd1 > cd2");
		
		if(cd1.compareTo(cd3) ==0)
			System.out.println("cd1 == cd3");
		else
			System.out.println("cd1 != cd3");
	}

}
