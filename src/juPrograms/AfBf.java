package juPrograms;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;

class example {

	public int tom(int a, int b) {
		return a + b;
	}

	public int jon(int a, int b) {
		return a - b;
	}
}

public class AfBf {

	@Test
	public void test() {
		example obj = new example();
		int z = obj.tom(8, 2);
		assertEquals(10, z);
		System.out.println("value of x+y is " + z);

	}

	@Test
	public void test2() {
		example obj = new example();
		int z = obj.jon(10, 5);
		assertEquals(5, z);
		System.out.println("value of x-y is " + z);

	}

	@Before
	public void Before() {
		System.out.println(" before method ALWAYS Before");
	}

	@After
	public void After() {
		System.out.println(" After method ALWAYS After");
	}

	@BeforeClass

	public static void BeforeClass() {
		System.out.println(" beforeClass method only once Before");
	}

	@AfterClass
	public static void AfterClass() {
		System.out.println(" afterClass method only once After");
	}

}
