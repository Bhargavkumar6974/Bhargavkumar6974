package accessModifiers;

class one
	{
		int a,b;
		void in()
		{ 
		System.out.println("values of a and b are "+a+" "+b);	
     	}
	}

 	class two
	{
		void display(int p, int q)
	   {
	    System.out.println("p and q values are  " +p+"  "+q);
	    }	
     }



public class PA
{

	public static void main(String[] args)
	{
		one x=new one();
		x.a=10;
		x.b=20;
	    x.in();
	    two y=new two();
	    y.display(151, 650);
	    

}
}