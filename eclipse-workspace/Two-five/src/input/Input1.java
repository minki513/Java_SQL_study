package input;
import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		System.out.print("Name : ");
		String name = scin.next(); //string ������ 
		System.out.print("Phone Number : ");
		String phone = scin.next();
		System.out.print("Age : ");
		int age = scin.nextInt();//int ���� ��
		System.out.print("Height : "); 
		float height = scin.nextFloat(); //float ���� ��
		System.out.print("Gender : ");
		char gender = scin.next().charAt(0); //string�� ù����
		
		System.out.println("Name : " +name);
		System.out.println("Phone : " +phone);
		System.out.println("age : " +age);
		System.out.println("height : " +height);
		System.out.println("gender : " +gender);
		
		scin.close();
	}

}
