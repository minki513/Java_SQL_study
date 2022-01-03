import java.util.Scanner;

public class Code9 {

	public static void main(String[] args) {
		// N을 입력받아서 while 반복문을 이용하여 n의 약수를 모두 출력
		Scanner scin = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scin.nextInt();
		int a = 1;
		while(a<=n)
		{
			if (n % a ==0)
				System.out.print(a + " ");
			a +=1;
		}
	scin.close();
	}

}
