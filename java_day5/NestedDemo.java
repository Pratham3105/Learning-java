// Nested class
class outer
{
	 private int n=100;
	class inner
	{
		int a=10;
		void msg()
		{
			System.out.println("Data id : "+n);
		}
	}
	void display()
	{
		System.out.println(n);
		// System.out.println(a); no
		// inner class variable can't be access in the outer class function
	}
}
public class NestedDemo {

	public static void main(String[] args) {
		
		outer t = new outer();
		outer.inner t2 = t.new inner();
		t2.msg();
		t.display();
		// we can't make object of inner class directly in the main fuction

	}

}
