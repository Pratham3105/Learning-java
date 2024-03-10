class Area1
{
	Area1(int r)
	{
		double area1=3.141*r*r;
		System.out.println("Area of Circle: "+area1);
	}
	Area1(int r,int h)
	{
		double volume=3.141*r*r*h;
		System.out.println("Volume of Cyllinder: "+volume);
	}
	Area1(double length,double width)
	{
		double area2=length*width;
		System.out.println("Area of Rectangle :"+area2);
	}
}
public class ConstrutorOverloadDemo {

	public static void main(String[] args) {
		new Area1(5);
		new Area1(5,6);
		new Area1(2.5,3.6);

	}

}
