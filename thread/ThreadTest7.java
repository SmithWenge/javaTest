package wenge.thread;

public class ThreadTest7 {
	public static void main(String[] args) {
		Example3 e = new Example3();
		TheThread5 t1 = new TheThread5(e);
		// e = new Example3();
		TheThread6 t2 = new TheThread6(e);

		t1.start();
		t2.start();
	}
}

class Example3 {
	// 没有实际意义，任何一个对象都行。
	private Object object = new Object();

	public void execute() {
		// synchronized代码块
		synchronized (this) {
			for (int i = 0; i < 20; i++) {
				try {
					Thread.sleep((long) (Math.random() * 1000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("hello: " + i);
			}
		}

	}

	public void execute2() {
		synchronized (this) {
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
}

class TheThread5 extends Thread {
	private Example3 example;

	public TheThread5(Example3 example) {
		this.example = example;
	}

	@Override
	public void run() {
		this.example.execute();
	}
}

class TheThread6 extends Thread {
	private Example3 example;

	public TheThread6(Example3 example) {
		this.example = example;
	}

	@Override
	public void run() {
		this.example.execute2();
	}
}
