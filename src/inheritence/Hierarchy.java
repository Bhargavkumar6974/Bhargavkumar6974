package inheritence;

class l {
	int a = 10, b = 20;
	double p = 21.42, q = 32.43;

	l() {
		System.out.println("this is class l constructor");
	}
}

class m extends l {

	m() {
		System.out.println("this is class m constructor");
	}

	void display1() {
		System.out.println("addition of a and b is  " + (a + b));
	}

}

class n extends l {

	n() {
		System.out.println("this is class n constructor");
	}

	void display2() {
		System.out.println("addition of p and q is  " + (p + q));
	}
}

public class Hierarchy {

	public static void main(String[] args) {

		m h1 = new m();
		n h2 = new n();
		h1.display1();
		h2.display2();
	}

}
