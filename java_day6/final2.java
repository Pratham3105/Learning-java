
class A12345 // if we declare class final we can not inherit it
{
	void msg() // if we declare method final we can not override it
	{
		System.out.println("Hello Global");
	}
}
class B134 extends A12345
{
	void msg()
	{
		super.msg();
		System.out.println("Hello world");
	}
}

// signature

public class final2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B134 t = new B134();
		t.msg();
	}

}