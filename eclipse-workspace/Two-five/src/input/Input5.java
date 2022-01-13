package input;
import java.io.IOException;
import java.io.FileInputStream;
public class Input5 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("data1.txt");
			int x;
			while((x = fis.read()) != -1)
				System.out.print((char)x);
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				fis.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
	}

}
