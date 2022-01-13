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
			//read() 메소드의 반환값은 int이다. char형으로 형 변화해야 영문자로 출력됨
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
