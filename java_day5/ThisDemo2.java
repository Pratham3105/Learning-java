class CurrentDemo
{
	void Area()
	{
		int length = 10;
		int width = 20;
		int ar1 = length*width;
		System.out.println("Area of rectangle : "+ar1);
	}
	void display()
	{
		this.Area();
		Area();
	}
}
public class ThisDemo2 {

	public static void main(String[] args) {
		
		CurrentDemo t=new CurrentDemo();
		t.display();
	}

}
