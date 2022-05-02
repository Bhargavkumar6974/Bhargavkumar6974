package threadPRO;

import java.util.*;

class a implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);

			try {
				Thread.sleep(1000);
				;
			} catch (Exception e) {
				System.out.println("exception has occured");
			}

		}
		System.out.println("a thread exited");
	}

}

class b implements Runnable {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			                   System.out.println(i);
		}
		System.out.println("b thread exited");
	}
}

class c implements Runnable {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("c thread exited");
	}

}

public class Thread2ndType {

	public static void main(String[] args) {

		a thread1 = new a();
		b thread2 = new b();
		c thread3 = new c();
		Thread th1 = new Thread(thread1);
		Thread th2 = new Thread(thread2);
		Thread th3 = new Thread(thread3);
		th1.start();
		th2.start();
		th3.start();

	}

}
