
public class ExceptionDemo7 {

	public static void main(String[] args) {
		
		try
		{
			try
			{
				System.out.println("Going to divide by 0");
				int b=39/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			try
			{
				int arr[]=new int[-4];
			}
			catch(NegativeArraySizeException e)
			{
				System.out.println(e);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
