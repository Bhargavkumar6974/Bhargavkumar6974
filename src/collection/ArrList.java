package collection;

import java.util.*;

public class ArrList {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();// safe constructor//arrylst is not synzcronized hence nt thread safe
//index based slow //shifting method //less memory
		ar.add("abcd");
		ar.add("ef");
		ar.add("gh");
		ar.add("ij");
		ar.add("kl");
		ar.add("mn");

		System.out.println(" " + ar.get(0));
		System.out.println(" " + ar.get(4));
		System.out.println(" " + ar.get(3));
		System.out.println(" " + ar.get(2));

	}

}
