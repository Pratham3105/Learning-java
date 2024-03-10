import java.io.*;
public class FileWriterDemo {

	public static void main(String[] args) throws Exception  
	{
		FileWriter fw = new FileWriter("C:\\FileDemo\\Home.txt");
		String str = "Hello world this is java";
		fw.write(str);
		System.out.println("Data has been written");
		fw.close();
	}

}
