package input;
import java.io.*;
public class Input12 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		InputStreamReader reader = null; //보조 스트림 클래스
		try {
			fis = new FileInputStream("data1.txt");
			reader = new InputStreamReader(fis);
			int x;
			while((x = reader.read()) != -1)
				System.out.print((char)x);
		}
		catch(IOException e) {
			e.printStackTrace();
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
