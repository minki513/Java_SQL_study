package input;

import java.io.IOException;

public class Input2 {

	public static void main(String[] args) {
		System.out.print("Enter one character : ");
		int x;
		try {
			x = System.in.read();
			System.out.println("You enterd " +x);
			System.out.println("You enterd " +((char)x));
			//read() �޼ҵ��� ��ȯ���� int�̴�. char������ �� ��ȭ�ؾ� �����ڷ� ��µ�
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
