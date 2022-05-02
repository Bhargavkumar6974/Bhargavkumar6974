package strings;

public class SplitProgram {

	public static void main(String[] args) {

		String x = "hellow world this is window";
		String y[] = x.split(" ");

		for (int i = 0; i < y.length; i++) {
			System.out.println(" " + y[i]);
		}
	}

}
