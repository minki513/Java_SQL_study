package lambda_enumeration_annotation;

enum Cards{
	HEART, CLUB, SPADE, DIAMOND	
}
public class Enumeration1 {

	public static void main(String[] args) {
		Cards cd;
		cd = Cards.DIAMOND;
		System.out.println("Value of cd : " +cd);
		
		cd = Cards.SPADE;
		
		if(cd == Cards.SPADE)
			System.out.println("cd is SPADE.");
		
		switch(cd) {
		case HEART:
			System.out.println("Heard card");
			break;
		case CLUB:
			System.out.println("club card");
			break;
		case SPADE:
			System.out.println("spade card");
			break;
		case DIAMOND:
			System.out.println("Diamond card");
			break;
		}
	}

}
