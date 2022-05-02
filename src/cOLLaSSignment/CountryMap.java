package cOLLaSSignment;

import java.security.KeyStore.Entry;
import java.util.*;

public class CountryMap {

	HashMap<String, String> M1;

	public CountryMap() // contructor
	{
		M1 = new HashMap<String, String>();// wn evr crte obj in mn nw ob crts here //1 obj=1 obj
	}

	public HashMap<String, String> saveCountryCapital(String Country, String Capital) {
		M1.put(Country, Capital);
		return M1;
	}

	public String getCapital(String Country) {
		return M1.get(Country);
	}

	public String getCountry(String Capital) {
		Set<Map.Entry<String, String>> y=M1.entrySet();
		Iterator<Map.Entry<String,String>> it=y.iterator();
		while(it.hasNext())
		{
			Map.Entry<String,String> M3=it.next();
			if(M3.getValue().equals(Capital))
			
				return M3.getKey();
			
					}
		return null;
//return M2.get(Capital); //wrong
	}

	public HashMap<String, String> swapKeyValue() {
		HashMap<String, String> M2 = new HashMap<String, String>();

		Set<Map.Entry<String, String>> M3 = M1.entrySet();
		Iterator<Map.Entry<String, String>> it = M3.iterator();

		while (it.hasNext()) {
			Map.Entry<String, String> x = it.next();
			M2.put(x.getValue(), x.getKey());
		}
		return M2;
	}

	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();

		Set<Map.Entry<String, String>> M3 = M1.entrySet();
		Iterator<Map.Entry<String, String>> it = M3.iterator();

		while (it.hasNext()) {
			Map.Entry<String, String> x = it.next();
			list.add(x.getKey());
		}
		return list;
	}

	public static void main(String[] args) {

	}

}
