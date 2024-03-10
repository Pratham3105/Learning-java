import java.util.*;
class inputdemo2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String name =sc.nextLine();
		
		System.out.println("enter your height");
		double height = sc.nextDouble();

		System.out.println("enter your weight");
		int weight = sc.nextInt();
		
		System.out.println(name+" "+height+" "+weight);
	}
}