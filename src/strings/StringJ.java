package strings;

import java.util.StringJoiner;

public class StringJ {

	public static void main(String[] args) {

		StringJoiner ss = new StringJoiner(",");//ly delim
		StringJoiner cc = new StringJoiner(" , ", " [", "]");// delim,pref,suf

		ss.add("hello");
		ss.add("world");
		ss.add("windows");

		cc.add("This");
		cc.add("a");
		cc.add("java");
		cc.add("code");

		System.out.println("  " + ss);
		System.out.println("  " + cc);
		StringJoiner mergedStr = ss.merge(cc);
		System.out.println("  " + mergedStr);
	}

}
