package input;
import java.io.*;
public class Input7 {

	public static void main(String[] args) {
		int i;
		try(FileInputStream fin = new FileInputStream("data1.txt")){
			//close �޼ҵ� ��ü�� ���ܸ� �߻���Ű�Ƿ� try��ȣ �κп� ���� ��Ʈ�� ���� �ڵ�
			//�̷��� �ۼ��ϸ� ��Ʈ�� ������ ���� ���� fin�� ���� �� �ڵ����� ����ó����
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

