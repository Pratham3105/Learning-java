class A
{
	void msg()
	{
		System.out.println("Hello Global");
	}
}
class B 
{
	void msg()
	{
	
		System.out.println("Hello world");
	}
}
class c extends A , B 
{
	// we can not use multiple inheritance in java
}

// signature

public class MultipleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B t = new B();
		t.msg();
	}

}
