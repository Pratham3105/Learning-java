class box
{
	class pt
	{
		 static void wrapper()
		{
			System.out.println("hello");
		}
	}
}
public class WrapperClassDemo2 {

	public static void main(String[] args) {
		
		// autoboxing
		int a =20;
		Integer i = Integer.valueOf(a);// primitive to wrapper
		System.out.println(i);
		
		box.pt.wrapper();
		
		Integer b =60;
		int j = b.intValue(); // UnBoxing ( Wrapper to primitive )
		System.out.println(j);
		
		

	}

}
