package assignmentPrograms;

import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr size of array");
		int x = sc.nextInt();
		int arr[] = new int[x];
		System.out.println("enetr values of array");
		for (int i = 0; i < x; i++) {
			arr[i] = sc.nextInt();
		}

		/*/System.out.print("array entered");
		for (int i = 0; i < x; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");

		System.out.print("enter the index no which u want to see");

		int y = sc.nextInt();
		System.out.print("SELECTED value at that index is  " + arr[y]);

		
		 * int y = sc.nextInt(); //VALUE REPRESENTATION
		 * 
		 * for (int i = 0; i < x; i++) { if (y == arr[i]) {
		 * System.out.print("SELECTED value at that index is  " + arr[i]);
		 * 
		 * } }
		 

	
		System.out.print("SELECTED value at that index is  " + arr[y]);
		//INDEX REPRESENTATION
*/
			int temp = 0;
			for (int i = 0; i < x; i++) 
			{
			for (int j = 0; j < x - 1 - i; j++) // ialready sorted value largest value at end
			{
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

				
			}
		}

			
			for (int i = 0; i < x; i++) {
				System.out.print(arr[i]+"\n");
			}
	}
}
