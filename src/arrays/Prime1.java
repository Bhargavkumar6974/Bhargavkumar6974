package arrays;

import java.util.Scanner;

public class Prime1 {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int ar[] = new int[in];

		for (int i = 0; i<ar.length; i++) 
		{
			ar[i] = sc.nextInt();

		}

		for (int i = 0; i < ar.length; i++) {
			for (int j = 1; j <ar[i]; j++)
			{
				if ((ar[i] % j) == 0) {
					count++;
				}
			
			if (count == 2) {

				System.out.println(ar[i]);
				count = 0;
			}
		}

	}

}}