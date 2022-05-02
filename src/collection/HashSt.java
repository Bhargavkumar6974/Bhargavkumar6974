package collection;
import java.util.*;

public class HashSt {

	public static void main(String[] args) {
		Set aa=new HashSet(); //iteration not ordered
		aa.add("a");
		aa.add("b");
		aa.add("c");
		aa.add("d");
		aa.add("e");
		aa.add("f");
					Iterator iterator = aa.iterator( );
			while(iterator.hasNext())
			{
			System.out.println(iterator.next());
			}
		
		
	}

}
