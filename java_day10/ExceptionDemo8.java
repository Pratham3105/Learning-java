class ExcDemo
{
	void Account(int balance)
	{
		if(balance<0)
		{
			throw new ArithmeticException();
		}
		System.out.println(balance);
	}
}
public class ExceptionDemo8 {

	public static void main(String[] args) {
		
		ExcDemo t = new ExcDemo();
		try
		{
			t.Account(-1000);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Negative Value :"+e);
		}
		
	}

}
