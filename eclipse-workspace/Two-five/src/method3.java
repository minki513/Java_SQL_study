
public class method3 {

	public static void varArgTest(int ... v) //가변인수
	{
		System.out.println("number of arguments : " + v.length);
		for(int i=0; i<v.length; i++)
		{
			System.out.println(v[i]);
		}
	}
	
	public static int largerThanValue(int value, int ... v) //일반인수와 가변인수를 섞어서 사용할때는 가변인수를 맨 마지막에 적어야함
	// 가변인수 개수는 하나만 사용가능함
	{
		int sum = 0;
		for(int i=0;i<v.length;i++)
		{
			if (v[i] >=value)
				sum +=v[i];
					
		}
		return sum;
			
	}
	
	public static void main(String[] args) {
	//가변인수
		varArgTest();
		varArgTest(1);
		varArgTest(3,5);
		varArgTest(100, 200, 300);
		
		int largerSum;
		largerSum = largerThanValue(10, 5, 3, 11, 17, 2, 20, 15);
		System.out.println("sum : " + largerSum);
	}

}
