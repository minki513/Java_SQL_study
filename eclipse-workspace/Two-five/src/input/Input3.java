package input;

import java.io.IOException;

public class Input3 {

	public static void main(String[] args) {
		int x;
		try {
			while((x = System.in.read()) != -1) {//�о���� ���ڰ� ������ -1��ȯ
				System.out.print((char)x);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
