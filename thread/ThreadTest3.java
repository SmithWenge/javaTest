package wenge.thread;

public class ThreadTest3 {
	public static void main(String[] args) {
		Runnable r = new Thread3();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}
}

class Thread3 implements Runnable {

	int i;
	
	@Override
	public void run() {
		
//		i是成员变量和局部变量的结果是不一样的
//		对于i是成员变量的时候，所有线程共享这一个成员变量，不管有几个线程只要i加到了10就会终止线程，所以最后的结果一定只有10个。
//		对于i是一个局部变量时，每个线程都会有一份局部变量的拷贝，并且线程与线程之间是互不影响的
//		int i = 0;
		
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