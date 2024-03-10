import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputandOutputStream {

	public static void main(String[] args) {
		
		try
		{
			FileInputStream fin = new FileInputStream("C:\\FileDemo\\global123.txt");
			FileOutputStream fout = new FileOutputStream("C:\\FileDemo\\global123.txt");
			String str = "Welcome to Global The Best 34 ";
			String str1 = "Welcome to Global The Best 3";
			byte b[]=str.getBytes();
			byte b1[]=str1.getBytes();
			fout.write(b);
			fout.write(b1);
			int i=0;
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
			}
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		
	}

}
