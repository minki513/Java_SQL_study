import java.util.Scanner;

public class method1 {

	public static void findPower(int x, int y)
	{ //�Ű������� �ְ� ��ȯ���� ���� ���
		int result =1;
		for(int a = 1; a<=y; a++)
		{
			result *= x;
		}
		System.out.println(x + "�� " + y + "���� : " + result);
	}
	
	public static int doSomething()
	{ //�Ű������� ���� ��ȯ���� �ִ� ���
		int result2;
		result2 = 10*100;
		return result2;
		
	}
	
	static int add(int x, int y)
	{ //�Ű������� ��ȯ���� ��� �ִ� ���
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
