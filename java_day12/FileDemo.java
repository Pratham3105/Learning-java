import java.io.*;
public class FileDemo {

	public static void main(String[] args) throws Exception 
	{
		
		File f1 = new File("C:\\FileDemo\\file321.txt");
		if (f1.createNewFile())
			System.out.println("File Created");
		else 
			System.out.println("File not Created");
		

	}

}
