package strings;

import java.lang.String;

public class StringsMethods {
	public static void main(String[] args) {
		String a = "this is a";
		String x = new String("hello world");
		String y = new String("   THIS IS CAP   ");
		String g = new String("this is a");
		String b = "this is a";
		String z = new String();
		char arr[] = { 'I', 'n', 'd', 'i', 'a' };
		// String methods A65
		System.out.println("  " + x.charAt(2)); // index position
		System.out.println("  " + x.concat("windows")); // concatination of another String
		System.out.println("  " + x.length()); // R size of string from 0 to n-1//sim to arry
		System.out.println("  " + x.replace("h", "H")); // replaces string alphbts(old,new)
		System.out.println("  " + y.toLowerCase());
		System.out.println("  " + x.toUpperCase());
		System.out.println("  " + z.isEmpty());// boolean emty=t
		System.out.println("  " + y.trim());
		System.out.println("  " + x.substring(2, 4));// start index to end index incd str bt exd ed
		System.out.println("  " + x.startsWith("h"));
		System.out.println("  " + y.endsWith(" "));
		System.out.println("  " + x.indexOf("o", 5));// n+1
		System.out.println("  " + x.lastIndexOf("o", 4));// n+1
		System.out.println("  " + x.equals("Hello world"));// a!A //C//
		System.out.println("  " + x.equalsIgnoreCase("Hello WoRld"));// ig cp/sml //C//
		System.out.println("  " + x.compareTo("hello world")); // (based unicode)0=sme/+v=s1>s2/-v=s1<s2 //LexicoG UC//
		System.out.println((a == b)); // t=same literal ref
		System.out.println((a == g)); // f=diff memory ref
		System.out.println(arr); // con ary to stng
	}
}
