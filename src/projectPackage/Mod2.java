package projectPackage;

import java.util.Iterator;
import java.util.LinkedList;

public class Mod2 {

	
	public void Computer_science(int x,String y,String z) {
		System.out.println("");
		LinkedList<String> cs= new LinkedList<String>();
if(x==2||y=="-----------------------"||z=="null")
		{
			System.out.println("  ");
		
		}
		cs.add("artificial intelligence");
		cs.add("machine learning");
		cs.add("python");
		cs.add("c and c++");
		cs.add("Java");
	
		
		 if(x==0||x==1)
		 { 
			 if(x==0||x!=1)
		 {
			  cs.add(y);
			
		 }
			 else if(x==1||x!=0)
		 {
			 cs.add(y);
			 cs.remove(z);
			 
			
		 }
			 else
			 {
				 System.out.println("enter 0 or 1 only");
			 }
		 }
		 
		 System.out.println("The books available in computer science department are as follow:");
			System.out.println(" ================================================== ");
		 Iterator iter = cs.iterator();

			while (iter.hasNext()) {
				System.out.println(iter.next());
			}
			/*
			 * System.out.
			 * println("The books available in computer science department are as follow:");
			 * System.out.println(" ================================================== ");
			 * System.out.println(cs.get(0)); System.out.println(cs.get(1));
			 * System.out.println(cs.get(2)); System.out.println(cs.get(3));
			 * System.out.println(cs.get(4)); System.out.println(cs.get(5));
			 */
			System.out.println("**which book u want to take or add**");

	}
	
	public void chemistry(int x,String y,String z) 
	{
		 
			System.out.println("");
			LinkedList<String> ch= new LinkedList<String>();
	      if(x==3||y=="-----------------------"||z=="null")
			{
				System.out.println("  ");
			
			}
		System.out.println("");
		

		// String chem[] = { "Organic chemistry", "Physical chemistry", "Bio chemistry",
		// "Inorganic chemistry",
		// "Polymer chemistry" };

		ch.add("Organic chemistry");
		ch.add("Physical chemistry");
		ch.add("Bio chemistry");
		ch.add("Inorganic chemistry");
		ch.add("Polymer chemistry");

		
		 if(x==0||x==1)
		 { 
			 if(x==0||x!=1)
		 {
			  ch.add(y);
			
			
		 }
			 else if(x==1||x!=0)
		 {
			 ch.add(y);
			 ch.remove(z);
			 
			 
		 }
			 else
			 {
				 System.out.println("enter 0 or 1 only");
			 }
		 }
		 
		System.out.println("The books available in chemistry department are as follow:");
		System.out.println(" ================================================== ");
		 Iterator iter = ch.iterator();

			while (iter.hasNext()) {
				System.out.println(iter.next());
			}
			
			System.out.println("**which book u want to take or add**");

	

	/*
	 * System.out.println(ch.get(0)); System.out.println(ch.get(1));
	 * System.out.println(ch.get(2)); System.out.println(ch.get(3));
	 * System.out.println(ch.get(4));
	 * 
	 * System.out.println("which book u want to take or add");
	 */
	}

	public void physics(int x,String y,String z) {
		System.out.println("");
		LinkedList<String> ph = new LinkedList<String>();
      if(x==10||y=="-----------------------"||z=="null")
		{
			System.out.println("  ");
		
		}
	System.out.println("");
	
	
	
	ph.add("Mechanics");
	ph.add("Dynamics");
	ph.add("Solid State Physics");
	ph.add("Astro Physics");
	ph.add("Electromagnetism");
	if(x==0||x==1)
	 { 
		 if(x==0||x!=1)
	 {
		  ph.add(y);
		
		

	 }
		 else if(x==1||x!=0)
	 {
		 ph.add(y);
		 ph.remove(z);
		 
		
	 }
		 else
		 {
			 System.out.println("enter 0 or 1 only");
		 }
	 }
	 
		
		// String phy[] = { "Mechanics", "Dynamics", "Solid State Physics", "Astro
		// Physics", "Electromagnetism" };

	
		
	
	
		System.out.println("The books available in Physics department are as follow:");
		System.out.println(" ================================================== ");
		
	 Iterator iter = ph.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		/*
		 * System.out.println(ph.get(0)); System.out.println(ph.get(1));
		 * System.out.println(ph.get(2)); System.out.println(ph.get(3));
		 * System.out.println(ph.get(4));
		 */

		System.out.println("**which book u want to take or add**");
	}

	public void biology(int x,String y,String z) {LinkedList<String> bio = new LinkedList<String>();
		 if(x==27||y=="-----------------------"||z=="null")
			{
				System.out.println("  ");
			
			}
	
		System.out.println("");
		
		// String bio[] = { "Zoology", "Botany", "Medical Science" };
		bio.add("Zoology");
		bio.add("Botany");
		bio.add("Medical Science");

		if(x==0||x==1)
		 { 
			 if(x==0||x!=1)
		 {
			  bio.add(y);
			
			  
		 }
			 else if(x==1||x!=0)
		 {
			 bio.add(y);
			 bio.remove(z);
			 
			 
		 }
			 else
			 {
				 System.out.println("enter 0 or 1 only");
			 }
		 }
		
		 Iterator iter = bio.iterator();
System.out.println("The books available in biology department are as follow:");
		System.out.println(" ================================================== ");
			while (iter.hasNext()) {
				System.out.println(iter.next());
			}
		
			System.out.println("**which book u want to take or add**");
			/*
			 * System.out.println(bio.get(0)); System.out.println(bio.get(1));
			 * System.out.println(bio.get(2));
			 */

	}

	public void Mathematics(int x,String y,String z) {LinkedList<String> math = new LinkedList<String>();
		 if(x==65||y=="-----------------------"||z=="null")
			{
				System.out.println("  ");
			
			}
		System.out.println("");
		
		// String maths[] = { "higher algebra", "Abstract Algebra", "Euler's formula of
		// mathematics",
		// "Algebraic theory of numbers" };

		math.add("higher algebra");
		math.add("Abstract Algebra");
		math.add("Euler's formula of mathematics");
		math.add("Algebraic theory of numbers");
		
		if(x==0||x==1)
		 { 
			 if(x==0||x!=1)
		 {
			  math.add(y);
			
							}
		 
			 else if(x==1||x!=0)
		 {
			 math.add(y);
			 math.remove(z);
			 
			 
				}
		 
			 else
			 {
				 System.out.println("enter 0 or 1 only");
			 }
		 }
		
		 			
		
		 Iterator iter = math.iterator();
	System.out.println("The books available in mathematics department are as follow:");
		 		System.out.println(" ================================================== ");
		 			while (iter.hasNext()) {
		 				System.out.println(iter.next());
		/*System.out.println(" ================================================== ");
		System.out.println(math.get(0));
		System.out.println(math.get(1));
		System.out.println(math.get(2));
		System.out.println(math.get(3));*/
		 			}
		 			System.out.println("**which book u want to take or add**");
	}

	
	
	public static void main(String[] args) {

	
		
	}

}
