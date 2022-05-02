package stringAssignments;

import java.lang.String;

public class LexicoGraphicCompare {

	public static void main(String[] args) {
		String a = "This is string 1";
		String b = "THIS IS STRING 1";

		int x = a.compareToIgnoreCase(b);

		if (x > 0) {
			System.out.println("a is greater then b");
		} else if (x < 0) {
			System.out.println("a is smaller then b");
		} else {
			System.out.println("a is equal to b");
		}

	}

}
