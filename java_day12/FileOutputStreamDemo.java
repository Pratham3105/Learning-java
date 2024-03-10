import java.io.*;
public class FileOutputStreamDemo {

	public static void main(String[] args)
	{
		try
		{
			FileOutputStream fout = new FileOutputStream("C:\\FileDemo\\global123.txt");
			BufferedOutputStream b1 =new BufferedOutputStream(fout);
			String str = "Welcome to Global The Best 1234";
			byte b[]=str.getBytes();
			b1.write(b);
			System.out.println("Success");
			b1.flush();
			fout.close();
			b1.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
