import java.io.*;
public class FileWriterDemo2 {

	public static void main(String[] args) throws Exception
	{
		
		FileReader fr  = new FileReader("C:\\FileDemo\\Home.txt");
		int i=0;
		while((i=fr.read())!=-1)
			{
					System.out.println((char)i);
			}
		

	}

}
