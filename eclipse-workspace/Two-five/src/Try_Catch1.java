package javacode;

public class Try_Catch1 {

	public static void main(String[] args) {
		int a=5, b=0, c;
		try { //���ܰ� �߻��� ���ɼ��� �ִ� �ڵ�
			c = a/b;
			System.out.println("C : " +c);
		}
		catch(ArithmeticException e) { //�ش� ���ܰ� �߻��� ��� �̸� ó���ϱ� ���� �ڵ�
			System.out.println("0���� ���� �� �����ϴ�.");
		}

	}

}
