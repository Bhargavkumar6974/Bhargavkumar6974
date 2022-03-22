package mywork;
import java.util.Scanner;

public class Switch
	{
		public static void main(String[] args)
		{
		    {
			int a;
			Scanner x=new Scanner(System.in);
						
		     System.out.println("enter no from 0 to 6 value");
			 a=x.nextInt();
			 
			 switch(a)
			 {
			 case 0 : 
				 System.out.println("sunday");
				 break;
			 case 1 : 
				 System.out.println("monday");
				 break;
			 case 2 : 
				 System.out.println("tueday");
				 break;
			 case 3 : 
				 System.out.println("wednesday");
				 break;
			 case 4 : 
				 System.out.println("thursday");
				 break;
			 case 5 : 
				 System.out.println("friday");
				 break;
			 case 6 : 
				 System.out.println("saturday");
				 break;
			 default : 
				 System.out.println("error");
			
			 }
			 
		    }
		}
	}
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
		