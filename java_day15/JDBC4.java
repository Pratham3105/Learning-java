import java.sql.*;

public class JDBC4 {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo123","root","root");
			java.sql.Statement stmt =con.createStatement();
			String str = "create table myTable1"
					+"(id int primary key,"
					+"empName varchar(50) not null);";
			stmt.execute(str);
			System.out.println("table has been created");
			String str1 = "INSERT INTO myTable1(id,empName) values"
					+"(5002,'suresh'),"
					+"(5003,'mahak');";
			int i = stmt.executeUpdate(str1);
			System.out.println("data has been inserted");
			System.out.println("No of rows inserted :"+i);
			ResultSet rs = stmt.executeQuery("SELECT * FROM myTable1");
			while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2));
				}
			con.close();
					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
