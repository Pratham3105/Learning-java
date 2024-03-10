
public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		try
		{
		int a[]=new int[-9];
		}
		catch(NegativeArraySizeException e) //catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Hello World");
		
	}

}
