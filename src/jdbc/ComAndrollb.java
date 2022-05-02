package jdbc;

import java.sql.*;
import java.util.*;

public class ComAndrollb {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///mydatabase", "root", "123456789");
			con.setAutoCommit(false);

			Statement st = con.createStatement();
			Scanner sc = new Scanner(System.in);

//		String qry="create table a1(id int,name varchar(20))";
//		st.executeUpdate(qry);
			String qry1 = "INSERT INTO a1 " + "values(11,'tommy')";
			st.executeUpdate(qry1);
			System.out.println("enter whether to rollback or commit");

			String in = sc.nextLine();
			if (in.equals("rollback")) {
				con.rollback();
				System.out.println("rollbacked to previous stage");
			}

			if (in.equals("commit")) {
				con.commit();
				System.out.println("commited");
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
