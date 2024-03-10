class demo1
{
	void Area_of_rectangle(int length,int width)
	{
		int area= length*width;
		System.out.println("Area of a rectangle "+area);
	}
}
class classdemo
{
	public static void main(String args[])
	{
		demo1 t=new demo1();
		t.Area_of_rectangle(10,20);
	}
}
		