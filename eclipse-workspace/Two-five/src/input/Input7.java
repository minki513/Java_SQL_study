package input;
import java.io.*;
public class Input7 {

	public static void main(String[] args) {
		int i;
		try(FileInputStream fin = new FileInputStream("data1.txt")){
			//close 메소드 자체가 예외를 발생시키므로 try괄호 부분에 파일 스트림 생성 코드
			//이렇게 작성하면 스트림 연결을 끊기 위해 fin을 닫을 때 자동으로 예외처리됨
				do {
					i = fin.read();
					if(i != -1) System.out.print((char)i);
				}while(i != -1);
	}
				catch(IOException e) {
					System.out.println("Enter reading file.");
				}

	
}
}

