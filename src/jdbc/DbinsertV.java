package jdbc;

import java.sql.*;

public class DbinsertV {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // driver reg
			Connection cn = DriverManager.getConnection("jdbc:mysql:///mydatabase", "root", "123456789");
//est connection

			Statement st = cn.createStatement();
//stmt for quary
			String qry = "insert into customers(ID,name,COUNTRY,phone_no,POSTAL_NO) values(17,'vladmir putin','russia',21342342,70000) ";
			int i = st.executeUpdate(qry);
			if (i > 0) {
				System.out.println("values inserted");
			} else {
				System.out.println("values not inserted");
			}
		} catch (Exception e) {
			System.out.println("an exception has occured :" + e);
		}

	}

}
