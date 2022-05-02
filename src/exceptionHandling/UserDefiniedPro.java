package exceptionHandling;

import java.util.Scanner;

public class UserDefiniedPro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		try {
			checkAge(age);
		}

		catch (Exception e) {
			System.out.println("  " + e);
		}
	}

	static void checkAge(int age) throws AgeException {
		if (age < 18) {
			throw new AgeException("below 18 not allowed");
		}

		else {

			System.out.println("above 18");
		}
	}

}
