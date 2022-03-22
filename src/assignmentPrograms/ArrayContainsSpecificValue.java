package assignmentPrograms;

import java.util.Scanner;

public class ArrayContainsSpecificValue {

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);

		int arr[] = { 112, 23, 63, 44, 95, 16, 27, 78, 549, 4410 };
		System.out.println("enter the value u want to check");
		int x = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (x == arr[i]) {
				System.out.println("number found  " + arr[i]);
				break;
			} else {
				System.out.println("number not found  ");
				break;

			}
		}
	}

}
