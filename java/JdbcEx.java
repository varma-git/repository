//JDBC example for retrieving data from database
import java.sql.*;
class JdbcEx
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("org.h2.Driver");
		Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/varma","sa","sa");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from student");
		while(rs.next())
		{
			System.out.println(rs.getInt("STDID")+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}
		con.close();
	}
}