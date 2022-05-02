package collection;
import java.util.*;

public class LkdList {

	public static void main(String[] args) {
	
		LinkedList <String> ss=new LinkedList <String>();
		
		ss.add("hello");
		ss.add("world");
		ss.add("this");
		ss.add("is");
		ss.add("windows"); //dynamic memory not index// not shifting based //iteration and deletion fast
		
		System.out.println(ss.get(4));
		System.out.println(ss.get(2));
		System.out.println(ss.get(3));
		System.out.println(ss.get(1));
	}

}
