package inheritence;

abstract class Exx1 {

	abstract void dis(int a, int b);

	abstract void dis2(double p, double q);

}

class A extends Exx1 {
	void dis(int a, int b) {

		System.out.println("entered values are " + a + " and " + b + " and addition is " + (a + b));
	}

	void dis2(double p, double q) {

		System.out.println("entered values are " + p + " and " + q + " and addition is " + (p + q));

	}

}

public class Abstract extends A {

	public static void main(String[] args) {
		A obj = new A();
		obj.dis(12, 14);
		obj.dis2(23.54, 23.23);
	}
}
