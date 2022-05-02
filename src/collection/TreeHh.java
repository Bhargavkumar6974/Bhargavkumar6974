package collection;

import java.util.*;

public class TreeHh {

	public static void main(String[] args) {
		TreeSet<String> aa = new TreeSet<String>();

		SortedSet<String> ss = new TreeSet<String>(); //more of sorting list

		aa.add("ab");
		aa.add("bc");
		aa.add("cd");
		aa.add("de");
		aa.add("ef");

		ss.add("x");
		ss.add("xy");
		ss.add("z");
		ss.add("a");

		Iterator iterator = aa.iterator();
		Iterator iterator2 = ss.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

	}

}
