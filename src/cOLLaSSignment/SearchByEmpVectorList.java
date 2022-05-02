package cOLLaSSignment;


	


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;

class Employee2 {
	private int id;
	private String name;
	private String address;
	private int salary;

	public Employee2(int id, String name, String address, int salary) {

		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}

public class SearchByEmpVectorList {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Vector<Employee2> aa = new Vector<>();

		aa.add(new Employee2(17, "bhargav", "GKR enclave", 99999999));
		aa.add(new Employee2(18, "leonardo", "32 wolf street", 1000000));
		aa.add(new Employee2(3232, "ronaldo", "mancesters", 11111111));
		aa.add(new Employee2(4517, "tom cruze", "ukraine", 1009999));
		aa.add(new Employee2(917, "Vd", "india", 10));

		Iterator<Employee2> itr = aa.iterator();
		System.out.println("enter the employee id to search");
		int searchId = scan.nextInt();

		while (itr.hasNext())

		{
			Employee2 xVar = itr.next();
			if (xVar.getId() == searchId) {
				System.out.println(xVar);

			}
		}

	}

}
