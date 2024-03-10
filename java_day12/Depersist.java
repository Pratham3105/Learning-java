import java.io.*;
public class Depersist {

	public static void main(String[] args) {
		
		try
		{
			FileInputStream fs1 = new FileInputStream("C:\\FileDemo\\SerializeDemo.txt");
			ObjectInputStream objin = new ObjectInputStream(fs1);
			Student s = (Student)objin.readObject();
			s.id= 155;
			s.name ="Rajshri";
			System.out.println(s.id+" "+s.name);
			objin.close();
			fs1.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
