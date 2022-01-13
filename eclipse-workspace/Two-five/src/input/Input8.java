package input;
import java.io.*;
public class Input8 {
//파일을 복사하는 프로그램
	public static void main(String[] args) {
		int i;
		String inFile = "input1.txt";
		String outFile = "output.txt";
		
		try (FileInputStream fin = new FileInputStream(inFile);
				FileOutputStream fout = new FileOutputStream(outFile))
		{ 
			do {
				i = fin.read();
				if(i != -1) fout.write(i);
			}while(i != -1);
		
		}catch(IOException e) {
			System.out.println("File IO error "+ e);
		}

	}

}
