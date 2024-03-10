import java.sql.*;

public class JDBC2 {

	public static void main(String[] args) {
		

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo123","root","root");
			java.sql.Statement stmt =con.createStatement();
			String str = "INSERT INTO table2 (rollno,name,branch,cgpa) values"
			+"(5002,'suresh','CSE','4.5');";
			int i = stmt.executeUpdate(str);
				System.out.println("data has been inserted");
				System.out.println("No of rows inserted :"+i);
			con.close();
					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
