import java.util.Scanner;

public class Code9 {

	public static void main(String[] args) {
		// N�� �Է¹޾Ƽ� while �ݺ����� �̿��Ͽ� n�� ����� ��� ���
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
