import java.sql.*;
import java.util.*;

public class JDBC5 {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo123","root","root");
			String str = "insert into table2(rollno,name,branch,cgpa) values"
					+"(?,?,?,?);"; // question mark is place holder
			PreparedStatement pstms = con.prepareStatement(str);
			Scanner sc = new Scanner(System.in);
			do
			{
				System.out.println("enter rollno :");
				int rollno = sc.nextInt();	
				
				System.out.println("enter student name :");
				String name = sc.next();	
				
				System.out.println("enter Branch of student :");
				String branch = sc.next();	
				
				System.out.println("enter cgpa of student :");
				String cgpa = sc.next();	
				
				pstms.setInt(1,rollno);
				pstms.setString(2,name);
				pstms.setString(3,branch);
				pstms.setString(4, cgpa);
				
				int i = pstms.executeUpdate();
				System.out.println("Rows Affected : "+i);
				System.out.println("Do you want to continue : y/n");
				String decision=sc.next();
				if(decision.startsWith("n"));
				{
					break;
				}
				}while(true);
		}
		catch(Exception e)
		{
			e.printStackTrace(); 	
			System.out.println(e);
		}
		
		
	}

}
