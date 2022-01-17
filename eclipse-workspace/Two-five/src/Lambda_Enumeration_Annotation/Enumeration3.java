package lambda_enumeration_annotation;

enum Cards3{
	HEART(10), CLUB(20), SPADE(30), DIAMOND(40);
	private int val;
	Cards3(int v){val = v;}
	int getVal() {return val;}
}
public class Enumeration3 {

	public static void main(String[] args) {
		Cards3 cd;
		System.out.println("Value of SPADE : " + Cards3.SPADE.getVal());
		System.out.println("----------------");
		System.out.println("All values of Cards");
		
		for (Cards3 c: Cards3.values())
			System.out.println(c + " value : " + c.getVal());

	}

}
