package wenge.thread;

public class ThreadTest {
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		
		thread1.start();
		thread2.start();
		
		//这里调用run方法，不会以线程的方式执行，
		//必须是thread类调用start方法，然后再thread内部去调用run方法才是以线程的方式去执行的
		thread1.run();
		thread2.run();
	}
}

class Thread1 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("thread1---" + i);
		}
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("thread2---" + i);
		}
	}
}