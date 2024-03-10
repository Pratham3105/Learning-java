abstract class shape
{
	void show()
	{
		System.out.println("Welcome to java");
	}
	abstract void draw();
}
class ImplementDemo extends shape
{
	void Display()
	{
		System.out.println("Welcome to Global");
	}
	
	void draw()
	{
		System.out.println("I am Circle");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		
		ImplementDemo t = new ImplementDemo();
		t.Display();
		t.draw();
		t.show();

	}

}
