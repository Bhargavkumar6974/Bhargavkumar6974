package polymorphism;

class x1 {
	public void enter(int x, int y) {
		System.out.println("entered values in integer are  " + x + "  " + y);
	}

	public void enter(int z) {
		System.out.println("entered value is  " + z);

	}

	public void enter(double x, double y) {
		System.out.println("entered values in double are  " + x + "  " + y);

	}

	public void enter(char x, char y) {
		System.out.println("entered char are  " + x + "  " + y);

	}

}

public class MethodOverloading {

	public static void main(String[] args) {

		x1 obj = new x1();
		obj.enter(17, 18);
		obj.enter(343.54, 23.32);
		obj.enter('B', 'K');
		obj.enter(17);

	}

}
