package demoprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class p1fetch {
	
	public static void main(String[] args) throws ClassNotFoundException,
	SQLException {
	// Step 1: register the JDBC driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Registered the JDBC Driver");
	// Step 2: Establish the connection with mysql Database
	// use class DriverManager and method
	getConnection(dbURL,username,password);
	String dbURL = "jdbc:mysql://localhost:3306/movies";
	String username = "root";
	String password = "root";
	String query = "select * from movies" ;
	Connection con = DriverManager.getConnection(dbURL,username,password);
	System.out.println("Connection successful");
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery(query);
	while(rs.next()) {
	System.out.print("Title: " + rs.getString("title") + "\t");
	System.out.print("Genre: " + rs.getString("genre") + "\t");
	System.out.print("Director: " + rs.getString("director") + "\t");
	System.out.println("release_year: " +rs.getString("release_year"));
	}
	// step 4: close connection with DB
	con.close();
	System.out.println("Connection closed");

	}

}
