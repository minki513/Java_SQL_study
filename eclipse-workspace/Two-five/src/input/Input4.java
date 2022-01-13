package input;
import java.io.IOException;
import java.io.FileInputStream;

public class Input4 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("data1.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
		}
		catch(IOException e){
			System.out.println(e);
		}
		finally {
			try {
				fis.close(); //예외 처리 필요
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
		System.out.println("main end");
	}

}
