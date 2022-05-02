package cOLLaSSignment;

import java.util.*;

public class StringAllPrint {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("russia");
		list.add("moscow");
		list.add("ukraine");
		list.add("kyiv");
		list.add("usa");
		list.add("washington DC");
		printAll(list);

	}

	public static void printAll(List<String> list) {
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
