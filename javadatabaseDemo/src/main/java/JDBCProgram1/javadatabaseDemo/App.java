package JDBCProgram1.javadatabaseDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{


	//1. Load the JDBC driver
	Class.forName("oracle.jdbc.driver.OracleDriver");


	//2. connect Java with database
	 Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","123456s");


	//3. create statement object
	    Statement st= conn.createStatement();

	//4.execute the SQL query
	        
	    String sql="insert into cust values(20,'Girish','Chennai')";
	   st.executeUpdate(sql);
	   
	}
}