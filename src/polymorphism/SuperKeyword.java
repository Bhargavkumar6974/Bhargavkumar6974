package polymorphism;

class xxx1 {
	xxx1() {
		System.out.println("this is a constructor");

	}

	int a = 10;

	public void disp() {
		System.out.println("this is a parent class called by super keyword in child class");
	}

}

class yyy1 extends xxx1 {
	int a = 20;

	public void disp()

	{
		System.out.println("value of a in child class is  " + a);
		System.out.println("this is child class that has overriden the parent class");
		System.out.println("old value of a in immediate parent class is  " + (super.a));
		super.disp();

	}
}

public class SuperKeyword {

	public static void main(String[] args) {

		yyy1 obj = new yyy1();
		obj.disp();

	}

}
