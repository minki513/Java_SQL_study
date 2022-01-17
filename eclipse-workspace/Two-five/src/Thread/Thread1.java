package thread;

class NumberThread extends Thread{
	public void run(){
		for (int i=0; i<=26; i++)
			System.out.print(i);
	}
}
public class Thread1 {

	public static void main(String[] args) {
		Thread t = new NumberThread();
		t.start();
		for(char ch ='A'; ch<='Z'; ch++)
			System.out.print(ch);
	}
}
