package collection2;

import java.util.*;

public class HashMMap2 {

	public static void main(String[] args) {

		HashMap<String, String> aa = new HashMap<String, String>();
		aa.put(null,null);
		aa.put("india", "delhi");
		aa.put("britian", "london");
		aa.put("poland", "warsaw");
		aa.put("rusia", "moscow");
		aa.put("ukrain", "kyvie");

		for (String x : aa.keySet()) {
			System.out.println(x + " " + aa.get(x));
		}

	}

}
