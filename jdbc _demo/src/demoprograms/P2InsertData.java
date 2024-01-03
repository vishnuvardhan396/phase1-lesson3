package demoprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class P2InsertData {
public static void main(String[] args) throws ClassNotFoundException,
SQLException {
// TODO Auto-generated method stub
// Step 1: Load the driver
Class.forName("com.mysql.cj.jdbc.Driver");
String dbURL = "jdbc:mysql://localhost:3306/movies";
String username = "root";
String password = "root";
String title = "Finding Nemo";
String genre = "comedy";
String director = "Andrew";
String release_year = "2003";
Connection con = DriverManager.getConnection(dbURL, username,
password);
PreparedStatement ps = con.prepareStatement("insert into movies values (?,?,?,?)");
ps.setString(1, title); // ps.setString(column-index, column-variable);
ps.setString(2, genre);
ps.setString(3, director);
ps.setString(4, release_year);
ps.executeUpdate();
con.close();
}

}