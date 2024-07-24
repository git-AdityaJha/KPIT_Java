package company.jdbc;

import java.sql.*;

public class SelectTest {

	public static void main(String[] args) {
		Connection conn;

		try {
			// Driver Manager registered here 
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered...");
			
			// Connection is established to database using Driving Manager
			conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			System.out.println("Connected to database...");
			
			// Taking user inputs here
			int deptNumber = 123;
			
			// Statement is created here 
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from dept_master where dept_no="+deptNumber);
			
			// Traversing through the result set and printing 
			while(rs.next()) {
				System.out.println("---------------------");
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
