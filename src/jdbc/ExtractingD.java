package jdbc;

import java.sql.*;

public class ExtractingD {

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // reg of driver
			// inbuilt Cl// //jar Fl
			Connection con = DriverManager.getConnection("jdbc:mysql:///mydatabase", "root", "123456789");
			// est conntion //DB url (Db server/DB name/username/password)

			Statement st = con.createStatement();// stmnt for passing a query
			String qry = "select * from customers";
			ResultSet rs = st.executeQuery(qry);// difference btw quary(display no mani) and update(data mani)
			while (rs.next()) {
				System.out.println("id is " + rs.getInt(1) + " country " + rs.getString(2));// index based
			}

		} catch (Exception e) {
			System.out.println(" an exception has occured  :" + e);
		}
	}

}
