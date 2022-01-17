package lambda_enumeration_annotation;

interface Test2{
	int getSum(int n);
}
public class Lambda3 {

	public static void main(String[] args) {
		Test2 t = (n) -> { //블록 람다 표현식
			int result =0;
			for(int i =1; i<=n; i++)
				result += i;
			return result;
		}; //반드시 세미콜론을 넣어야함
		System.out.println("sum from 1 to 10 is " +t.getSum(10));
		System.out.println("sum from 1 to 20 is " +t.getSum(20));
		System.out.println("sum from 1 to 30 is " +t.getSum(30));
	}

}
