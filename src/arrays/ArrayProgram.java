package arrays;

public class ArrayProgram {
	public static void main(String arg[]) {
		int a[] = { 1, 3, 65, 34, 52, 2 }; // dynamic array
		char b[] = { 'b', 'k', 'j'};

		int c[] = new int[5]; // static array
		c[0] = 4;
		c[1] = 7;
		c[2] = 2;
		c[3] = 3;
		c[4] = 5;

		for (int i = 0; i < a.length; i++) // arrayindexoutofbondsException
		{
			System.out.println(a[i]);
		}
		for (int i = 0; i < b.length; i++) // arrayindexoutofbondsException
		{
			System.out.print(b[i]);
			}
		System.out.print("\n");
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(c[3]);
		System.out.println(c[4]);

	}
}
