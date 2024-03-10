class Final123
{
	final int a=100; // final turns the variable into constant
	void change()
	{
		System.out.println(a);
		// a=1; // error beacuse of final
		System.out.println(a);
	}
}
public class Final1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final123 t = new Final123();
		t.change();

	}

}
