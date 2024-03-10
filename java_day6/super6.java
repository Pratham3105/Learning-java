class AA2
{
	AA2()
	{
		System.out.println("Hello , I am base class constructor");
	}
}

class BB2 extends AA2
{
	BB2()
	{
		System.out.println("Hello , I am derived class constructor");
	}
}
public class super6 {

	public static void main(String[] args) {
		
		new BB2();
		// in default constructor , super keyword is not required
		// super is only used in parameterized constructor
	}

}
