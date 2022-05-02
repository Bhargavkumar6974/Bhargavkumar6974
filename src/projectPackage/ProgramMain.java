package projectPackage;

import java.util.*;

public class ProgramMain {

	public static void main(String[] args)
	{
	int E=0;	
do {	
	Scanner xin = new Scanner(System.in);
	Scanner yin = new Scanner(System.in);
	Scanner zin = new Scanner(System.in);
	int x=0;
	String y="null",z="null";
E=0;
String name = null;
Mod2 obj=new Mod2();
		int Id = 0, sem = 0;
		System.out.println("         WELCOME TO E-LIBRABRY             ");
		System.out.println("========================================");
		System.out.println("Please Enter your 6 DIGITS COLLEGE-ID and PASSWORD along with the current Semester");
		Scanner in1 = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		Scanner in3 = new Scanner(System.in);
		Scanner in4 = new Scanner(System.in);

		System.out.println("----------------------------------------");

		System.out.println("User ID:");
		Id = in1.nextInt();
		System.out.println("password:");
		String password = in2.nextLine();
		if (Id > 99999 && Id <= 999999) 
		{
			if (password.equals("admin")) 
			{
				System.out.println("Student name:");
				name = in3.nextLine();

				System.out.println("Current Semester:");
				sem = in4.nextInt();
			} 
			else
			{
				System.out.println("wrong password");
			}
		}

		 else 
		{
			System.out.println("enter correct 6 digit user id");
		}
	
		if (Id > 99999 && Id <= 999999 && password.equals("admin")) 
		{

		Mod1 obj1 = new Mod1();
		obj1.getdata(name, Id, sem);
		obj1.setdata();
		Mod2 obj2 = new Mod2();

		System.out.println("-----------------------------------------");
		System.out.println("**------Main Menu------**");
		System.out.println("-----------------------------------------");
		System.out.println(" 1:Add Book or return book");
		System.out.println(" 2:View Book");
			System.out.println(" 3:Logout");
		System.out.println("----------------------------------------");
		System.out.println();
		System.out.println("Enter Your Choice : ");

		Scanner in5 = new Scanner(System.in);
		int i = in5.nextInt();
		if(i>3)
		{
		System.out.println("enter no between 1 to 5 only ");
		}
		
		if (i <= 3) 
		{
			if (i == 1) 
			{

				System.out.println(" Which Department books that u want to add/return: ");
				System.out.println(" ------------------------------------------- ");
				System.out.println(" 1.Computer_science: ");
				System.out.println(" 2.chemistry: ");
				System.out.println(" 3.physics: ");
				System.out.println(" 4.biology: ");
				System.out.println(" 5.Mathematics: ");
				System.out.println("----------------------------------------");
				System.out.println();
				System.out.println("Enter Your Choice : ");
				Scanner in7 = new Scanner(System.in);
				int bookin = in7.nextInt();
switch(bookin)
{

case 1:obj.Computer_science(2,"-----------------------",null);

System.out.println("--------------------------------------");
System.out.println("press 0 if u want to add book only");
System.out.println("press 1 if u want to add book and also remove a book  ");
//Scanner xin = new Scanner(System.in);
 x=xin.nextInt();
System.out.println("Enter book name : ");
//Scanner yin = new Scanner(System.in);
 y=yin.nextLine();
 System.out.println("do u want to read/remove any book name : ");
 System.out.println("Press enter if u dont want to remove any book");
// Scanner zin = new Scanner(System.in);
 z=zin.nextLine();
 
 obj.Computer_science(x,y,z);
 	if(x==0)
	{
 System.out.println(name+" "+Id+" "+" of sem "+sem+" has added "+y);
	}
	else if(x==1)
	{
		 System.out.println(name+"   Id"+Id+" "+" of sem "+sem+" has added "+y+" and removed "+z);

	}
	
	
		 

	        break;	 

case 2:obj.chemistry(3,"-----------------------",null);
System.out.println("--------------------------------------");
	System.out.println("press 0 if u want to add book only");
	System.out.println("press 1 if u want to add book and also remove a book  ");
	//Scanner yin = new Scanner(System.in);
	 x=xin.nextInt();
	System.out.println("Enter book name : ");
	//Scanner yin = new Scanner(System.in);
	  y=yin.nextLine();
	 System.out.println("do u want to read/remove any book name : ");
	 System.out.println("Press enter if u dont want to remove any book");
	 //Scanner zin = new Scanner(System.in);
	  z=zin.nextLine();
	 
	 obj.chemistry(x, y, z);
	 	if(x==0)
		{
	 System.out.println(name+" "+Id+" "+" of sem "+sem+" has added "+y);
		}
		else if(x==1)
		{
			 System.out.println(name+"   Id"+Id+" "+" of sem "+sem+" has added "+y+" and removed "+z);

		}
		
		
    break;	 
		
case 3:obj.physics(10,"-----------------------",null);
System.out.println("--------------------------------------");
	System.out.println("press 0 if u want to add book only");
	System.out.println("press 1 if u want to add book and also remove a book  ");
	//Scanner yin = new Scanner(System.in);
	 x=xin.nextInt();
	System.out.println("Enter book name : ");
	//Scanner yin = new Scanner(System.in);
	  y=yin.nextLine();
	 System.out.println("do u want to read/remove any book name : ");
	 System.out.println("Press enter if u dont want to remove any book");
	 //Scanner zin = new Scanner(System.in);
	  z=zin.nextLine();
	 
	 obj.physics(x, y, z); 	if(x==0)
		{
		 System.out.println(name+" "+Id+" "+" of sem "+sem+" has added "+y);
			}
			else if(x==1)
			{
				 System.out.println(name+"   Id"+Id+" "+" of sem "+sem+" has added "+y+" and removed "+z);

			}
			
			
    break;	 
case 4:obj.biology(27,"-----------------------",null);
System.out.println("--------------------------------------");
System.out.println("press 0 if u want to add book only");
System.out.println("press 1 if u want to add book and also remove a book  ");
//Scanner yin = new Scanner(System.in);
 x=xin.nextInt();
System.out.println("Enter book name : ");
//Scanner yin = new Scanner(System.in);
  y=yin.nextLine();
 System.out.println("do u want to read/remove any book name : ");
 System.out.println("Press enter if u dont want to remove any book");
 //Scanner zin = new Scanner(System.in);
  z=zin.nextLine(); obj.biology(x, y, z);	if(x==0)
	{
System.out.println(name+" "+Id+" "+" of sem "+sem+" has added "+y);
	}
	else if(x==1)
	{
		 System.out.println(name+"   Id"+Id+" "+" of sem "+sem+" has added "+y+" and removed "+z);

	}
	
	
 
 
    break;	 
case 5:obj.Mathematics(65,"-----------------------",null);
System.out.println("--------------------------------------");
System.out.println("press 0 if u want to add book only");
System.out.println("press 1 if u want to add book and also remove a book  ");
//Scanner yin = new Scanner(System.in);
 x=xin.nextInt();
System.out.println("Enter book name : ");
//Scanner yin = new Scanner(System.in);
  y=yin.nextLine();
 System.out.println("do u want to read/remove any book name : ");
 System.out.println("Press enter if u dont want to remove any book");
 //Scanner zin = new Scanner(System.in);
  z=zin.nextLine();
 
 obj.Mathematics(x, y, z); 	if(x==0)
	{
System.out.println(name+" "+Id+" "+" of sem "+sem+" has added "+y);
	}
	else if(x==1)
	{
		 System.out.println(name+"   Id"+Id+" "+" of sem "+sem+" has added "+y+" and removed "+z);

	}
	
	
    break;	 
    
default:
	System.out.println("--------------------------------------");
	System.out.println("enter number between 0 to 5 only");
    break;	 



}
				
				
				
				
				
			}

			else if (i == 2) {

				System.out.println(" Which Department books that u want to read: ");
				System.out.println(" ------------------------------------------- ");
				System.out.println(" 1.Computer_science: ");
				System.out.println(" 2.chemistry: ");
				System.out.println(" 3.physics: ");
				System.out.println(" 4.biology: ");
				System.out.println(" 5.Mathematics: ");
				System.out.println("----------------------------------------");
				System.out.println();
				System.out.println("Enter Your Choice : ");
				Scanner in6 = new Scanner(System.in);
				int depin = in6.nextInt();
				if(depin>5)
				{
				System.out.println("enter no between 1 to 5 only ");
				}
				
				if (depin <= 5) 
				{
					if (depin ==1)
					{

						obj2.Computer_science(2,"-----------------------","null");
					} 
					else if (depin  == 2) {

						obj2.chemistry(3,"-----------------------",null);
					}
					else if (depin  == 3)
					{
						obj2.physics(10,"-----------------------",null);
					} else if (depin  == 4)
					{
						obj2.biology(27,"-----------------------",null);
					} else if (depin  == 5) 
					{
						obj2.Mathematics(65,"-----------------------",null);
					}
				} 
				else {
					System.out.println("please enter options between 1 to 5 only ");
				}
			}
			
		} else if (i == 3) {

		} else 
		{
			System.out.println("please enter options between 1 to 3 only ");
			//System.exit(i);
		        break;
				}
		
System.out.println("--------------------------------------");
System.out.println("press 0 to continue logout");
Scanner in7=new Scanner(System.in);
     E=in7.nextInt();
} }while(E==0);
	
   

	

	
	}
}
