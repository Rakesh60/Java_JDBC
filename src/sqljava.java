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
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/jdbc2024","root","");
		String sql="create table newadit(id int,name varchar(30),mail varchar(45) primary key)";
//		System.out.println(conn);
		System.out.println("Connection Established: "+conn);
		
//		
		//for running query
		Statement st=conn.createStatement();
		st.executeUpdate(sql);
		System.out.println("table created");
		
		//for creating database
//		st.executeUpdate("create database jdbc2024");
		
		//for showing databes
//		ResultSet rs=st.executeQuery("show databases");
//		System.out.println("Databases are: "+rs);
//		while(rs.next()) {
//			System.out.println(rs.getString(1));
//		}
		
	}
	
}
