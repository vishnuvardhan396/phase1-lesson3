package demoprograms;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LessonEndProject {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/project";
		String username = "root";
		String password = "root";
		String query1 = "insert into product value(5,'laptop',10)";
		String query2 = "update product set product_id='001' where product_name='Books'" ;
		String query3 = "select * from product where product_id = 5";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(dbURL, username, password);
		
		Statement stmt = con.createStatement();
		stmt.executeUpdate(query1);
		
		stmt.executeUpdate(query2);
		
		ResultSet rs = stmt.executeQuery(query3);
		
		  while(rs.next()) {
		    	 
			  System.out.print("product_id: " + rs.getString("product_id") + "\t");
			  System.out.print("product_name: " + rs.getString("product_name") + "\t");
				System.out.println("QTY: " + rs.getString("QTY") + "\t");
		    	 
		     }
			
		con.close();		
		

	}

}


