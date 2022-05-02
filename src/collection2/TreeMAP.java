package collection2;

import java.util.*;

public class TreeMAP {

	public static void main(String[] args) {

		TreeMap<Integer, String> aa = new TreeMap<Integer, String>();

		// no null only int is sorted ascding order but not string
		aa.put(1, "e");
		aa.put(4, "d");
		aa.put(3, "c");
		aa.put(2, "b");
		aa.put(5, "a");

		Set ss = aa.entrySet();
		Iterator it = ss.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
