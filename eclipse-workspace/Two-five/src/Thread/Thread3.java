package thread;
//thread Ŭ������ ��ӹ޴� ������� runnable�������̽� ������ �̿��� ������ �����ϴ� ����� ����� ���̰� ����
//thread Ŭ���� �ܿ� �ٸ� Ŭ������ ��� �޾ƾ��ϴ� ��쿡 runnable �������̽��� ����.
class NumberThread3 implements Runnable{
	public void run(){
		for (int i=0; i<=26; i++)
			System.out.print(i);
	}
}
public class Thread3 {

	public static void main(String[] args) {
		Thread t = new Thread(new NumberThread3());
		t.start();
		for(char ch ='A'; ch<='Z'; ch++)
			System.out.print(ch);

	}

}
