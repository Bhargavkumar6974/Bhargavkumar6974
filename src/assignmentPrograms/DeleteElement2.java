package assignmentPrograms;

import java.util.Scanner;

public class DeleteElement2 {

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

		for (int i = 0; i < x; i++) {
			if (y == arr[i]) {
				for (int j = i; j < x - 1; j++) {

					arr[j] = arr[j + 1];
				}
			}

		} // basically shorting 2->1

		// term nth one
		for (int i = 0; i < x - 1; i++) {

			System.out.println(arr[i]);

		}

	}

}
