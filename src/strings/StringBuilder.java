package strings;

import java.lang.String;

public class StringBuilder {

	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("hello");
		System.out.println(a);
		a.append("world");
		System.out.println(a);

		for (int i = 0; i < a.length(); i++) {
			int x = i;

			System.out.println("   " + x + "   " + a.charAt(i));

		}
		a.insert(5, " windows ");
		System.out.println(a);
		System.out.println(a.toString());
	}

}
