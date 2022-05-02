package exceptionHandling;

public class TryAndCatchBlock {

	public static void main(String[] args) {
		int x = 100, y = 0;
     
		
		try {
			int z = x / y;
			System.out.println(" z value  is " + z);
		}

		catch (ArithmeticException e) {
			System.out.println(" y value  is 0 so integer cant be divided by 0 ");

		} finally {
			System.out.println(" this is finally block which will execute at all cost");
		}
	}

}
