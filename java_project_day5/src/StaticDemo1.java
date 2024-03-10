class Counter
{
	static int count=1;
	Counter()
	{
		System.out.println(count);
		count++;
	}
}
public class StaticDemo1 {

	public static void main(String[] args) {
		Counter c1=new Counter();
		Counter c2=new Counter();
		new Counter(); // for comsturctor object making is not necessary

	}

}
