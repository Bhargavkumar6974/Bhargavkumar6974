package jdbc;

import java.sql.*;
import java.util.*;

public class SaveP {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///mydatabase", "root", "123456789");
			con.setAutoCommit(false);

			Statement st = con.createStatement();
			String qry = " insert into example " + " values(65,'ben')"; // nt inserting at the same and exact movement
																		// nly strg

			Savepoint pre = con.setSavepoint();

			st.executeUpdate(qry);

			con.rollback(pre);
			con.commit();
			System.out.println("got inserted and rolled backed also");

		}

		catch (Exception e) {
			e.printStackTrace();

		}
	}

}
