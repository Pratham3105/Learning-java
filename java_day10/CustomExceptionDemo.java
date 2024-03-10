// userdefined Exception
class MyException extends Exception
{
	MyException(String str)
	{
		super(str);
	}
}
class CustomDemo1
{
	void validateAge(int age) throws MyException 
	{
		if(age<18)
		{
			throw new MyException("Age is not valid"); // custom exception are always checked exception
		}
		else 
		{
			System.out.println("elligible to voting");
		}
	}
}
public class CustomExceptionDemo 

{

	public static void main(String[] args) throws MyException
	{
		
		CustomDemo1 t =new CustomDemo1();
		try
		{
		t.validateAge(13);
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
		System.out.println("elligible to voting");
		

	}

}
