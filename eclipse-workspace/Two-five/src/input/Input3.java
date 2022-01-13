package input;

import java.io.IOException;

public class Input3 {

	public static void main(String[] args) {
		int x;
		try {
			while((x = System.in.read()) != -1) {//읽어들일 문자가 없으면 -1반환
				System.out.print((char)x);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
