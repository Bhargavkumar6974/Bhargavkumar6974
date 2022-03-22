package arrays;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		int in,count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		in = sc.nextInt();

		for (int i = 1; i <=in; i++) {
			if (in % i == 0) //PN only / by 1 and itself
			{
				count++;
			}
		}
		if (count == 2) {
			System.out.println("prime no");
		} else {
			System.out.println("not a prime");

		}

	}

}
