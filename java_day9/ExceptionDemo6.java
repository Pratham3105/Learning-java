
public class ExceptionDemo6 {

	public static void main(String[] args) {
		
		int a= 45;
		int b=5;
		int i=2;
		try
		{
		int c =a/b;
		int arr[]=new int[3];
		arr[i]=100;
		String s1 =null;
		int num =s1.length();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Hello world");
		
		
	}

}
