package collection2;

import java.util.*;

public class HashMMap {

	public static void main(String[] args) {
		HashMap<Integer, String> aa = new HashMap<>();
		//hash map does not has ordered iteration
		aa.put(null, null);// hashmap can have null value
		aa.put(9, "jbk");
		aa.put(1, "pikachu");
		aa.put(5, "ronaldo");
		aa.put(44, "sachin");
		aa.put(32, "roman");

		Set ss = aa.entrySet();

		Iterator it = ss.iterator();

		while (it.hasNext()) {
			Map.Entry ee = (Map.Entry) it.next();
			System.out.println(ee.getKey() + " " + ee.getValue());
			System.out.println(it.next());
		}

	}

}
