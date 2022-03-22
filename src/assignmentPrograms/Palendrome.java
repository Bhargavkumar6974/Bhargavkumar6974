package assignmentPrograms;

import java.util.Scanner;

public class Palendrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int x = sc.nextInt();
		int y = x;
		int r = 0, s = 0;

		while (x > 0) {
			r = x % 10;
			s = (s * 10) + r;
			x = x / 10;

		}

		if (y == s)

		{
			System.out.println("palandrome");

		} else {
			System.out.println("not a palandrome");

		}

	}

}