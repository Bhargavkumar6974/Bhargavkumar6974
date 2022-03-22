package inheritence;

class AA //base 
{
int a=10,b=20;
	AA() //how is constructor a is called when not creating obj
	{
	System.out.println("this is class a constructor");
	}
	
}

class b extends AA//child
{
	b()
	{
		System.out.println("this is class b constructor");
	}
   void display()
  {
	System.out.println("addition of a and b is  "+(a+b));
  }	
}	


public class SingleInheritence extends b{

	public static void main(String[] args) 
	{
	b xyz=new b();
	xyz.display();
	
	}

}
