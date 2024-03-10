class LocalInner
{
	private int n =100;
	void display()
	{
		class Local // local inner class 
		{
			 void msg()
			 {
				 System.out.println(n);
			 }
		}
		
		Local t = new Local();
		t.msg();
		
		// local inner class exist only in function 
		// local inner class object is only make in the function body
	}
	
}
public class NestedDemo3 {

	public static void main(String[] args) {
		
	LocalInner p = new LocalInner();
	p.display();

	}

}
