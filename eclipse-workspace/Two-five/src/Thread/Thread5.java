package thread;

class ChildThread extends Thread{
	public void run(){
		for (char ch='A'; ch<='Z'; ch++)
			System.out.print(ch);
	}
}
public class Thread5 {

	public static void main(String[] args) {
		Thread th = new ChildThread();
		th.start();
		int i = 1;
		do {
			System.out.print("*");
			i++;
		} while (th.isAlive()); //th가 살아있는 동안 계속 루프 실행 
		//즉 스레드 th가 끝나야지만 루프가 끝나므로 main 스레드가 더 늦게 끝나게 됨
		//join()메소드로도 조절이 가능함
	}
}
