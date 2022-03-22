package accessModifiers;

 	class lmn
	{
	int p=10,q=20;
	void display()
	{
	System.out.println("this is a default method  " +p+"  "+q);
	}	
	}
	
 	
 	public class DefaultAM extends lmn
 	{
	    
		public static void main(String[] args) 
		{
		 
			lmn a= new lmn();
			System.out.println(a.p); //compile TE
			System.out.println(a.q); //compile TE
			a.display();
		}
	    }
 	    

