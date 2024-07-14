package JDBCProgram1.javadatabaseDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteQuery {

	public static void main(String[] args) throws Exception {
		//1. Load the JDBC driver
		Class.forName("oracle.jdbc.driver.OracleDriver");


		//2. connect Java with database
		 Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","123456s");


		//3. create statement object
		    Statement st= conn.createStatement();

		//4.execute the SQL query
		        
		    String sql="delete from cust where id=16";
		  int Row =st.executeUpdate(sql);
		   System.out.println(Row +" Recored are Deleted");
	}

}
