
class AA11
{
	AA11(String name)
	{
		System.out.println("Name is : "+name);
	}
	AA11(int l ,int w)
	{
		double ar1 = l*w;
		System.out.println("area is : "+ar1);
	}
} 
class BB11 extends AA11
{
	BB11(int a)
	{
		//super("Pratham Tamrakar");
		super(10,20);
		System.out.println("value of a is : "+a);
		// super("pratham")// super constructor will be called at first line after the derived class constructor start
	}
	BB11()
	{
		//super(10,20);
		super("Pratham Tamrakar");
		System.out.println("hello");
		
	}
	
	
}
public class Super5 {

	public static void main(String[] args) {
		
		BB11 t = new BB11(100);
		new BB11();

	}

}
