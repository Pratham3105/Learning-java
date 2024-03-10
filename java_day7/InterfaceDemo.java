interface abc // it has final static variable not instance variable 
//it has only method declaration not definition
{
	void AreaOfCircle(int r);
	void AreaOfRectangle(int l,int w);
	
}

class Impl implements abc
{
	public void AreaOfCircle(int r)
	{
		double ar1 = 3.14*r*r;
		System.out.println("Area of circle is : "+ar1);
	}
	
	public void AreaOfRectangle(int l,int w)
	{
		double ar2= l*w;
		System.out.println("Area of rectangle is : "+ar2);
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		
		Impl t = new Impl();
		t.AreaOfCircle(2);
		t.AreaOfRectangle(3, 2);;

	}

}
