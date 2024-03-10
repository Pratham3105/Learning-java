class AA1
{
	AA1(String name)
	{
		System.out.println("Name is : "+name);
	}
} 
class BB1 extends AA1
{
	BB1(int a)
	{
		super("Pratham Tamrakar");
		System.out.println("value of a is : "+a);
		// super("pratham")// super constructor will be called at first line after the derived class constructor start
	}
	
	
}
public class Super4 {

	public static void main(String[] args) {
		
		BB1 t = new BB1(100);

	}

}
