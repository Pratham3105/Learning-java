import java.sql.*;


public class JDBC1 {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo123","root","root");
			Statement stmt =con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM table2");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
