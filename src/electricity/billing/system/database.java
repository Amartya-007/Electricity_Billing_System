package electricity.billing.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class database {
	 Connection connection;
	 Statement statement;
	
	public database() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Load the driver
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bill_system", "root", "amar");
			statement = connection.createStatement();
			System.out.println("Database connection established!"); // Log for confirmation
		} catch (Exception e) {
			e.printStackTrace(); // Show detailed error
		}
	}
	
	
}