package wenge.thread;

public class Sample {
	private int number;

	public synchronized void increase() {
//		这里必须用while，不能用if，因为线程在等待结束后也要进行判断。
		while (0 != number) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		number++;

		System.out.println(number);

		notify();
	}

	public synchronized void decrease() {
		while (0 == number) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		number--;

		System.out.println(number);

		notify();
	}
}
