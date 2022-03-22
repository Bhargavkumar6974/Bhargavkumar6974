package inheritence;

interface x
{
	 static final int a=10,b=20;
	abstract void disp(); 
	}
interface y
{
	static final double p=45.6,q=67.90;
	abstract void disp2();
}


class ch implements x,y
{
 public void disp()
 {
	 System.out.println("addition of a and b is  "+(a+b));
 }
 public void disp2()
 {
 System.out.println("addition of p and q is  "+(p+q));	
 }
}


public class MultipleInheritnce extends ch{

	public static void main(String[] args)
	{
	ch xyz=new ch();
	xyz.disp();
	xyz.disp2();
	}

}

