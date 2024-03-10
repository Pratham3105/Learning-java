
// method overloading

class Areashape
{
	void area(int r) // formal parameter 
	{
		double ar1 = 3.14*r*r;
		System.out.println("Area of a cicle : "+ar1);
	}
}
class Areashape2 extends Areashape
{
	void area(int l,int w)
	{
		double ar2 = l*w;
		System.out.println("Area of a rectangle : "+ar2);
		
	}
}
class Areashape3 extends Areashape2
{
	void area(int h , int r ,int a)
	{
		double ar3 = 3.14*r*r*h;
		System.out.println("Area of the cylinder : "+ar3+ " value of a is : "+a);
	}
	
	void area(double r)
	{
		double  ar3 = 3.14*r*r*r;
		System.out.println("Area of a sphere : "+ar3);
		
	}
}
public class OverloadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Areashape3 t = new Areashape3();
		t.area(2);
		t.area(23,20);
		t.area(23, 10, 3450); // Actual parameter
		t.area(3.14);
		

	}

}
