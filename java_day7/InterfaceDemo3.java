interface printable
{
	void print();
}
interface showable
{
	void show();
}
class impl3 implements printable,showable
{
	public void print()
	{
		System.out.println("Print");
	}
	public void show()
	{
		System.out.println("Show");
	}
}
public class InterfaceDemo3 {

	public static void main(String[] args) {
		
		impl3 t = new impl3();
		t.print();
		t.show();

	}

}
