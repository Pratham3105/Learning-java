import java.io.*;
public class SequenceInputStreamDemp {

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fin1 = new FileInputStream("C:\\FileDemo\\\\global.txt");
		FileInputStream fin2 = new FileInputStream("C:\\FileDemo\\\\global123.txt");
		
		SequenceInputStream sis1 = new SequenceInputStream(fin1,fin2);
		int i=0;
		int count =0;
		//while((i=sis1.read())!=-1)
		//{
		//	System.out.print((char)i);
			
		//}
		while((i=fin1.read())!=-1)
		{
			System.out.print((char)i);
			count++;
			
		}
		System.out.println();
		System.out.println(count);
		
		sis1.close();
		fin1.close();
		fin2.close();
		
		
	}

}
