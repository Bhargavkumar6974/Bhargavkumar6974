package collection2;

import java.util.*;

public class HashTABLE {

	public static void main(String[] args) {

		Hashtable<String, String> aa = new Hashtable<String, String>();

		aa.put(null,null);//Htable is synzd and thread safe and no null values 
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
