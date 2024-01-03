package demoprograms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class P4JDBCtryCatchFinally {
public static void main(String[] args) throws SQLException {
Connection con= null;
String dbURL ="jdbc:mysql://localhost:3306/movies";
String username = "root";
String password = "root";
String query = "call SelectALLMovies()" ;
try {
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("Registered the JDBC Driver");
con =
DriverManager.getConnection(dbURL,username,password);
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery(query);
while(rs.next()) 
{
System.out.print("Title: " + rs.getString("title") + "\t");
System.out.print("Genre: " + rs.getString("genre") + "\t");
System.out.print("Director: " + rs.getString("director") +
"\t");
System.out.println("release_year: "
+rs.getString("release_year"));
}
} catch (Exception e)
{
e.printStackTrace();
}
finally {
con.close();
System.out.println("Connection closed");
}
}
}
