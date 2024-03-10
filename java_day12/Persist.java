import java.io.*;
public class Persist {

	public static void main(String[] args) {
		
		try
		{
			Student st1 = new Student(147,"pratham_tam");
			FileOutputStream fout = new FileOutputStream("C:\\FileDemo\\SerializeDemo.txt");
			ObjectOutputStream os1 = new ObjectOutputStream(fout);
			os1.writeObject(st1);
			os1.flush();
			//os1.close();
			System.out.println("Object has been Serialized");
			
		}
		catch(Exception e )
		{
			System.out.println(e);
		}

	}

}
