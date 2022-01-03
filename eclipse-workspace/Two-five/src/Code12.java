import java.util.Scanner;

public class Code12 {

	public static void main(String[] args) {
		// 소수/합성수 판별
		Scanner scin = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scin.nextInt();
		int count = 0;
		for(int i =1; i <=n; i++)
		{
			if (n % i ==0)
				count ++;
		}
		if (count ==2)
			System.out.println(n + "는 소수입니다");
		else
			System.out.println(n + "는 합성수입니다");
		scin.close();
	}
	

}
