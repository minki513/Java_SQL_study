import java.util.Scanner;

public class Code10 {

	public static void main(String[] args) {
		// �ϳ��� ���� ������ �Է¹޾Ƽ� �� �ڸ����� ��� ���
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
