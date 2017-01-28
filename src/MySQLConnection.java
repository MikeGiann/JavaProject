import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MySQLConnection {
	public static Connection getConnection() throws Exception
	{
		try{
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/test";
			String dbusername = "root";
			String dbpassword = "";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url,dbusername,dbpassword);
			
			System.out.println("Connected");
			return conn;

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return null;
	}
}
