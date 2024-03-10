
public class FinallyDemo {

	public static void main(String[] args) 
	{
		
		// finally block significance
		// when finally block is failed
		
		
		try
		{
			return; // all statement are skipped after the return without finally
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
