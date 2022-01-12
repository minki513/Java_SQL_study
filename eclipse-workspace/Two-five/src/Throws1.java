package javacode;

public class Throws1 {

	public static void makeArray() throws ArrayIndexOutOfBoundsException 
	{ //makeArray()���� ArrayIndexOutOfBoundsException�� �߻��ϸ� makeArray()��
	 //ȣ���� ������ ���� ó���϶�� �ǹ�
		int A[]= new int[3];
		
		A[0] = 10;
		A[1] = 20;
		A[2] = 30;
		A[3] = 40;
		//A[4] = 50;
	}
	public static void main(String[] args) {

		System.out.println("main starts");
		try {
			makeArray(); //����ó��
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception message : " +e.getMessage());
		}
		
		System.out.println("main ends");
	}

}
