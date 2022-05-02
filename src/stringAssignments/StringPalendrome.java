package stringAssignments;

public class StringPalendrome {

	public static void main(String[] args) {
	
	String S1="madam";String ReverseStringS3=new String();
	String S2="principal";String ReverseStringS4=new String(); 
	
	for(int i=S1.length()-1;i>=0;i--) //madam
	{
		ReverseStringS3+=S1.charAt(i); 
	}
	for(int i=S2.length()-1;i>=0;i--)
	{
		ReverseStringS4+=S2.charAt(i); 
	}
	
	if( S1.toLowerCase().equals(ReverseStringS3.toLowerCase()))
	{
		System.out.println("S1 is palandrome");
	}
	else
	{
		System.out.println("S1 is not palandrome");
	}
	if( S2.toUpperCase().equals(ReverseStringS4.toUpperCase()))
	{
		System.out.println("S2 is palandrome");
	}
	else
	{
		System.out.println("S2 is not palandrome");
	}
	
	}

}
