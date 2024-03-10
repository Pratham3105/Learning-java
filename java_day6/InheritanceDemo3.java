
class Counter123 
{
	protected int count=10;
}
class MyClass1 extends Counter123
{
	int data = 200;
}
class MyClass2 extends MyClass1
{
	void show()
	{
		System.out.println(count+" "+data);
	}
}
public class InheritanceDemo3 {

	public static void main(String[] args) {
		
		MyClass2 t = new MyClass2();
		t.show();

	}

}
