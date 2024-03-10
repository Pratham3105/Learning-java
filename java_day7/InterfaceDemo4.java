
interface printable1
{
	void print();
}
interface showable1 extends printable1
{
	void show();
}
class impl32 implements showable1 
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
public class InterfaceDemo4 {

	public static void main(String[] args) {
		
		impl32 t = new impl32();
		t.print();
		t.show();

	}

}
