package cOLLaSSignment;
import java.util.*;
public class ContryCapMProgram   {

	public static void main(String[] args) {
		
CountryMap cm=new CountryMap();


cm.saveCountryCapital("India", "Delhi");
cm.saveCountryCapital("Japan", "Tokyo");
cm.saveCountryCapital("usa", "Washington D.C.");
cm.saveCountryCapital("russia", "moscow");
cm.saveCountryCapital("ukraine", "kyiv");

System.out.println(cm.getCapital("russia"));
System.out.println(cm.getCountry("kyiv"));
System.out.println(cm.toArrayList());

HashMap <String,String> M2=cm.swapKeyValue();
System.out.println(M2);

	}

}
