package thread;

class Priority extends Thread{
	String name;
	Priority(String name){
		this.name = name;
	}
	public void run() {
		System.out.println(name + " starting");
	try {
		for(int i=0; i<10; i++) {
			Thread.sleep(300);
			System.out.println("In "+ name+ ":" + i + " (priority : " + getPriority() + ")");
		}//스레드의 디폴트 우선순위는 5이다.
	}catch (InterruptedException e) {
		System.out.println(e);
	}
	System.out.println(name + " terminating");
}
}
public class Thread6 {

	public static void main(String[] args) {
		System.out.println("main starting");
		Thread th = new Thread(new Priority("Priority Thread"));
		th.start();
		for (int i=0; i<5; i++) {
			try {
				Thread.sleep(300);
				System.out.println("in main : " +i);
			}catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("main ending");
	}

}
