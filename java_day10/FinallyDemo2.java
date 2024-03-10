
public class FinallyDemo2{

	public static void main(String[] args) 
	{
		
		// finally block significance
		// when finally block is failed
		
		
		try
		{
			System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured : "+e);
		}
		finally // finally block is always executed ex. return
		{
			System.out.println("Finally");
		}
	}

}
