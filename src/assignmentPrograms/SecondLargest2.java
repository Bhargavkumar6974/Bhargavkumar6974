package assignmentPrograms;

import java.util.Scanner;

public class SecondLargest2 {

	public static void main(String[] args)

	{

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int x = sc.nextInt();
		int arr[] = new int[x];

		System.out.println("enter the array elements");

		for (int i = 0; i < x; i++) {
			arr[i] = sc.nextInt();

		}

		int largest = Integer.MIN_VALUE;// -2147483648
		int seclargest = Integer.MIN_VALUE;
		// 3 4 5 4
		for (int i = 0; i < x; i++) {
			if (arr[i] > largest) {
				seclargest = largest;
				largest = arr[i];

			}
			if (arr[i] != largest && arr[i] >= seclargest) {
				seclargest = arr[i];
			}
		}

		System.out.println("second largest value  " + seclargest);

	}

}
