package threadPRO;


//type 1 through extends
class example extends Thread {
	// override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}

	}

}

public class SimpleTHREADprogram {

	public static void main(String[] args) {

		example thread = new example();
		thread.start();

	}

}
