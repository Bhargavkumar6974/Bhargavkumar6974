package jdbc;

import java.util.*;
import java.sql.*;

public class PreStmnt {

	public static void main(String[] args) throws SQLException {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver"); // reg of driver
			// inbuilt Cl// //jar Fl
			Connection con = DriverManager.getConnection("jdbc:mysql:///mydatabase", "root", "123456789");
			// est conntion //DB url (Db server/DB name/username/password)

			Statement st = con.createStatement();// stmnt for passing a query
			String qry = "insert into customers(ID,name,COUNTRY,phone_no,POSTAL_NO) values(?,?,?,?,?)";
			PreparedStatement in = con.prepareStatement(qry);
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);

			System.out.println("enter id");
			int id = sc1.nextInt();

			System.out.println("enter name");

			String name = sc2.nextLine();
			System.out.println("enter country");
			String country = sc2.nextLine();
			System.out.println("enter phone");
			int phone = sc1.nextInt();
			System.out.println("enter postal");
			int postal = sc1.nextInt();

			in.setInt(1, id);
			in.setString(2, name);
			in.setString(3, country);
			in.setInt(4, phone);
			in.setInt(5, postal);
			int i = in.executeUpdate();
			if (i > 0) {
				System.out.println("values inserted");
			} else {
				System.out.println("values not inserted");
			}

		} catch (Exception e) {
			System.out.println(" an exception has occured  :" + e);
		}
	}

}
