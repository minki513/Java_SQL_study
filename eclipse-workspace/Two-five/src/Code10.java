import java.util.Scanner;

public class Code10 {

	public static void main(String[] args) {
		// 하나의 양의 정수를 입력받아서 각 자리수를 떼어서 출력
		Scanner scin = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scin.nextInt();
		
		while (n>0)
		{
			int m = n % 10;
		System.out.println(m);
		n /= 10;
		}
		scin.close();
	}

}
