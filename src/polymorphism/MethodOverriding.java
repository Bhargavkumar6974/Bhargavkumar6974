package polymorphism;

class xx1 {
	public void disp() {
		System.out.println("this is a parent class");
	}

	public void enter(int x, int y) {

		System.out.println("entered values are " + x + "  " + y);
		System.out.println("subtraction in parent class is  " + (x - y));

	}
}

class yy1 extends xx1 {
	public void disp() {
		System.out.println("this is child class that has overriden the parent class");

	}

	public void enter(int x, int y) {
		System.out.println("addition in child class is  " + (x + y));

	}

}

public class MethodOverriding {

	public static void main(String[] args) {

		yy1 obj = new yy1();
		obj.disp();
		obj.enter(2, 170);

	}

}
