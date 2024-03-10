
public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		/*
		int a=45;
		int b=0;
		System.out.println("Hello World");
		int c=a/b;
		int d=b/a;
		// System.out.println("Value is c is : "+c); // runtime error
		System.out.println("Hello World");
		System.out.println("Value of d is : "+d);
		
		
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[100]=30;
		
		*/
		
		int a =34;
		int b=0;
		try
		{
			int c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Hello World");
		
		int ar[]=new int[5];
		try
		{
			ar[3]=4;
			ar[9]=9;
			System.out.println(ar[9]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("Hello World");
		
		
		
		
		
		
		
	}

}
