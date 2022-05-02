package threadPRO;

class a11 implements Runnable {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(" a1 thread" + i);
			
			try
			{
				Thread.sleep(1000);
			}
	
			catch(Exception e)
			{
				System.out.println("interupt exception has occured ");
			}
			
		}
		System.out.println(" a1 thread exited");

	}
}

class b11 implements Runnable {
	public void run() {
		for (int j = 0; j <= 5; j++) {
			System.out.println(" b11 thread " + j);

		}
		System.out.println(" b11 thread exited");

	}
}

class c11 implements Runnable {
	public void run() {
		for (int k = 0; k <= 5; k++) {
			System.out.println(" c11 thread " + k);
		}
		System.out.println(" c11 thread exited");

	}
}

public class SetPriorityPro {

	public static void main(String[] args) {

		a11 ob1 = new a11();
		b11 ob2 = new b11();
		c11 ob3 = new c11();

		Thread t1 = new Thread(ob1);
		Thread t2 = new Thread(ob2);
		Thread t3 = new Thread(ob3);

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(2);

		t1.start();
		t2.start();
		t3.start();

	}

}
