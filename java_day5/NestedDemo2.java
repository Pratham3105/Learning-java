// Nested class

class outer1
{
	 private int n=100;
	class inner1
	{
		int a=10;
		void msg()
		{
			System.out.println("Data id : "+n);
		}
	}
	void display()
	{
		inner1 in = new inner1();
		in.msg();
	}
}
public class NestedDemo2 {

	public static void main(String[] args) {
		
		outer1 t = new outer1();
		t.display();
		
		// we can't make object of inner class directly in the main fuction

	}

}
