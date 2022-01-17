package thread;

class Priority2 implements Runnable{
	Thread thrd;
	static String currentName;
	int count;
	static boolean stop = false;
	
	Priority2(String name){
		thrd = new Thread(this, name);
		count = 0;
		currentName = name;
	}
	public void run() {
		System.out.println(thrd.getName() + " starting");
		do {
			count ++;
		}while(stop ==false && count < 10000000);
		stop = true;
		System.out.println(thrd.getName() + " terminationg.");
	}
}
public class Thread7 {

	public static void main(String[] args) {
		Priority2 mt1 = new Priority2("Max");
		Priority2 mt2 = new Priority2("Min");
		Priority2 mt3 = new Priority2("Norm");
		
		mt1.thrd.setPriority(Thread.MAX_PRIORITY);
		mt1.thrd.setPriority(Thread.MIN_PRIORITY);
		mt1.thrd.setPriority(Thread.NORM_PRIORITY);
		mt1.thrd.start();
		mt2.thrd.start();
		mt3.thrd.start();
		
		try {
			mt1.thrd.join();
			mt2.thrd.join();
			mt3.thrd.join();
		}
		catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("\nHigh priority count : " +mt1.count);
		System.out.println("Min priority count : " +mt2.count);
		System.out.println("Norm priority count : " +mt3.count);
	}
	//항상 High priority가 가장 cpu를 많이 점유하는 것은 아니다. 

}
