package java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmptySpaces {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("das", "", "fds", "");
		List<String> str2 = Arrays.asList("apple", "boy", "cat", "lion", "aa","toyota");

		System.out.println("------------------------------------------------------");
		long c = str.stream().filter(x -> x.isEmpty()).count();
		System.out.println("Empty Count: " + c);// count empty spaces
		System.out.println("------------------------------------------------------");

		long n = str2.stream().filter(x -> x.length() > 3).count(); // length more than 3
		System.out.println("length more than  3 is:"+n);
		System.out.println("------------------------------------------------------");
		List<String> str1 = Arrays.asList("apple", " ", "boy", "cat", "lion", "aa");
		long y = str1.stream().filter(x -> x.startsWith("a")).count();// counts letters with startng lttr
		// long y=str1.stream().filter(x->x.startsWith("a",2)).count();
		System.out.println(" starting with a: " + y);
		System.out.println("------------------------------------------------------");
		List<String> ntEmpty = str.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
		System.out.println(ntEmpty); // non empty is nt empty
		System.out.println("------------------------------------------------------");
		String coma=str2.stream().map(x->x.toUpperCase()).collect(Collectors.joining(","));
	//	String Sepr = str2.stream().collect(Collectors.joining(","));
		System.out.println(coma);
		System.out.println("------------------------------------------------------");
		List<Integer> nos = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		nos.stream().distinct().forEach(x -> System.out.println((int) Math.pow(x, 2)));
		// square of distint nos
		List<Integer> nos1 = nos.stream().map(x -> x * x).distinct().collect(Collectors.toList());
		System.out.println(nos1);
		// square of distint nos
		System.out.println("------------------------------------------------------");
		IntSummaryStatistics all = nos.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println(all);
		System.out.println("------------------------------------------------------");
	List<String> n2 = str2.stream().filter(x -> x.length() > 2).collect(Collectors.toList());
		System.out.println(n2);
		// length more than 2

	}

}
