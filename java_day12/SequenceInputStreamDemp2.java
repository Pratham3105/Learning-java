
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemp2 {

	public static void main(String[] args)throws Exception
	{
		
		FileInputStream fin1 = new FileInputStream("C:\\FileDemo\\\\global.txt");
		FileInputStream fin2 = new FileInputStream("C:\\FileDemo\\\\global123.txt");
		FileOutputStream fout = new FileOutputStream("C:\\FileDemo\\pratham.txt");
		SequenceInputStream sis1 = new SequenceInputStream(fin1,fin2);
		int i=0;
		while((i=sis1.read())!=-1)
		{
			fout.write(i);
			
		}
		
	
		System.out.println("Success");
		
		fout.close();
		sis1.close();
		fin1.close();
		fin2.close();
	}

}
