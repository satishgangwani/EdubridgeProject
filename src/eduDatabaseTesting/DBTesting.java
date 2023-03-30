package eduDatabaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTesting {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loanapplication", "root", "satish123");
		System.out.println("Connected to mysql DB");
		
		Statement stmt = con.createStatement();
		
		ResultSet rs =  stmt.executeQuery("select * from customers");
		
		while(rs.next())
		{
			String first_name = rs.getString("FisrtName");
			System.out.print(first_name);
			
			System.out.print("\t");
			
			String last_name = rs.getString("LastName");
			System.out.print(last_name);
			
			System.out.print("\t");
			
			String address = rs.getString("Address");
			System.out.println(address);
			
			
			
		}
	
	}
}
