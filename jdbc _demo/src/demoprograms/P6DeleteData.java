package demoprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P6DeleteData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String dbURL = "jdbc:mysql://localhost:3306/movies";
		String username = "root";
		String password = "root";
		String query1 = "delete from movies where title='Inside Out'" ;
		String query2 = "select * from movies";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(dbURL, username, password);
          Statement stmt = con.createStatement();
		
		stmt.executeUpdate(query1);
		
		ResultSet rs = stmt.executeQuery(query2);
		

		  while(rs.next()) {
		    	 
		    	 System.out.print("Title: " + rs.getString("title") + "\t");
		    	 System.out.print("Genre: " + rs.getString("genre") + "\t");
		    	 System.out.print("Director: " + rs.getString("director") + "\t");
		    	 System.out.println("release_year: " +rs.getString("release_year"));
		    	 
		     }
			
		con.close();
			
		
	}

}
