package assignmentPrograms;

import java.util.Scanner;

public class CopingArraytoOtherArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");

		int x = sc.nextInt();

		int a1[] = new int[x];
		int a2[] = new int[a1.length];

		System.out.println("enter the array values");

		for (int i = 0; i < a1.length; i++) {
			a1[i] = sc.nextInt();
		}

		for (int i = 0; i < a1.length; i++) {
			a2[i] = a1[i];
		}
		System.out.println("array 1 is  ");
		System.out.println("\n");

		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}

		System.out.println("copied array 2 is  ");
		System.out.println("\n");

		for (int i = 0; i < a1.length; i++) {
			System.out.println(a2[i]);
		}

	}

}
