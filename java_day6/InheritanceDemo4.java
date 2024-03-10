class shape 
{
	// method overriding 
	// if derive class and base class function is same 
	// base class function are override
	// only print derive class function as show 
	void Area()
	{
		System.out.println("i am in shape class ");
	}
}

class Rectangle extends shape 
{
	void Area()
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println("Area of rectangle : "+c);
	}
}

class Circle extends shape
{
	void Area()
	{
		int r=10;
		double ar1=3.14*r*r;
		System.out.println("Area of circle : "+ar1);
	}
}


public class InheritanceDemo4 {

	public static void main(String[] args) {
		
		Rectangle t = new Rectangle();
		t.Area();
		Circle p = new Circle();
		p.Area();
		

	}

}
