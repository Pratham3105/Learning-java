import java.util.*;
class inputdemo3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your first number");
		int a =sc.nextInt();
		
		System.out.println("enter your second number");
		int b = sc.nextInt();

		System.out.println("enter your third number");
		int c = sc.nextInt();
		
		if(a>b && a>c)
			System.out.println("biggest number is : "+a);
		else if(b>a && b>c)
			System.out.println("biggest number is : "+b);
		else if(c>a && c>b)
			System.out.println("biggest number is : "+c);
	}
}