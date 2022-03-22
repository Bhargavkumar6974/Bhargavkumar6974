package assignmentPrograms;

import java.util.Scanner;

public class ReverseOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr size of array");
		int x = sc.nextInt();
		int arr[] = new int[x];
		System.out.println("enter elements of array");
		for (int i = 0; i < x; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("array entered  ");
		for (int i = 0; i < x; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n  ");
		System.out.print("array in reverse order  ");

		for (int i = x - 1; i >= 0; i--) 
		//starting from last by giving (-1 to 0) decrementing and printing it
			
		{

			System.out.print(arr[i] + "  ");
		}

	}

}
