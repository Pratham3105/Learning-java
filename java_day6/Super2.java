
class A1234 
{
	void msg()
	{
		System.out.println("Hello Global");
	}
}
class B1234 extends A1234
{
	void msg()
	{
		super.msg();
		System.out.println("Hello world");
	}
}

// signature

public class Super2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1234 t = new B1234();
		t.msg();
	}

}