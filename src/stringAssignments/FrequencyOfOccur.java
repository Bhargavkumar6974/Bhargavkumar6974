package stringAssignments;

public class FrequencyOfOccur {

	public static void main(String[] args) {

		String string = "hellow world";

		for (char p = 'a'; p <= 'z'; p++) {int count = 0;
			
			
			for (int i = 0; i < string.length(); i++) {
			
				if (p == string.charAt(i)) {
					count++;
				
				}	System.out.println(p + "  " + count);

			
			}}
		
	}

}
