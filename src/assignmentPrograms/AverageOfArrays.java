package assignmentPrograms;

import java.util.Scanner;

public class AverageOfArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your arrays");
		int x = scan.nextInt();

		double[] arr = new double[x];
		double sum = 0;
		double average = 0;
		System.out.println("enter your arrays values");
		for (int i = 0; i < x; i++) {
			arr[i] = scan.nextDouble();
		}

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		average = (sum / x);
		System.out.println(average);

	}

}
