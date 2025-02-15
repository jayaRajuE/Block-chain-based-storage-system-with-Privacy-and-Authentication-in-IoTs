import java.sql.Connection;
import java.sql.DriverManager;


public class Dbcon 
{
	static Connection con;
	public Connection getConnection()
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proj20","root","root");
		System.out.println("Connected");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
		
	}

}
