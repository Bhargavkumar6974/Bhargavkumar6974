package accessModifiers;



class hello
{
	static String college;
	
	static 
	{
		System.out.println("this is a static block which executes first");
	}
	
	
	public static void in()
 {
	  college = "BVC";
 }
 hello(int r,String s)
{
	
	System.out.println("roll :" +r+"  name : "+s+"  college : "+college);
}
}


public class StaticMethod 
{

	public static void main(String[] args)
	{
	hello.in(); //without object by CAM
	hello h=new hello(17,"bhargav");
		
	}

}


