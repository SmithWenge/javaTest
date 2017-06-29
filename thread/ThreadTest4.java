package wenge.thread;

public class ThreadTest4 {
	public static void main(String[] args) {
		Runnable r = new Thread4();
		Thread t1 = new Thread(r);
		
		r = new Thread4();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}
}

class Thread4 implements Runnable {

	int i;
	
	@Override
	public void run() {
		
		while(true) {
			System.out.println("number = " + i++);
			
			try {
				Thread.sleep((long)(Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(10 == i) {
				break;
			}
		}
	}
}