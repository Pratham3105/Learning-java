interface A
{
	void show();
}

class B implements A
{
	public void show()
	{
		System.out.println("Hello");

	}
	void display()
	{
		System.out.println("hii");
	}
}
public class baseDemo332 {

	public static void main(String[] args) {
		
		A t = new B();
		t.show();
			
		

	}

}
