package mywork;
import java.util.Scanner;

public class ElseIfLadder 
	{
		public static void main(String[] args)
		{

		    {
			int a,b,c;
			Scanner x=new Scanner(System.in);
			Scanner y=new Scanner(System.in);
			Scanner z=new Scanner(System.in);
			
		     System.out.println("enter a value");
			 a=x.nextInt();
			 System.out.println("enter b value");
			 b=y.nextInt();
			 System.out.println("enter c value");
			 c=z.nextInt();
		
			  if(a>b&&a>c)
			  {
				System.out.println("a is greatest");
			  }
			else if(b>a&&b>c)
			  {
				System.out.println("b is greatest");
			   }
			else if(c>a&&c>b)
			{
				System.out.println("c is greatest"); 
		    }
			else
			  {
				  System.out.println("all r equal"); 
			    }  

		    }
	     }

     	}

