package wenge.thread;

public class ThreadTest4 {
	public static void main(String[] args) {
		Runnable r = new Thread4();
		Thread t1 = new Thread(r);
		
//		重新声明一个对象的话，就又会打印20个结果。这是因为不是原来的对象了相对应的成员变量是分别在两个对象里的，所以当然也是不会相互影响的。所以会打印20个结果。
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