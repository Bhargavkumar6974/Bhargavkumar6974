package inheritence;

class ex1 {
	int a = 10, b = 20;

	ex1() {
		System.out.println("this is class a constructor");
	}
    }

class ex2 extends ex1 {
	double p = 21.42, q = 32.43;

	ex2() {
		System.out.println("this is class b constructor");
	}
    }

class ex3 extends ex2 {

	ex3(){
		System.out.println("this is class c constructor");
	}

	void display() 
	{
		System.out.println("addition of a and b is  "  +(a + b));
		System.out.println("addition of p and q is  "  +(p + q));
	}
    }

public class Multilevel extends ex3
{

	public static void main(String[] args) 
	{
		ex3 xyz=new ex3();
		xyz.display();
	}
    }
