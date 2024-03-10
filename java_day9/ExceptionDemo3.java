
public class ExceptionDemo3 {

	public static void main(String[] args) {
		
		String s1 = "100";
		String s2 = "200";
		int a = Integer.parseInt(s1); // string(compatible) to integer 
		int b = Integer.parseInt(s2);
		int c =a+b;
		
		System.out.println(c);
		
		String s3 = "pratham";
		try
		{
		int a2 = Integer.parseInt(s3);
		}
		catch(NumberFormatException e)
		{
			//System.out.println(e);
			System.out.println("conversion not valid");
		}
		System.out.println("Hello World");

	}

}
