import java.util.Scanner;

public class Code7 {

	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		System.out.print("Enter three numbers : ");
		int a = scin.nextInt();
		int b = scin.nextInt();
		int c = scin.nextInt();
		
		int max = 0;
		if (a>b)
			max = a;
		else
			max = b;
		
		if (c>max)
			max = c;
		
		System.out.println("max : " + max);
		scin.close();

	}

}
