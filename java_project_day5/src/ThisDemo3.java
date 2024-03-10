class A
{
	A()
	{
		this(25);
		System.out.println("Hello Global");
	}
	A(int r)
	{
		// this(); // for calling current class constructor
		double ar1=3.14*r*r;
		System.out.println("Area of Circle "+ar1);
	}
}
public class ThisDemo3 {

	public static void main(String[] args) {
		
		new A(10);
		new A();
	}

}
