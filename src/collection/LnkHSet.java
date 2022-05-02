package collection;

import java.util.*;

public class LnkHSet {

	public static void main(String[] args) {

		LinkedHashSet lk = new LinkedHashSet(); //iteration same sequence

		lk.add("ar");
		lk.add("br");
		lk.add("ac");
		lk.add("adf");
		lk.add("zxwr");
		lk.add("ed");
		lk.add("hy");

		Iterator iter = lk.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
