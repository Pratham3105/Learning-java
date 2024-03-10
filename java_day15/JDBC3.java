import java.sql.*;

public class JDBC3 {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo123","root","root");
			java.sql.Statement stmt =con.createStatement();
			String str = "create table myTable"
					+"(id int primary key,"
					+"empName varchar(50) not null);";
			stmt.execute(str);
				System.out.println("table has been created");
			con.close();
					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		
	}

}
