package company.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectAllTest {

	public static void main(String[] args) {
		Connection conn;

		try {
			// Driver Manager registered here 
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered...");
			
			// Connection is established to database using Driving Manager
			conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			System.out.println("Connected to database...");
			System.out.println("---------------------");
			
			// Statement is created here 
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from dept_master");
			
			// Traversing through the result set and printing 
			while(rs.next()) {
				System.out.println("DEPT NUMBER : "+ rs.getInt(1));
				System.out.println("DEPT NAME : "+ rs.getString(2));
				System.out.println("DEPT LOCATION : "+ rs.getString(3));
				System.out.println("---------------------");
			}
		}
		catch(SQLException e) { // handling sql exception here
			e.printStackTrace();
		}
	}

}
