package accessModifiers;

class example
{
	example(int a,int b)
	{
	System.out.println("addition of a and b is  "+(a+b));
    }
	example(double a,double b)
	{
		System.out.println("addition of float values a and b is  "+(a+b));
	}	
	example(char a,char b)
	{
		System.out.println("concatination of a and b is "+(a+b));
	}
    }
     


public class ParameterizedConstructor 
{

public static void main(String[] args)
{
 	example x=new example(17,18);
	example y=new example(421.545,1813.564);
	example z=new example('B','H');
	
}

}