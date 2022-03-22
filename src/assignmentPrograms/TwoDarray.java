package assignmentPrograms;

import java.util.Scanner;

public class TwoDarray {

	public static void main(String[] args)

	{
		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		int c[][] = new int[2][2];

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the array matrix elements for matrix 1");

		for (int i = 0; i < 2; i++) // rows
		{
			for (int j = 0; j < 2; j++) // coloums
			{
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("enter the array matrix elements for matrix 2");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				b[i][j] = sc.nextInt();

			}
		}

		System.out.println("\n");

		for (int i = 0; i < 2; i++) // rows
		{
			for (int j = 0; j < 2; j++) // coloums
			{
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		for (int i = 0; i < 2; i++) // rows
		{
			for (int j = 0; j < 2; j++) // coloums
			{
				System.out.print(c[i][j]);
			}
		}
	}
}
