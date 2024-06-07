import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class sqljava {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Driver Register
		//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//		Class.forName("com.mysql.jdbc.Driver");
		
		//connection establish
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/jdbc2024","root","123456");
		//String sql="create table newadit(id int,name varchar(30),mail varchar(45) primary key)";
//		System.out.println(conn);
		System.out.println("Connection Established: "+conn);
		
//		
		//for running query
//		Statement st=conn.createStatement();
//		st.executeUpdate(sql);
//		System.out.println("table created");
//		
		//for creating database
		//st.executeUpdate("create database jdbc2024");
		
		//for showing databases
//		ResultSet rs=st.executeQuery("show databases");
//		System.out.println("Databases are: "+rs);
//		while(rs.next()) {
//			System.out.println(rs.getString(1));
//		}
		
		//for inserting values 
//		Statement st=conn.createStatement();
//		st.executeUpdate("INSERT INTO newadit VALUES (102, 'rajkumar', 'raj@gmail.com'),(103, 'King', 'kingh@gmail.com'),(104, 'venom', 'venom@gmail.com');");
//		System.out.println("Data inserted Successfully");
//		
		//for reading Values
//		Statement st=conn.createStatement();
//		ResultSet rs=st.executeQuery("Select * from newadit;");
//		
//		// Iterate through the ResultSet and print each row's data
//		while (rs.next()) {
//		 System.out.println(rs.getString("name")+" -------"+rs.getString("id")+"-------- "+rs.getString("mail"));
//		}
		
		
		//Now For Updating the Values like email update
		
		//		String updateQuery = "UPDATE newadit SET mail = 'kumarrakesh@gmail.com' WHERE id = 101;";
		//
		//		try {
		//		  Statement st = conn.createStatement();
		//		  int rowsUpdated = st.executeUpdate(updateQuery);
		//
		//		  if (rowsUpdated > 0) {
		//		    System.out.println("Successfully updated " + rowsUpdated + " rows.");
		//		  } else {
		//		    System.out.println("No rows were updated. Please check the query and ID.");
		//		  }
		//
		//		  // Close the statement (recommended)
		//		  st.close();
		//		} catch (SQLException e) {
		//		  System.out.println("Error executing update query: " + e.getMessage());
		//		}
		
		//Now We are Deleting data from table;
		//		String deleteQuery = "Delete From newadit WHERE id = 101;";
		//		
		//		try {
		//			  Statement st = conn.createStatement();
		//			  int delUpdated = st.executeUpdate(deleteQuery);
		//			  System.out.println("1 Row Deleted Successfully "+delUpdated);
		//		} catch (Exception e) {
		//			// TODO: handle exception
		//			System.out.println("Error: "+e.getMessage());
		//		}
		
		
		//Read by Id
		
		String findQuery = "Select * From newadit WHERE id = 102;";

		try {
		  Statement st = conn.createStatement();

		  // Use executeQuery for SELECT statements
		  ResultSet rs = st.executeQuery(findQuery);

		  if (rs.next()) { // Check if a row exists before printing
		    System.out.println(rs.getString("name") + " -------" + rs.getString("id") + "-------- " + rs.getString("mail"));
		  } else {
		    System.out.println("Data not found");
		  }

		  // Close the statement (recommended)
		  st.close();
		} catch (SQLException e) {
		  System.out.println("Error:---> " + e.getMessage());
		}


	}

//	
}
