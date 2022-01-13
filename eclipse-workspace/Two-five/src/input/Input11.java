package input;
import java.io.*;
public class Input11 {

	public static void main(String[] args) {
		char [] cbuf = {'J','A','v','A'};
		String lang = "Language";
		FileWriter fos = null;
		try {
			fos = new FileWriter("data2.txt");
			fos.write(cbuf);
			fos.write("\n--------------\n");
			fos.write(lang);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
			
		}

	}

}
