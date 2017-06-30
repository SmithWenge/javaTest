package wenge.thread;

public class ThreadTest6 {
	public static void main(String[] args) {
		Example2 example = new Example2();
		Thread t1 = new TheThread3(example);
		Thread t2 = new TheThread4(example);

		t1.start();
		t2.start();
	}
}

class Example2 {
//	synchronized修饰的方法如果是静态方法那么synchronized就不是作用于方法所在的对象了，而是方法所在对象的class对象。也就是类本身，对象有多个但是对象所对应的的class对象肯定是只有一个
	public synchronized static void execute() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("hello: " + i);
		}
	}

	public synchronized static void execute2() {
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

class TheThread3 extends Thread {
	private Example2 example;

	public TheThread3(Example2 example) {
		this.example = example;
	}

	@Override
	public void run() {
		this.example.execute();
	}
}

class TheThread4 extends Thread {
	private Example2 example;

	public TheThread4(Example2 example) {
		this.example = example;
	}

	@Override
	public void run() {
		this.example.execute2();
	}
}
