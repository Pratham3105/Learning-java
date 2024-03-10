
import java.io.*;
public class FileInputStreamDemo {

	public static void main(String[] args)
	{
		try
		{
			FileInputStream fin = new FileInputStream("C:\\FileDemo\\global123.txt");
			BufferedInputStream b2 = new BufferedInputStream(fin);
			int i=0;
			while((i=b2.read())!=-1)
			{
				System.out.print((char)i);
			}
			b2.close();
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
