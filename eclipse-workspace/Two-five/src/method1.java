import java.util.Scanner;

public class method1 {

	public static void findPower(int x, int y)
	{ //매개변수는 있고 반환값이 없는 경우
		int result =1;
		for(int a = 1; a<=y; a++)
		{
			result *= x;
		}
		System.out.println(x + "의 " + y + "제곱 : " + result);
	}
	
	public static int doSomething()
	{ //매개변수는 없고 반환값이 있는 경우
		int result2;
		result2 = 10*100;
		return result2;
		
	}
	
	static int add(int x, int y)
	{ //매개변수와 반환값이 모두 있는 경우
		int result;
		result = x+y;
		return result;
	}
	public static void main(String[] args) {
		
		int a=2, b=10;
		findPower(a,b);
		
		int x;
		x = doSomething();
		System.out.println("x : " + x);
		
		Scanner scin = new Scanner(System.in);
		System.out.print("Enter two integers: ");
		int c = scin.nextInt();
		int d = scin.nextInt();
		int f = add(c,d);
		System.out.println(c+ "+" +d+"=" +f);
		scin.close();
		

	}

}
