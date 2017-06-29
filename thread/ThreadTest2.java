package wenge.thread;

public class ThreadTest2 {
	public static void main(String[] args) {
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for(int i = 0; i < 100; i++) {
//					System.out.println("hello" + i);
//				}
//			}
//		});
		
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
	
		thread.start();
	}
}

class MyThread implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("hello" + i);
		}
	}
}