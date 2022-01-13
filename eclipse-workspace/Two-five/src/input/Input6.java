package input;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Input6 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt"); //���� �̸��� �߸� �Է��� ���
			System.out.print((char)fis.read());
			}
		catch(FileNotFoundException e) {
			System.out.println("input.txt�� ���� �����Դϴ�.");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				fis.close(); //���� ó�� �ʿ�
			}
			catch(IOException e) {
				System.out.println(e);
			}
			catch(NullPointerException e) {
				System.out.println("fis�� null���� ���� �ֽ��ϴ�.");
				//������ ��� fis�� �ʱⰪnull�� �״�� ���� �ִ� ���·� close()��
				//�õ��Ϸ��� �ϱ⶧���� ������ ����
		}

}
}
}
