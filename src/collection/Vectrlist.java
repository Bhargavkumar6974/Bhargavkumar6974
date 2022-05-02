package collection;

import java.util.*;

public class Vectrlist {

	public static void main(String[] args) {
		Vector<String> vv = new Vector<String>();//vectors are syncronized hence thread safe

		vv.add("hello");
		vv.add("world");
		vv.add("this");
		vv.add("is");
		
		System.out.println(vv.get(3));

		vv.add("windows");

		vv.add(3, "replacing is with IS");

		System.out.println(vv.get(3));

		System.out.println(vv.size());

	}

}
