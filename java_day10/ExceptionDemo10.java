class ExcDemo2
{
	void operation() throws ClassNotFoundException
	{
		throw new ClassNotFoundException();
	}
	void Account() throws InterruptedException
	{
		throw new InterruptedException();
	}
}
public class ExceptionDemo10 {

	public static void main(String[] args) throws ClassNotFoundException, InterruptedException 
	{
		ExcDemo2 t = new ExcDemo2();
		//t.operation();
		//t.Account();
		
		try
		{
			t.operation();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		
		try
		{
			t.Account();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
		System.out.println("hello world");
	
		
		
		
		// after throw all statements are unreachable
		
	}

}
