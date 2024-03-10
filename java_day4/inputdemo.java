import java.util.*;  // already have java.lan pakage ( system )
class inputdemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		int c=a+b;
		System.out.println("sum is : "+c);
	}
}