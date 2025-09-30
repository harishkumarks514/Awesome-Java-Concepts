package MyProject;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCExample {

	public static void main(String[] args) throws ClassNotFoundException  {
//		STEP 1 : Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		step 2 : Establish the connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/unisoft","root","root");
	
		System.out.println("connection created");
	}
}
