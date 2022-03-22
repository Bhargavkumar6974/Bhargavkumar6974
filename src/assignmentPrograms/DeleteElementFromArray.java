package assignmentPrograms;

import java.util.Scanner;

public class DeleteElementFromArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int x = sc.nextInt();
		int arr[] = new int[x];

		System.out.println("enter the array elements");

		for (int i = 0; i < x; i++) {
			arr[i] = sc.nextInt();

		}

		for (int i = 0; i < x; i++) {

			System.out.println(arr[i]);
		}

		System.out.println("enter the array which u wnt to delete");
		int y = sc.nextInt();

		for (int i = y; i < x - 1; i++)
		// basically shorting 2->1
		{
			arr[i] = arr[i + 1];
		}
		x = x - 1;
//term nth one
		for (int i = 0; i < x; i++) {

			System.out.println(arr[i]);

		}

	}

}
