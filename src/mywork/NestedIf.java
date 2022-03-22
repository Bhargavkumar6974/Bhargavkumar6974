package mywork;
import java.util.Scanner;

public class NestedIf
	{
		public static void main(String[] args)
		{

		    {
			int a;
			Scanner x=new Scanner(System.in);
		
			
		     System.out.println("enter ur marks");
			 a=x.nextInt();
			 
		
			  if(a>=65)
			  {
				  if(a==65)
				  {
				System.out.println("just pass");
			     
				  }
			else if(a>65&&a<85)
			  {
				System.out.println("average");
			   }
			else 
			{
				System.out.println("pass");
		    }
			  }
			  
			else
			  {
				  System.out.println("fail"); 
			    }  

		    }
	     }

     	}

