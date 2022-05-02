package cOLLaSSignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;

class Employee {
	private int id;
	private String name;
	private String address;
	private int salary;

	public Employee(int id, String name, String address, int salary) {

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

public class SearchByEmpID {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Employee> aa = new ArrayList<>();

		aa.add(new Employee(17, "bhargav", "GKR enclave", 99999999));
		aa.add(new Employee(18, "leonardo", "32 wolf street", 1000000));
		aa.add(new Employee(3232, "ronaldo", "mancesters", 11111111));
		aa.add(new Employee(4517, "tom cruze", "ukraine", 1009999));
		aa.add(new Employee(917, "Vd", "india", 10));

		Iterator<Employee> itr = aa.iterator();
		System.out.println("enter the employee id to search");
		int searchId = scan.nextInt();

		while (itr.hasNext())

		{
			Employee xVar = itr.next();
			if (xVar.getId() == searchId) {
				System.out.println(xVar);

			}
		}

	}

}
