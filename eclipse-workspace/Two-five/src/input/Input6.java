package input;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Input6 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt"); //파일 이름을 잘못 입력한 경우
			System.out.print((char)fis.read());
			}
		catch(FileNotFoundException e) {
			System.out.println("input.txt는 없는 파일입니다.");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				fis.close(); //예외 처리 필요
			}
			catch(IOException e) {
				System.out.println(e);
			}
			catch(NullPointerException e) {
				System.out.println("fis가 null값을 갖고 있습니다.");
				//파일이 없어서 fis가 초기값null을 그대로 갖고 있는 상태로 close()를
				//시도하려고 하기때문에 나오는 예외
		}

}
}
}
