package stringAssignments;

import java.util.*;

public class DuplicateValuesString {

	public static void main(String[] args) {
		String s1 = new String("hello world helloWindows");// case sen
		StringBuffer s2 = new StringBuffer();
		int i = 0;
		for (i = 0; i < s1.length(); i++) {
			char C = s1.charAt(i);
			int x = s1.indexOf(C, i + 1);
			if (x == -1) { // means not present in entire string
				s2.append(C);//exc to Strbuf

			}

		}
		System.out.println(s2);
	}

}
