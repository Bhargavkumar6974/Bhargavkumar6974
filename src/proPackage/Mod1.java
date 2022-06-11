package proPackage;

public class Mod1 {

	String name;
	int sem,Id;

	public void getdata(String name, int Id, int sem) {

		this.name = name;
		this.Id = Id;
		this.sem = sem;

	}

	public void setdata() {

		System.out.println("Student's name : " + name);
		System.out.println("user collage id: " + Id);
		System.out.println("Semester:        " + sem);
	}

	public static void main(String[] args) {

	}

}
