package javacode;

public class Try_Catch2 {

	public static void main(String[] args) {
		int a = 5,b=0, c;
		int A[] = new int[3];
		
		try {
			A[3]=100;
			c = a/b;
			
		}
		catch(ArithmeticException e) { //���⿡ �ɸ�
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		catch(Exception e) { //Exception Ŭ������ ��� ���ܸ� ����
			System.out.println("���� �ε����Դϴ�.");
		}
		//catch����� ������� Ȯ���� �����⶧���� ����Ŭ������ Exception Ŭ������ ����
		//catch ��ȣ�� �ִ� ���� ���� ��Ӱ��谡 �����Ǹ� ���� ���ܸ� �� ���߿� �������
		
		finally { //������ �����ϴ� �ڵ�
			System.out.println("finally ����");
		}

	}

}
