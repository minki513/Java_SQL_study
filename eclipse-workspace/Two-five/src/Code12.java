import java.util.Scanner;

public class Code12 {

	public static void main(String[] args) {
		// �Ҽ�/�ռ��� �Ǻ�
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
			System.out.println(n + "�� �Ҽ��Դϴ�");
		else
			System.out.println(n + "�� �ռ����Դϴ�");
		scin.close();
	}
	

}