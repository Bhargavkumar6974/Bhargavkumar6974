package accessModifiers;

class xyz
{
private int p=10,q=20;

private void display()
{
System.out.println("this is a private method" +p+q);
}	
	
}
public class PrivateAM extends xyz
    {
	public static void main(String[] args) 
	{
	 
		xyz a= new xyz();
	/*	System.out.println(a.p); //compile TE
		System.out.println(a.q); //compile TE
		a.display();

	*/
		}
    }
