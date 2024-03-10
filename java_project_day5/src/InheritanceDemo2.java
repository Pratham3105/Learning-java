class A1
{
	void print() 
	{	System.out.println("Hello world");
	}
}

class B1 extends A1
{
	void print2(){
	System.out.println("Hello Global");
}
}

class C1 extends B1
{
	void print3()
	{
	System.out.println("Hello Pratham");
}
}

class D1 extends C1
{
	void print4()
	{
		System.out.println("Hello");
	}
}
public class InheritanceDemo2 {

	public static void main(String[] args) {
		
		D1 t = new D1();
		t.print();
		t.print2();
		t.print4();
		t.print3();

	}

}
