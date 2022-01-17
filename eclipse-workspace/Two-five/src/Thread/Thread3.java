package thread;
//thread 클래스를 상속받는 스레드와 runnable인터페이스 구현을 이용한 스레드 수행하는 방법과 결과는 차이가 없음
//thread 클래스 외에 다른 클래스도 상속 받아야하는 경우에 runnable 인터페이스로 구현.
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
