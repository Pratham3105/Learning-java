
// checked exception are not forwarded to calling chain 

class TestException
{
	void m()
	{
		// int data = 50/0;
		
		try
		{
			throw new ClassNotFoundException(); //  checked exception
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);	
		}
	}
	void p()
	{
		m();
	}
	void q()
	{
		p();
	}
	void r()
	{
		try
		{
			q();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
public class ExceptionPrapogationDemo {

	public static void main(String[] args) {
		
		TestException t = new TestException();
		t.r();
		System.out.println("Hello World");
		
	}

}
