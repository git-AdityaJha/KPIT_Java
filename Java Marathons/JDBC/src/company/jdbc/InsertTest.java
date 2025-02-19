package company.jdbc;

import java.sql.*;

import company.dept.Department;

public class InsertTest {

	public static void main(String[] args) {
		Connection conn;

		try {
			// Driver Manager registered here 
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered...");
			
			// Connection is established to database using Driving Manager
			conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			System.out.println("Connected to database...");
			
			// Creating object of Department class :
			Department deptObj = new Department();
			// Taking manual inputs using getter method : 
			deptObj.setDeptNumber(127);        
			deptObj.setDeptName("CS");
			deptObj.setDeptLocation("Goa");
			
			// Statement is prepared for the query 
			PreparedStatement pst = conn.prepareStatement("insert into dept_master values (?,?,?)");
			pst.setInt(1, deptObj.getDeptNumber());
			pst.setString(2, deptObj.getDeptName());
			pst.setString(3, deptObj.getDeptLocation());
			
			// Query executed
			int row = pst.executeUpdate();
			
			System.out.println("Query Executed");
			System.out.println(row + " row inserted !");
			
			pst.close();
			conn.close();
		}
		catch(SQLException e) { // handling sql exception here
			e.printStackTrace();
		}
	}
}
