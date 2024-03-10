// unchecked exception
import java.io.*;
public class ExceptionDemo9 {

	public static void main(String[] args) {
		
		try
		{
		throw new ClassNotFoundException();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		
		try 
		{
			throw new IOException();
		}
		catch(IOException e) 
		{
			System.out.println(e);
		}
	}

}
