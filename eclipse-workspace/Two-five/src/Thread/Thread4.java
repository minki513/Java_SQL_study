package thread;

class NumberThread4 extends Thread{
	String name;
	NumberThread4(String name){
		this.name = name;
	}
	public void run(){
		System.out.println(name + " starting");
		try {
			for (int i=0; i<10; i++) {
				Thread.sleep(300);
				System.out.println("In " + name + ":" + i);
		}
		}
		catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(name + " terminating");
	
}
}
public class Thread4 {

	public static void main(String[] args) {
		System.out.println("main starting");
		Thread th = new Thread(new NumberThread4("Number Thread"));
		th.start();
		for (int i=0; i<10; i++)
		{
			try {
				Thread.sleep(300);
				System.out.println("In main : " + i);
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("main ending");
	}
}
