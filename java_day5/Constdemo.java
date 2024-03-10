class A123
{
	int a = 10; // final int a =10;
}
class B123 extends A123
{
	void print() 
	{
	int a = 20; // variable hiding
	}
}
public class Constdemo {

	public static void main(String[] args) {
		
		B123 t = new B123();
		// System.out.println(t.a); print 20 without final keyword
		System.out.println(t.a);
	}

}
