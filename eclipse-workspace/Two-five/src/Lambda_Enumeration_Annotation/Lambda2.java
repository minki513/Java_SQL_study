package lambda_enumeration_annotation;

interface Test{
	boolean test(int n, int m);
}
public class Lambda2 {

	public static void main(String[] args) {
		Test t1 = (n,d) -> (n%d)==0;
		
		if(t1.test(10,5))
			System.out.println("5 is a factor of 10");
		
		if(!t1.test(10,3))
			System.out.println("3 is not a factor of 10");
		System.out.println();
		
		Test t2 = (n,m) -> (n<m);
		if(t2.test(3, 5))
			System.out.println("3 is less than 5");
		if(!t2.test(5, 3))
			System.out.println("5 is not less than 3");

	}

}
