package collection;

import java.util.LinkedList;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("");
		LinkedList <String> cs=new LinkedList <String>();
			
			cs.add("artificial intelligence");
			cs.add("machine learning");
			cs.add("python");
			cs.add("c and c++");
			cs.add("Java");
			 StringBuffer sb = new StringBuffer();
		      
		      for (String s : cs) {
		         sb.append(s);
		         sb.append(" ");
		      }
		      String str = sb.toString();
		      System.out.println(str);
	}

}
