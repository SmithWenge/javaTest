package wenge.thread;

public class ThreadTest5 {
	public static void main(String[] args) {
		Example example = new Example();
		Thread t1 = new TheThread(example);
//		如果方法不是static的也没有没有下边的注释（只是一个对象）的话，输出结果仍然是顺序的，说明synchronize关键字是给对象上锁而不是给方法上锁。
//		example = new Example(); //加上这行代码的话，两个线程就会交替执行，说明synchronize关键字是作用于对象层面上的。
		Thread t2 = new TheThread2(example);

		t1.start();
		t2.start();
	}
}

class Example {
	
	public synchronized void execute() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("hello: " + i);
		}
	}

	public synchronized void execute2() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("world: " + i);
		}
	}
}

class TheThread extends Thread {
	private Example example;

	public TheThread(Example example) {
		this.example = example;
	}

	@Override
	public void run() {
		this.example.execute();
	}
}

class TheThread2 extends Thread {
	private Example example;

	public TheThread2(Example example) {
		this.example = example;
	}

	@Override
	public void run() {
		this.example.execute2();
	}
}
