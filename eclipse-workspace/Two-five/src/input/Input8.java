package input;
import java.io.*;
public class Input8 {
//������ �����ϴ� ���α׷�
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
