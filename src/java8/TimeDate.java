package java8;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.*;

public class TimeDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LocalDate locald=LocalDate.now();
		System.out.println("  "+locald);
		LocalTime localt=LocalTime.now(ZoneId.of("Africa/Nairobi"));
		System.out.println(" "+localt);
//System.out.println("=============================================");		
		int today=locald.getDayOfMonth();
		int thisM=locald.getMonthValue();
		int thisY=locald.getYear();
					System.out.println(today+" "+thisM+" "+thisY);
System.out.println("=============================================");
		
		for(String r: ZoneId.getAvailableZoneIds())
		{
			System.out.println(r);
		}
		System.out.println("=============================================");	
		LocalDate mywish=LocalDate.of(2001,Month.MARCH,18);
		System.out.println(mywish);
		LocalTime mywish2=LocalTime.of(05,10,25,546);
		
		
		System.out.println(mywish2);
	}

}
