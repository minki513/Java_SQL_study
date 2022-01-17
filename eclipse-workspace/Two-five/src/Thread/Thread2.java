package thread;

class NumberThread2 extends Thread{
	public void run(){
		for (int i=0; i<=26; i++) {
			System.out.print(i);
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
}

class CharThread extends Thread{
	public void run(){
		for (char ch ='a'; ch<='z'; ch++) {
			System.out.print(ch);
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
}

public class Thread2 {

	public static void main(String[] args) {
		Thread t1 = new NumberThread2();
		Thread t2 = new CharThread();
		t1.start();
		t2.start();
		for(char ch ='A'; ch<='Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
	}
}
}
