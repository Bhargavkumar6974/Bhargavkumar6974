package jdbc;

import java.sql.*;

public class Dbprogram1 {

	public static void main(String[] args) throws SQLException{

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // reg of driver
			// inbuilt Cl// //jar Fl
			Connection con = DriverManager.getConnection("jdbc:mysql:///mydatabase","root","123456789");
			// est conntion //DB url (Db server/DB name/username/password)

			Statement st = con.createStatement();// stmnt for passing a query
			String qry = "create table ex(id int,name varchar(20),country varchar(20))";
			st.executeUpdate(qry);
		} catch (Exception e) {
			System.out.println(" an exception has occured  :" + e);
		}
	}

}
